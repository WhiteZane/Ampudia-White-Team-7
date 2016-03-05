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
public class KroganSystemView extends View {

    public KroganSystemView() {
        super(
                "—————————————————————— [ Krogan System ] ———————————————————————"
                + "\n                                                   o Ruam       "
                + "\n                                                     [32][66]   "
                + "\n                                                 º Tuchanka     "
                + "\n                                                    [33][60]    "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                     .Oº Kruban                                 "
                + "\n                          [5][6]                                "
                + "\n           º Durak                                              "
                + "\n             [0][0]                                             "
                + "\n        o Kanin                                                 "
                + "\n          [-2][-1]                                              "
                + "\n                                                                "
                + "\n[Enter coordinates – Example: 4,4]                              "
                + "\n E : Return to Galaxy Map                                       ");
    }

    String toPlanet = "";

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "32,66":
                toPlanet = "Ruam";
                this.moveToLocation();
                break;

            case "33,60":
                toPlanet = "Tuchanka";
                this.moveToLocation();
                break;

            case "5,6":
                toPlanet = "Kruban";
                this.moveToLocation();
                break;

            case "0,0":
                toPlanet = "Durak";
                this.moveToLocation();
                break;

            case "-2,-1":
                toPlanet = "Kanin";
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
