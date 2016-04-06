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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author ghosty
 */
public class StarshipStatusView extends View {

    static Game game = Andromeda.getCurrentGame();
    static Excelsior ship = game.getExcelsior();

    static int shipIntegrity = ship.getShipIntegrity();
    static int armor = ship.getArmor();
    static List<Weapon> weapon = ship.getWeapons();
    static int crew = ship.getCrew();
    static int credits = ship.getCredits();
    static int iridium = ship.getMaterials().getIridium();
    static int palladium = ship.getMaterials().getPalladium();
    static int platinum = ship.getMaterials().getPlatinum();

    public StarshipStatusView() {
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
                + "\nIridum:\t\t" + ship.getMaterials().getIridium()
                + "\nPaladium:\t" + ship.getMaterials().getPalladium()
                + "\nPlatinum:\t" + ship.getMaterials().getPlatinum()
                + "\n"
                + "\nWeapons List" + weapon
                + "\n"
                + "\nP : Print Inventory"
                + "\n"
                + "\nE : Exit to Game Menu"
                + "\n");
    }

    public boolean doAction(String shipOption) {

        shipOption = shipOption.toUpperCase();

        switch (shipOption) {
            case "P":
                this.printInventory();
                break;

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void printInventory() {
        this.console.println("\nEnter the file path and file name where the report is to be saved.");
        Game game = Andromeda.getCurrentGame();
        try {
            String report = keyboard.readLine();
            this.allInventory(game.getWeapons(), report);
            //this.allPlanets(game.getMap(), report);
            this.console.println(
                    "\n*****************************************************************"
                    + "\n\tReport saved in \"" + report + "\""
                    + "\n*****************************************************************");
        } catch (Exception e) {
            ErrorView.display("GameMenuView", e.getMessage());
        }
    }

    private void allInventory(List<Weapon> weaponReport, String outputLocation) {
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\tWeapons");
            out.printf("%n%-25s%-20s%10s", "Name", "Attack Points", "Quantity");
            out.printf("%n%-25s%-20s%10s", "––––––––––––––––––––", "––––––––––––––", "–––––––––––");

            for (Weapon weapons : weaponReport) {
                out.printf("%n%-25s%-20d%-10d", weapons.getName(), weapons.getAttackpoints(), weapons.getQuantity());
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
