/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import andromeda.Andromeda;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Material;
import byui.cit260.andromeda.model.Weapon;
import byui.cit260.andromeda.model.Player;
import exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    public static Excelsior createExcelsior() {

        Excelsior ship = new Excelsior();

        ship.getArmor();
        ship.getCodePlanet();
        ship.getCredits();
        ship.getCrew();
        ship.getDescription();
        ship.setMaterials(GameControl.createMaterialList());
        ship.getShipIntegrity();
        ship.setWeapons(GameControl.createWeaponsList());

        Andromeda.setShip(ship);

        return ship;
    }

    public static void createNewGame(Player player, Excelsior ship) {

        Game game = new Game(); // create new game
        Andromeda.setCurrentGame(game); // save in Andromeda

        game.setPlayer(player);
        game.setExcelsior(ship);

        List<Map> map = MapControl.createMap();
        //Andromeda.setMap(map);
        game.setMap(map);

        /*Search a list for a value 
        for (int i=0; i<=planet.size()-1; i++){
            if(planet.get(i).getName()=="Earth"){
                System.out.println("\nYou are on Earth");
            }
        }*/
        Andromeda.setCurrentGame(game);

        //System.out.print("\n\nObjects Initialized...\n\n" + game);
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

    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filepath)
            throws GameControlException {

        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
            }
            //close the output file
            Andromeda.setCurrentGame(game);
    }

}
