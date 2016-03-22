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
public class LocalClusterView extends View {

    Game game = Andromeda.getCurrentGame();
    List<Map> map = game.getMap();
    static int currentMapIndex = 0;

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
    int i = 0;

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "0,0":
                i = 0;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "1,1":
                i = 1;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "4,4":
                i = 2;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "8,5":
                i = 3;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "18,7":
                i = 4;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "30,7":
                i = 5;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
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
