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
import byui.cit260.andromeda.model.Weapon;
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
        ship.setWeapons(GameControl.createWeaponsList());

        //Map gameMap = new Map();
        //Andromeda.setMap(gameMap);
        Material materials = new Material();
        Andromeda.setMaterial(materials);

        Weapon weapons = new Weapon();
        Andromeda.setWeapon(weapons);

        List<Map> map = MapControl.createMap();
        game.setMap(map);

        List<Planet> planet = MapControl.createPlanetList("Local Cluster");
        
        //Search a list for a value 
        for (int i=0; i<=planet.size()-1; i++){
            if(planet.get(i).getName()=="Earth"){
                System.out.println("\nYou are on Earth");
            }
        }
        ship.setPlanet(planet.get(0));

        System.out.print("\n\nObjects Initialized...\n\n\n" + ship);

        //System.out.print(map.toString());
        Andromeda.setCurrentGame(game);
        //System.out.println(game);
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

    private static List<Weapon> createWeaponsList() {
        List<Weapon> weaponList = new ArrayList<>();

        Weapon phaserBank = new Weapon();

        phaserBank.setName("Phaser Bank");
        phaserBank.setAttackpoints(5);
        phaserBank.setQuantity(1);
        weaponList.add(phaserBank);

        Weapon improvedPhaserBank = new Weapon();

        improvedPhaserBank.setName("Improved phaser Bank");
        improvedPhaserBank.setAttackpoints(7);
        improvedPhaserBank.setQuantity(0);

        Weapon phaserArray = new Weapon();

        phaserArray.setName("Phaser Array");
        phaserArray.setAttackpoints(9);
        phaserArray.setQuantity(0);

        return weaponList;
    }
}
