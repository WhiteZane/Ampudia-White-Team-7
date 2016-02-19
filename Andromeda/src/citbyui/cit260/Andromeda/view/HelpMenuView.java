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
public class HelpMenuView {
    
public void displayHelpMenu() {
        //System.out.println("\n*** displayMenu stub function called ***");
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }
    private String menuHelp;

    public HelpMenuView() {
        this.menuHelp = "\n"
                + "\n----------"
                + "\n Help Menu"
                + "\nG : What is your goal? "
                + "\nS : Ship status explanation and upgrades "
                + "\nR : Recruiting Crew Members"
                + "\nA : About Enemies"
                + "\nE : Exit to Main Menu"
                + "\nE : Exit to Main Menu";
    }

    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get from keyboard
        String value = ""; //value returned
        boolean valid = false; //initalize not valid

        while (!valid) { //loop when invalid value is entered
            System.out.println(menuHelp);

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

    private boolean doAction(String helpOption) {
        
        helpOption = helpOption.toUpperCase();
        
        switch (helpOption){
            case "G":
                this.goal();
                break;
            case "S":
                this.shipStatus();
                break;
            case "R":
                this.crewMembers();
                break;
            case "A":
                this.aboutEnemy();
                break;
            case "E":
                this.exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void goal() {
        System.out.println("***leadAGoal function called ***");
    }

    private void shipStatus() {
        System.out.println("***leadAShipStatus function called ***");
    }

    private void crewMembers() {
        System.out.println("***leadRCrewMembers function called ***");
    }

    private void aboutEnemy() {
        System.out.println("***leadAbout Enemy function called ***");
    }

    private void exit() {
        System.out.println("***leadQuitGame function called ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }    

}
