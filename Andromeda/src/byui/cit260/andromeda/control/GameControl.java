/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import andromeda.Andromeda;
import static byui.cit260.andromeda.control.MapControl.createPlanetList;
import static byui.cit260.andromeda.control.MaterialControl.createMaterialsList;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Material;
import byui.cit260.andromeda.model.Planet;
import byui.cit260.andromeda.model.Player;
import java.util.List;

/**
 *
 * @author oscar
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        Andromeda.setPlayer(player);

        return player;
    }

    public static void createNewGame(Player player) {

        //Planet[] planetList = MapControl.createPlanetList();
        //System.out.print(planetList.toString());
        
        //Test to show Planets and Materials
        //PlanetsList();
        MaterialsList();
    }

    public static void PlanetsList() {
        List<Planet> planetList = createPlanetList();
        System.out.print(planetList);
    }

    private static void MaterialsList() {
        List<Material> materialsList = createMaterialsList();
        //System.out.print(materialsList);
    }
}
