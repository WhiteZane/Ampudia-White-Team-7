/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author ghosty
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = Andromeda.getInfile();
    protected final PrintWriter console = Andromeda.getOutFile();

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            //this.console.println(this.displayMessage);
            String input = this.getInput();
            if (input.toUpperCase().equals("E")) {
                return;
            }
            done = this.doAction(input);
        } while (!done);
    }

    @Override
    public String getInput() {

        // get from keyboard
        String value = ""; //value returned
        boolean valid = false; //initalize not valid

        while (!valid) { //loop when invalid value is entered
            this.console.println("\n" + this.displayMessage);
            try {
                value = this.keyboard.readLine(); // get next line typed
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), value);
            }
            value = value.trim();

            if (value.length() < 1) {//value is blank
                ErrorView.display(this.getClass().getName(), "Value can not be blank.");
                continue;
            }
            break; //end loop
        }

        return value; // return entered value
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        return true;
    }
}
