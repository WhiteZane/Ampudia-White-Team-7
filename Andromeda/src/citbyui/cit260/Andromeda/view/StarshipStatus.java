/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

/**
 *
 * @author ghosty
 */
public class StarshipStatus extends View {

    public StarshipStatus() {
        super(
                "…………………………………………………………………………………"
                + "\n\t  Excelsior Starship Status"
                + "\n…………………………………………………………………………………"
                + "\n\t Starship integrity : " + "\t\t Material Resources :"
                + "\n\t Armor : " + "\t\t\t Iridum : "
                + "\n\t Weapons : " + "\t\t\t Paladium : "
                + "\n\t Crew : " + "\t\t\t Platinum : "
                + "\n\t Credits (money) : "
                + "\nE : Exit to Main Menu");
    }

    public boolean doAction(String shipOption) {

        shipOption = shipOption.toUpperCase();

        switch (shipOption) {

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }
}
