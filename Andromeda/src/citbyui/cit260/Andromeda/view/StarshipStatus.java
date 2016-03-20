/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Weapon;
import java.util.List;

/**
 *
 * @author ghosty
 */
public class StarshipStatus extends View {

    static Excelsior ship = Andromeda.getShip();
    static int shipIntegrity = ship.getShipIntegrity();
    static int armor = ship.getArmor();
    static List<Weapon> weapon = ship.getWeapons();
    static int crew = ship.getCrew();
    static int credits = ship.getCredits();
    static int iridium = ship.getMaterials().get(0).getIridium();
    static int palladium = ship.getMaterials().get(0).getPalladium();
    static int platinum = ship.getMaterials().get(0).getPlatinum();

    public StarshipStatus() {
        super(
                "…………………………………………………………………………………"
                + "\n  Excelsior Starship Status"
                + "\n…………………………………………………………………………………"
                + "\nIntegrity :\t" + shipIntegrity
                + "\nArmor :\t\t" + armor
                + "\nCrew :\t\t" + crew
                + "\nCredits:\t" + credits
                + "\n"
                + "\nMaterial"
                + "\nIridum:\t\t" + iridium
                + "\nPaladium:\t" + palladium
                + "\nPlatinum:\t" + platinum
                + "\n"
                + "\nWeapons List" + weapon
                + "\n"
                + "\nE : Exit to Game Menu");
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
