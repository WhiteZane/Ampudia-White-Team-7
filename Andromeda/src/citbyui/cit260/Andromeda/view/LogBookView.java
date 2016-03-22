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
public class LogBookView extends View {

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();

    //static List<Map> map = Andromeda.getMap();
    public static String displayList() {
        String system = "";
        String list = "";
        for (int i = 0; i <= map.size() - 1; i++) {
            for (int j = 0; j <= map.get(i).getPlanets().size() - 1; j++) {
                if (map.get(i).getPlanets().get(j).getVisited() == true) {
                    list += map.get(i).getPlanets().get(j).getName() + ", ";
                }
            }
            system += "\n  " +  map.get(i).getSystem() + ": " + list;
            list = "";
        }
        return system;
    }

    public LogBookView() {
        super(
                "…………………………………………………………………………………"
                + "\n  Logbook"
                + "\n…………………………………………………………………………………"
                + "\nPlanets visited"
                + displayList() + "\n"
                + "\nEnemies encountered:\t"
                + "\nEnemies defeated:\t"
                + "\nTotal credits acquired:\t"
                + "\n"
                + "\nE : Exit to Game Menu");
    }

    public boolean doAction(String helpOption) {

        helpOption = helpOption.toUpperCase();

        switch (helpOption) {

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

}
