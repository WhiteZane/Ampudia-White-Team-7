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
public class PerseusVeilView extends View {

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();
    static int currentMapIndex = 4;

    public PerseusVeilView() {
        super(
                "——————————————————————— [ Perseus Veil ] ———————————————————————"
                + "\n      O Uriyah                                         ! Unknown"
                + "\n        [-2][6]                                           [?][?]"
                + "\n                                                                "
                + "\n     o Rannoch                                                  "
                + "\n        [-2][2]                                                 "
                + "\n                                                                "
                + "\n                   ¨o*’.- Geth Debris Field                     "
                + "\n                                [0][0]                          "
                + "\n                        . Geth Dreadnought                      "
                + "\n                                [1][-1]                         "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                                                "
                + "\n                                             . Migrant Fleet    "
                + "\n                                                      [2][-4]   "
                + "\n                                                                "
                + "\n[Enter coordinates – Example: 4,4]"
                + "\nE : Return to Galaxy Map");
    }

    String toPlanet = "";
    int planetIndex = 0;
    int i = 0;

    public boolean doAction(String choice) {
        boolean flag = false;

        for (i = 0; i <= map.get(currentMapIndex).getPlanets().size()-1; i++) {
            int x = map.get(currentMapIndex).getPlanets().get(i).getX();
            int y = map.get(currentMapIndex).getPlanets().get(i).getY();

            if (choice.equals(x + "," + y)) {
                flag = true;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
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
        game.getMap().get(currentMapIndex).getPlanets().get(i).setVisited(Boolean.TRUE);

        LocationMenuView locationMenu;
        locationMenu = new LocationMenuView(toPlanet,currentMapIndex,planetIndex);
        locationMenu.display();
    }
}
