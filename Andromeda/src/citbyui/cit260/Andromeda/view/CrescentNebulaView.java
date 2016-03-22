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
public class CrescentNebulaView extends View {

    Game game = Andromeda.getCurrentGame();
    List<Map> map = game.getMap();
    static int currentMapIndex = 1;

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
    int i = 0;

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "-120,-280":
                i = 0;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "-88,-38":
                i = 1;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                ;
                this.moveToLocation();
                break;

            case "0,0":
                i = 2;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                ;
                this.moveToLocation();
                break;

            case "11,4":
                i = 3;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                ;
                this.moveToLocation();
                break;

            case "46,25":
                i = 4;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                ;
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
