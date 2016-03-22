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
public class KroganSystemView extends View {

    Game game = Andromeda.getCurrentGame();
    List<Map> map = game.getMap();
    static int currentMapIndex = 3;

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
    int i = 0;

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "32,66":
                i = 0;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "33,60":
                i = 1;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "5,6":
                i = 2;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "0,0":
                i = 3;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                this.moveToLocation();
                break;

            case "-2,-1":
                i = 4;
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
