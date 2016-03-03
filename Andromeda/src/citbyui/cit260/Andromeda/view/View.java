/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import java.util.Scanner;

/**
 *
 * @author ghosty
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        do {
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("E")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); // get from keyboard
        String value = ""; //value returned
        boolean valid = false; //initalize not valid

        while (!valid) { //loop when invalid value is entered
            System.out.println("\n"+this.displayMessage);

            value = keyboard.nextLine(); // get next line typed
            value = value.trim();

            if (value.length() < 1) {//value is blank
                System.out.println("\n\t*** Error *** Value can not be blank.");
                continue;
            }
            break; //end loop
        }
        return value; // return entered value
    }

    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
     return true;
    }
    
    
}
