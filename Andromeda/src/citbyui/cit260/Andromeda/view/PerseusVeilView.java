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

    Game game = Andromeda.getCurrentGame();
    List<Map> map = game.getMap();
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
    int i = 0;

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "-2,6":
                i = 0;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                ;
                this.moveToLocation();
                break;

            case "-2,2":
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

            case "1,-1":
                i = 3;
                toPlanet = map.get(currentMapIndex).getPlanets().get(i).getName();
                ;
                this.moveToLocation();
                break;

            case "2,-4":
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

    private void exit() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
