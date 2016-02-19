/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import byui.cit260.andromeda.control.GameControl;
import byui.cit260.andromeda.model.Player;
import java.util.Scanner;

/**
 *
 * @author ghosty
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        //display banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n**************************"
                + "\n*                       *"
                + "\n Description Here       *"
                + "\n*                       *"
                + "\n*************************"
        );

    }

    public void displayStartProgramView() {
        //System.out.println("\n*** displayStartProgram() function called ***");

        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {

        Scanner keyboard = new Scanner(System.in); // get from keyboard
        String value = ""; //value returned
        boolean valid = false; //initalize not valid

        while (!valid) { //loop when invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed
            value = value.trim();

            if (value.length() < 1) {//value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; //end loop
        }
        return value; // return entered value
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in lenght.");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            System.out.println("\nError creating the player");
            return false;
        }

        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n========================"
                + "\n Welcome " + player.getName()
                + "\n Have fun"
                + "\n========================"
        );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}
