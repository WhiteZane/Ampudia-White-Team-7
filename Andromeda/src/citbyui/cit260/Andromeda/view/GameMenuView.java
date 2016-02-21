/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;


import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class GameMenuView {

    public void displayMenu() {
        //System.out.println("\n*** displayMenu stub function called ***");
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    private String menu;

    public GameMenuView() {
        this.menu = "…………………………………………………………………………………"
                + "\n  Game Menu"
                + "\n…………………………………………………………………………………"
                + "\nM : Move to location "
                + "\nV : View Ship Status "
                + "\nT : Talk to Crew Members"
                + "\nC : Check Logbook"
                + "\nS : Save Game"
                + "\nE : Exit to Main Menu";
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get from keyboard
        String value = ""; //value returned
        boolean valid = false; //initalize not valid

        while (!valid) { //loop when invalid value is entered
            System.out.println(menu);

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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "M":
                this.moveToLocation();
                break;
            case "V":
                this.viewShipStatus();
                break;
            case "T":
                this.talkToCrew();
                break;
            case "C":
                this.checkLogbook();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                this.exit();
                break;
            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void moveToLocation() {
        System.out.println("*** moveToLocation function called ***");
    }

    private void viewShipStatus() {
        System.out.println("*** viewShipStatus function called ***");
    }

    private void talkToCrew() {
        System.out.println("*** talkToCrew function called ***");
    }

    private void checkLogbook() {
        System.out.println("*** checkLogbook function called ***");
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    private void exit() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}
