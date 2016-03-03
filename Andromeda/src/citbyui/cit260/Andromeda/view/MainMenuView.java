/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class MainMenuView extends View {

    //private String promptMessage;
    /*public void displayMainMenuView() {
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }*/

    //private String menu;

    public MainMenuView() {
        super( "…………………………………………………………………………………"
                + "\n  Main Menu"
                + "\n…………………………………………………………………………………"
                + "\nG : Start new game "
                + "\nL : Load saved game "
                + "\nH : How to play"
                + "\nE : Exit game"
                + "\n"
                + "\n1 : Calculate Planets Distance");
    }

    /*private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get from keyboard
        String value = ""; //value returned
        boolean valid = false; //initalize not valid

        while (!valid) { //loop when invalid value is entered
            System.out.println(menu);

            value = keyboard.nextLine(); // get next line typed
            value = value.trim();

            if (value.length() < 1) {//value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; //end loop
        }
        return value; // return entered value
    }*/

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "G":
                this.startNewGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.howToPlay();
                break;
                /*case "E":
                this.quitGame();
                break;*/

            case "1":
                this.calculation();
                break;

            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Andromeda.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("*** loadSavedGame function called ***");
    }

    private void howToPlay() {
        HelpMenuView helpMenu;
        helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    /*private void quitGame() {
    System.out.println("*** quitGame function called ***");
    }*/

    private void calculation() {
        CalcDistanceView view = new CalcDistanceView();
        view.displayCalcDistanceView();
    }
}
