/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.control.MaterialControl;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import exceptions.MapControlException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghosty
 */
public class LocationMenuView extends View {

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();

    int iSystem = 0;
    int iPlanet = 0;

    public LocationMenuView(String planet, int systemIndex, int planetIndex) {
        super(
                "——————————————–––––————————— [ " + map.get(systemIndex).getPlanets().get(planetIndex).getName() + " ] ——————————————–––––—————————"
                + "\n" + map.get(systemIndex).getPlanets().get(planetIndex).getDescription()
                + "\n"
                + "\nL : Explore location "
                + "\nF : Fortify/Repair Excelsior "
                + "\nA : Armor reinforcment"
                + "\nB : Buy/Create weapons"
                + "\n"
                + "\n1 : Calculate Planets Distance in " + map.get(systemIndex).getSystem()
                + "\n"
                + "\nE : Return to System Map "
                + "\n");
        iSystem = systemIndex;
        iPlanet = planetIndex;
    }

    //String fromPlanet = "";
    public boolean doAction(String locationOption) {

        locationOption = locationOption.toUpperCase();

        switch (locationOption) {
            case "L":
                this.exploreLocation(iSystem, iPlanet);
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

            case "1": {
                try {
                    this.calculation();
                } catch (MapControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }

            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection.");
                break;
        }
        return false;
    }

    private void exploreLocation(int systemIndex, int planetIndex) {
        Game game = Andromeda.getCurrentGame();
        Excelsior ship = game.getExcelsior();

        int iridium = game.getMap().get(systemIndex).getPlanets().get(planetIndex).getMaterial().getIridium();
        int palladium = game.getMap().get(systemIndex).getPlanets().get(planetIndex).getMaterial().getPalladium();
        int platinum = game.getMap().get(systemIndex).getPlanets().get(planetIndex).getMaterial().getPlatinum();

        MaterialControl.addMaterials(iridium, palladium, platinum);

        ExploreLocationView exploreLocations;
        exploreLocations = new ExploreLocationView(systemIndex, planetIndex);
        exploreLocations.display();
    }

    private void repairFortify() {
        RepairShip repairs;
        repairs = new RepairShip();
        repairs.display();
    }

    private void armorReinforce() {
        ArmorView armorEnforce;
        armorEnforce = new ArmorView();
        armorEnforce.display();
    }

    private void createWeapons() {
        CreateWeapons buyWeapons;
        buyWeapons = new CreateWeapons();
        buyWeapons.display();
    }

    private void calculation() throws MapControlException {
        int system = iSystem;
        CalcDistanceView view = new CalcDistanceView(system);
        view.displayCalcDistanceView(system);
    }

}
