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
public class StarshipStatus extends View{
    
    public StarshipStatus() {
        super("…………………………………………………………………………………"
                + "\n\t  Excelsior Starship Status"
                + "\n…………………………………………………………………………………"
                + "\n\t Starship integrity : "      + "\t\t Material Resources :"
                + "\n\t Armor : "                   + "\t\t\t Iridum : " 
                + "\n\t Weapons : "                 + "\t\t\t Paladium : "
                + "\n\t Crew : "                    + "\t\t\t Platinum : "
                + "\n\t Credits (money) : "
                
                + "\nE : Exit to Main Menu");
    }

    public boolean doAction(String shipOption) {

        shipOption = shipOption.toUpperCase();

        switch (shipOption) {
            
            case "E":
                this.exit();
                break;
            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    /*    public void displayExitMenu() {
    
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
    }*/

    

    private void exit() {
        //System.out.println("*** leadQuitGame function called ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
