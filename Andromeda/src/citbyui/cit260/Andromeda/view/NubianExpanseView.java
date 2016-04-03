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

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();
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
