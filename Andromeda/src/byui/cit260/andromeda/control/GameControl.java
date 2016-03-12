/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import andromeda.Andromeda;
import static byui.cit260.andromeda.control.MapControl.createPlanetList;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Material;
import byui.cit260.andromeda.model.Planet;
import byui.cit260.andromeda.model.Player;
import java.util.ArrayList;
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

        Game game = new Game(); // create new game
        Andromeda.setCurrentGame(game); // save in Andromeda

        game.setPlayer(player);

        Excelsior ship = new Excelsior();
        ship.setMaterials(GameControl.createMaterialList());

        Map gameMap = new Map();
        Andromeda.setMap(gameMap);

        Material materials = new Material();
        Andromeda.setMaterial(materials);

        List<Map> map = MapControl.createMap();
        List<Planet> planet = MapControl.createPlanetList("Local Cluster");

        ship.setPlanet(planet.get(0));

        System.out.print(ship);

        //Test if map objects are created
        //System.out.print(gameMap.toString());
        Andromeda.setCurrentGame(game);

    }

    private static List<Material> createMaterialList() {
        List<Material> material = new ArrayList<>();

        Material list = new Material();
        list.setIridium(5);
        list.setPalladium(10);
        list.setPlatinum(5);
        material.add(list);

        return material;
    }
}
