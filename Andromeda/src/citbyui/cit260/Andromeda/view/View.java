/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghosty
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = Andromeda.getInfile();
    protected final PrintWriter console = Andromeda.getOutfile();

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            this.console.println(this.displayMessage);
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

        try {

            while (!valid) { //loop when invalid value is entered
                this.console.println("\n" + this.displayMessage);

                value = this.keyboard.readLine(); // get next line typed

                value = value.trim();

                if (value.length() < 1) {//value is blank
                    ErrorView.display(this.getClass().getName(),"\n\t*** Error *** Value can not be blank.");
                    continue;
                }
                break; //end loop
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
            return null;
        }

        return value; // return entered value
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        return true;
    }
}
