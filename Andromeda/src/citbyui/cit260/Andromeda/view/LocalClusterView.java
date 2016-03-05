/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

/**
 *
 * @author oscar
 */
public class LocalClusterView extends View {

    public LocalClusterView() {
        super(
                "—————————————————————— [ Local Cluster ] ———————————————————————"
                + "\n                                                                "
                + "\n                                o Uranus   o Neptune            "
                + "\n                                  [18][7]     [30][7]           "
                + "\n                    -O- Saturn                                  "
                + "\n                         [8][5]                                 "
                + "\n              O Jupiter                                         "
                + "\n                  [4][4]                                        "
                + "\n                                                                "
                + "\n    . Mars                                                      "
                + "\n      [1][1]                                                    "
                + "\n. Earth                                                         "
                + "\n  [0][0]                                                        "
                + "\n                                                                "
                + "\n[Enter coordinates – Example: 4,4]                              "
                + "\n E : Return to Galaxy Map                                       ");
    }

    String toPlanet = "";

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "0,0":
                toPlanet = "Earth";
                this.moveToLocation();
                break;

            case "1,1":
                toPlanet = "Mars";
                this.moveToLocation();
                break;

            case "4,4":
                toPlanet = "Jupiter";
                this.moveToLocation();
                break;

            case "8,5":
                toPlanet = "Saturn";
                this.moveToLocation();
                break;

            case "18,7":
                toPlanet = "Uranus";
                this.moveToLocation();
                break;

            case "30,7":
                toPlanet = "Neptune";
                this.moveToLocation();
                break;

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void moveToLocation() {
        LocationMenuView locationMenu;
        locationMenu = new LocationMenuView(toPlanet);
        locationMenu.display();
    }
}
