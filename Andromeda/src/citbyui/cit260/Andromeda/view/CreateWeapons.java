/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import byui.cit260.andromeda.model.Excelsior;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class CreateWeapons extends View{
    
     public CreateWeapons() {

                super("…………………………………………………………………………………"
                + "\n  Buy/Create Weapons Menu"
                + "\n…………………………………………………………………………………"
                + "\nD : Weapon Description"
                + "\nC : Create weapons"
                + "\nB : Buy weapons"
                + "\nE : Return to Location Menu ");

    }

     
     
    

    public boolean doAction(String createOption) {

        createOption = createOption.toUpperCase();

        switch (createOption) {

            case "C":
                this.createWeapon();
                break;
            case "B":
                this.buyWeapon();
                break;
            case "D":
                this.weaponDescriptions();
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

    

    private void createWeapon() {
        //Excelsior excelsior = new Excelsior();
        //int status = excelsior.getShipIntegrity();
        
        System.out.println("\n\t∞∞∞ Create Weapons? ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\n"
                + "\n 1. Improved Phaser Bank "
                + "\n Cost: 20 pladium"
                + "\n 2. Phaser Array "
                + "\n Cost: 5 paladium, 10 iridium"
                + "\n 3. Rocket launcher pad "
                + "\n Cost: 5 platinum, 10 iridium"
                + "\n 4. Photon Torpedo launcher "
                + "\n Cost: 5 platinum, 15 iridium"
                + "\n*** More details can be added later ***");
        
        new java.util.Scanner(System.in).nextLine(); // system pause

    }

    private void buyWeapon() {
        //call for minerals and check if weapons can be bought
         System.out.println(
                "\n\t∞∞∞ buy Weapons? ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\n 1. Rockets x5 "
                + "\n Cost: 5 pladium, 5 iridium"
                + "\n 2. Photon Torpedo x1 "
                + "\n Cost: 5 pladium, 10 iridium"
                + "\n"
                + "\n*** More details can be added later ***");
        
         new java.util.Scanner(System.in).nextLine(); // system pause

    }

    private void weaponDescriptions() {
        System.out.println("\n\t∞∞∞ Weapons Description? ∞∞∞"
                + "\n∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞∞"
                + "\n"
                + "\n Improved Phaser Bank "
                + "\n Improves phasers by enhanching the laser systems"
                + "\n\n Phaser Array "
                + "\n Improves phasers by enhanching the laser systems"
                + "\n\n Rocket launcher pad "
                + "\n Allows you to launch Rockets"
                + "\n\n Photon Torpedo launcher "
                + "\n Allows you to launch Photon Torpedos"
                + "\n"
                + "*** More details can be added later");
        
        new java.util.Scanner(System.in).nextLine(); // system pause
    
    }

    private void exit() {
        //System.out.println("*** leadQuitGame function called ***");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    
    
}
