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

        boolean done = false;
        do {
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("E")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String menuHelp;

    public HelpMenuView() {
        this.menuHelp = "…………………………………………………………………………………"
                + "\n  Help Menu"
                + "\n…………………………………………………………………………………"
                + "\nG : What is your goal? "
                + "\nS : Ship status explanation and upgrades "
                + "\nR : Recruiting Crew Members"
                + "\nA : About Enemies"
                + "\nE : Exit to Main Menu";
    }

    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.println(menuHelp);

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

    private boolean doAction(String helpOption) {

        helpOption = helpOption.toUpperCase();

        switch (helpOption) {
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

    private void goal() {
        System.out.println(
                "\n\t∞∞∞ What is Your Goal? ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\nYour goal is to travel through uncharted planets, defeat enemies"
                + "\nyou might encounter, and reach the Andromeda Galaxy."
                + "\n"
                + "\n*** More details can be added later ***");

        HelpMenuView exitMenu = new HelpMenuView();
        exitMenu.displayExitMenu();
    }

    private void shipStatus() {
        System.out.println(
                "\n\t∞∞∞ Ship Status Explanation and Upgrades ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\nDuring the game, you will face space pirates in space battle."
                + "\nYou will need to be prepared by upgrading your spaceship, repair"
                + "\nand fortify, reinforce armor, add weapons by collecting Material"
                + "\nResources (Iridium, Palladium, Platinum)."
                + "\n"
                + "\n*** More details can be added later ***");
        HelpMenuView exitMenu = new HelpMenuView();
        exitMenu.displayExitMenu();
    }

    private void crewMembers() {
        System.out.println(
                "\n\t∞∞∞ Recruiting Crew Members ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\nYou will need to explore different locations to find different"
                + "\nupgrades materials. Your crew help you decide which planet you"
                + "\nshould go next and based on your ship status they can help to"
                + "\ndecide whether to face or avoid enemies."
                + "\n"
                + "\n*** More details can be added later ***");
        HelpMenuView exitMenu = new HelpMenuView();
        exitMenu.displayExitMenu();
    }

    private void aboutEnemy() {
        System.out.println(
                "\n\t∞∞∞ About Enemies ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\nYou will encounter enemies while exploring a planet or when"
                + "\ntraveling. You can decide if you want to face them in battle or"
                + "\nto avoid them, based on the Excelsior ship status."
                + "\nBattles can be hard and you might lose crew members, weapons and"
                + "\nyour ship can be damaged. If the ship integrity reaches 0% the"
                + "\ngame will be over. Be careful!"
                + "\n"
                + "\n*** More details can be added later ***");
        HelpMenuView exitMenu = new HelpMenuView();
        exitMenu.displayExitMenu();
    }

    private void exit() {
        //System.out.println("*** leadQuitGame function called ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

}