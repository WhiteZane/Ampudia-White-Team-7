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
public class CrescentNebulaView extends View {

    public CrescentNebulaView() {
        super(
                "————————————————————— [ Crescent Nebula ] ——————————————————————"
                + "\n                                                                "
                + "\n                                                  o Ponolus     "
                + "\n                                                    [46][25]    "
                + "\n                                          º Illium              "
                + "\n                                            [11][4]             "
                + "\n                                o Beregale                      "
                + "\n                                     [0][0]                     "
                + "\n                                                                "
                + "\n                                                                "
                + "\n        ¨O Thail                                                 "
                + "\n           [-88][-38]                                           "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\nO Naxell                                                        "
                + "\n  [-120][-280]                                                  "
                + "\n                                                                "
                + "\n[Enter coordinates – Example: 4,4]                              "
                + "\n E : Return to Galaxy Map                                       ");
    }

    String toPlanet = "";

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "46,25":
                toPlanet = "Ponolus";
                this.moveToLocation();
                break;

            case "11,4":
                toPlanet = "Illium";
                this.moveToLocation();
                break;

            case "0,0":
                toPlanet = "Beregale";
                this.moveToLocation();
                break;

            case "-88,-38":
                toPlanet = "Thai";
                this.moveToLocation();
                break;

            case "-120,-280":
                toPlanet = "Naxell";
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
