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

/**
 *
 * @author ghosty
 */
public class LocationMenuView extends View {

    int iSystem = 0;
    int iPlanet = 0;

    public LocationMenuView(String planet, int systemIndex, int planetIndex) {
        super(
                "\n……………………………………………………………………………………………………………"
                + "\n  Current Location: " + planet
                + "\n……………………………………………………………………………………………………………"
                + "\nL : Explore location "
                + "\nF : Fortify/Repair Excelsior "
                + "\nA : Armor reinforcment"
                + "\nB : Buy/Create weapons"
                + "\nR : Recruit new crew members"
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
            case "R":
                this.recruitMembers();
                break;

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
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

    private void recruitMembers() {
        System.out.println("*** recruitMembers function called ***");
    }
}
