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
public class ExploreLocationView extends View {

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();

    public ExploreLocationView(int systemIndex, int planetIndex) {
        super(
                "– Items found –"
                + "\n\t\t\tTotal"
                + ""
                + "\nIridium: \t+ "
                + map.get(systemIndex).getPlanets().get(planetIndex).getMaterial().getIridium()
                + "\t (" + game.getExcelsior().getMaterials().getIridium() + ")"
                + "\nPaladium: \t+ "
                + map.get(systemIndex).getPlanets().get(planetIndex).getMaterial().getPalladium()
                + "\t (" + game.getExcelsior().getMaterials().getPalladium() + ")"
                + "\nPlatinum: \t+ "
                + map.get(systemIndex).getPlanets().get(planetIndex).getMaterial().getPlatinum()
                + "\t (" + game.getExcelsior().getMaterials().getPlatinum() + ")"
                + "\n"
                + "\nNew crew members +(Not implemented yet)"
                + "\n"
                + "\nE : Exit"
                + "\n"
                + "");

        game.getMap().get(systemIndex).getPlanets().get(planetIndex).getMaterial().setIridium(0);
        game.getMap().get(systemIndex).getPlanets().get(planetIndex).getMaterial().setPalladium(0);
        game.getMap().get(systemIndex).getPlanets().get(planetIndex).getMaterial().setPlatinum(0);

    }

    public boolean doAction(String choice) {

        switch (choice) {
            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection.");
                break;
        }
        return false;
    }

}
