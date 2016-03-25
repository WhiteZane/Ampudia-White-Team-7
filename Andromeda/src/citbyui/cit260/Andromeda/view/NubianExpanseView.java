/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import java.util.List;

/**
 *
 * @author oscar
 */
public class NubianExpanseView extends View {

    Game game = Andromeda.getCurrentGame();
    List<Map> map = game.getMap();
    static int currentMapIndex = 2;

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
    int i = 0;

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "-25,36":
                i = 0;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "-21,5":
                i = 1;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "0,0":
                i = 2;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "13,-13":
                i = 3;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "34,-48":
                i = 4;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void moveToLocation() {
        Game game = Andromeda.getCurrentGame();
        game.getMap().get(currentMapIndex).getPlanets().get(i).setVisited(Boolean.TRUE);

        LocationMenuView locationMenu;
        locationMenu = new LocationMenuView(toPlanet);
        locationMenu.display();
    }
}
