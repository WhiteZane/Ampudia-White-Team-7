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
public class LocationMenuView extends View {

    public LocationMenuView(String toPlanet) {
        super(
                "\n……………………………………………………………………………………………………………"
                + "\n  Current Location: " + toPlanet + " "
                + "\n……………………………………………………………………………………………………………"
                + "\nL : Explore location "
                + "\nF : Fortify/Repair Excelsior "
                + "\nA : Armor reinforcment"
                + "\nB : Buy/Create weapons"
                + "\nR : Recruit new crew members"
                + "\n"
                + "\nE : Return to System Map ");
    }

    String fromPlanet = "";

    public boolean doAction(String locationOption) {

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

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void exploreLocation() {
        ExploreLocationView exploreLocations;
        exploreLocations = new ExploreLocationView();
        exploreLocations.display();
    }

    private void repairFortify() {
        RepairShip repairs;
        repairs = new RepairShip();
        repairs.display();
    }

    private void armorReinforce() {
        System.out.println("*** armorReinforce function called ***");
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
