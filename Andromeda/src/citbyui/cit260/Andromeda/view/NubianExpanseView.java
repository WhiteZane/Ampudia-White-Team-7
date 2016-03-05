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
public class NubianExpanseView extends View {

    public NubianExpanseView() {
        super(
                "—————————————————————— [ Nubian Expanse ] ——————————————————————"
                + "\n-O- Gamayun                                                     "
                + "\n    [-25][36]                                                   "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n    o Alkonost                                                  "
                + "\n       [-21][5]                                                 "
                + "\n                             º Bannik                           "
                + "\n                                [0][0]                          "
                + "\n                                             O Pragia           "
                + "\n                                               [13][-13]        "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                 . Zimitra      "
                + "\n                                                   [34][-48]    "
                + "\n                                                                "
                + "\n[Enter coordinates – Example: 4,4]                              "
                + "\n E : Return to Galaxy Map                                       ");

    }

    String toPlanet = "";

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "-25,36":
                toPlanet = "Gamayun";
                this.moveToLocation();
                break;

            case "-21,5":
                toPlanet = "Alkonost";
                this.moveToLocation();
                break;

            case "0,0":
                toPlanet = "Bannik";
                this.moveToLocation();
                break;

            case "13,-13":
                toPlanet = "Pragia";
                this.moveToLocation();
                break;

            case "34,-48":
                toPlanet = "Zimitra";
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
