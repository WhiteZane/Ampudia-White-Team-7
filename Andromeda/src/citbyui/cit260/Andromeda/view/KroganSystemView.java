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

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();
    static int currentMapIndex = 3;

    public KroganSystemView() {
        super(
                "—————————————————————— [ Krogan DMZ ] ———————————————————————"
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
                + "\n E : Return to Galaxy Map                                       "
                + "\n");
    }

    String toPlanet = "";
    int planetIndex = 0;
    int i = 0;

    public boolean doAction(String choice) {
        boolean flag = false;

        for (i = 0; i <= map.get(currentMapIndex).getPlanets().size() - 1; i++) {
            int x = map.get(currentMapIndex).getPlanets().get(i).getX();
            int y = map.get(currentMapIndex).getPlanets().get(i).getY();

            if (choice.equals(x + "," + y)) {
                flag = true;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                game.getMap().get(currentMapIndex).getPlanets().get(i).setVisited(Boolean.TRUE);
                planetIndex = i;
                this.moveToLocation();
            }
        }
        if (flag == false) {
            ErrorView.display(this.getClass().getName(), "Invalid coordinates.");
        }
        return false;
    }

    private void moveToLocation() {
        Game game = Andromeda.getCurrentGame();

        LocationMenuView locationMenu;
        locationMenu = new LocationMenuView(toPlanet, currentMapIndex, planetIndex);
        locationMenu.display();
    }
}
