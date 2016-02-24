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
public class LogBookView {
    
    public void displayLogBook() {

        boolean done = false;
        do {
            String menuOption = this.getLogBookOption();
            if (menuOption.toUpperCase().equals("E")) {
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    private String menuLogBook;

    public LogBookView() {
        this.menuLogBook = "…………………………………………………………………………………"
                + "\n\t  Logbook"
                + "\n…………………………………………………………………………………"
                + "\n\t Planets explored : "
                + "\n\t Enemies encountered : "
                + "\n\t Enemies defeated : "
                + "\n\t Total credits acquired : "
                + "\nE : Exit to Main Menu";
    }

    private String getLogBookOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.println(menuLogBook);

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

    

    private void exit() {
        //System.out.println("*** leadQuitGame function called ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}
