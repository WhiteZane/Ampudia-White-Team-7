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
public class LocationMenuView {
    
    public void displayLocationMenu(String toPlanet) {

        boolean done = false;
        do {
            String menuOption = this.getLocationOption();
            if (menuOption.toUpperCase().equals("E")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String menuLocation;
    
    public LocationMenuView(String toPlanet) {
        this.menuLocation 
                = "\n……………………………………………………………………………………………………………"
                + "\n  Current Location: "+ toPlanet+" "
                + "\n……………………………………………………………………………………………………………"
                + "\nL : Explore location "
                + "\nF : Fortify/Repair Excelsior "
                + "\nA : Armor reinforcment"
                + "\nB : Buy/Create weapons"
                + "\nR : Recruit new crew members"
                + "\nE : Return to Excelsior ";
    }

    private String getLocationOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.println(menuLocation);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n*** Error *** Value can not be blank.");
                continue;
            }
            break; //end loop
        }
        return value; // return entered value
    }
    String fromPlanet = "";

    private boolean doAction(String locationOption) {

        locationOption = locationOption.toUpperCase();

        switch (locationOption) {
            case "L":
                this.exploreLocation();
                break;
            case "F":
                this.repairFortify();
                break;
            case "A":
                this.armorReinforce();
                break;
            case "B":
                this.createWeapons();
                break;
            case "R":
                this.recruitMembers();
                break;
                /*case "E":
                this.exit(fromPlanet);
                break;*/
            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    public void displayExitMenu() {

        boolean done = false;
        do {
            String menuOption = this.getExitMenuOption();
            if (menuOption.toUpperCase().equals("")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getExitMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean isValid = true;

        while (isValid) {
            System.out.println("\n[Hit enter to continue]");

            value = keyboard.nextLine();
            value = "";

            break;
        }
        return value;
    }

    private void exploreLocation() {
        System.out.println("*** exploreLocation function called ***");
    }

    private void repairFortify() {
        //System.out.println("*** repairFortify function called ***");
        RepairShip repairs;
        repairs = new RepairShip();
        repairs.displayRepairMenu();
    }

    private void armorReinforce() {
        System.out.println("*** armorReinforce function called ***");
    }

    private void createWeapons() {
        System.out.println("*** createWeapons function called ***");
    }
    
    private void recruitMembers() {
        System.out.println("*** recruitMembers function called ***");
    }

    /*private void exit() {
    //System.out.println("*** leadQuitGame function called ***");
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.displayMainMenuView();
    }*/
}
