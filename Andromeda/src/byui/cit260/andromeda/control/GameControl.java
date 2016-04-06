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
import java.util.Scanner;

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
        ship.getShipIntegrity();
        ship.setWeapons(createWeaponsList());

        Andromeda.setShip(ship);

        return ship;
    }

    public static void createNewGame(Player player) {

        Game game = new Game(); // create new game
        Andromeda.setCurrentGame(game); // save in Andromeda

        game.setPlayer(player);
        game.setExcelsior(createExcelsior());
        game.getExcelsior().setMaterials(createMaterialList());

        List<Map> map = MapControl.createMap();
        game.setMap(map);

        List<Weapon> weapons = createWeaponsList();
        game.setWeapons(weapons);

        Andromeda.setCurrentGame(game);

        //System.out.print("\n\nObjects Initialized...\n\n"
        //        + "\n" + game.getMap().get(0).getPlanets().get(0).getMaterial()
        //        + "\nPlanet " + game.getMap().get(0).getPlanets().get(0).getName()
        //        + "\nMaterials "+game.getExcelsior().getMaterials().toString());
    }

    private static Material createMaterialList() {
        Material material = new Material();

        material.setIridium(10);
        material.setPalladium(10);
        material.setPlatinum(10);

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
        weaponList.add(improvedPhaserBank);

        Weapon phaserArray = new Weapon();
        phaserArray.setName("Phaser Array");
        phaserArray.setAttackpoints(9);
        phaserArray.setQuantity(0);
        weaponList.add(phaserArray);

        Weapon rocketLauncherPad = new Weapon();
        rocketLauncherPad.setName("Rocket launcher pad");
        rocketLauncherPad.setAttackpoints(10);
        rocketLauncherPad.setQuantity(0);
        weaponList.add(rocketLauncherPad);

        Weapon photonTorpedoLauncher = new Weapon();
        photonTorpedoLauncher.setName("Photon Torpedo Launcher");
        photonTorpedoLauncher.setAttackpoints(15);
        photonTorpedoLauncher.setQuantity(0);
        weaponList.add(photonTorpedoLauncher);

        return weaponList;
    }

    public static void saveGame(Game game, String filepath) throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filepath) throws GameControlException {

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
            Andromeda.setCurrentGame(game);

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void printReport(List<Map> map, String filepath) throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(map);

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static List<Weapon> GetWeaponsList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void endGame() {
        Game game = Andromeda.getCurrentGame();
        String unknown = game.getMap().get(4).getPlanets().get(5).getName();
        String description = game.getMap().get(4).getPlanets().get(5).getDescription();

        System.out.print(
                "\n——————————————————————— [ " + unknown + " ] ———————————————————————"
                + "\n" + description
                + "\n"
                + "\n–––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––"
                + "\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n[Press Enter to continue]");
        keyboard.nextLine();
        System.out.print(
                 "\n"
                + "\n"
                + "\nCongratulations! You have reached Andromeda Galaxy!"
                + "\n"
                + "\n"
                + "                                         _.oo.\n"
                + "                 _.u[[/;:,.         .odMMMMMM'\n"
                + "              .o888UU[[[/;:-.  .o@P^    MMM^\n"
                + "             oN88888UU[[[/;::-.        dP^\n"
                + "            dNMMNN888UU[[[/;:--.   .o@P^\n"
                + "           ,MMMMMMN888UU[[/;::-. o@^\n"
                + "           NNMMMNN888UU[[[/~.o@P^\n"
                + "           888888888UU[[[/o@^-..\n"
                + "          oI8888UU[[[/o@P^:--..\n"
                + "       .@^  YUU[[[/o@^;::---..\n"
                + "     oMP     ^/o@P^;:::---..\n"
                + "  .dMMM    .o@^ ^;::---...\n"
                + " dMMMMMMM@^`       `^^^^\n"
                + "YMMMUP^\n"
                + " ^^"
                + "\n"
                + "  ________                __                              \n"
                + " /_  __/ /_  ____ _____  / /__   __  ______  __  __       \n"
                + "  / / / __ \\/ __ `/ __ \\/ //_/  / / / / __ \\/ / / /       \n"
                + " / / / / / / /_/ / / / / ,<    / /_/ / /_/ / /_/ /        \n"
                + "/_/ /_/ /_/\\__,_/_/ /_/_/|_|   \\__, /\\____/\\__,_/         \n"
                + "    ____                    __/____/      _             __\n"
                + "   / __/___  _____   ____  / /___ ___  __(_)___  ____ _/ /\n"
                + "  / /_/ __ \\/ ___/  / __ \\/ / __ `/ / / / / __ \\/ __ `/ / \n"
                + " / __/ /_/ / /     / /_/ / / /_/ / /_/ / / / / / /_/ /_/  \n"
                + "/_/  \\____/_/     / .___/_/\\__,_/\\__, /_/_/ /_/\\__, (_)   \n"
                + "                 /_/            /____/        /____/      "
                + "\n\n");
        System.exit(0);
    }

}
