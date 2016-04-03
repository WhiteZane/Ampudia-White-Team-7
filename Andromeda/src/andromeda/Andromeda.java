/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andromeda;

import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Logbook;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Material;
import byui.cit260.andromeda.model.Weapon;
import byui.cit260.andromeda.model.Planet;
import byui.cit260.andromeda.model.Player;
import citbyui.cit260.Andromeda.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Oscar
 */
public class Andromeda {

    /**
     * @param args the command line arguments
     */
    // read and write
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    private static Game currentGame = null;
    private static Player player = null;
    private static Excelsior ship = null;
    private static List<Map> map = null;
    private static Planet planet = null;
    private static Material material = null;
    private static Weapon weapons = null;
    private static Logbook logbook = null;

    public static void main(String[] args) {

        StartProgramView spv = null;

        try {
            // open stream
            Andromeda.inFile  = new BufferedReader(new InputStreamReader(System.in));
            Andromeda.outFile = new PrintWriter(System.out, true);

            //open log file
            String filePath = "log.txt";
            Andromeda.logFile = new PrintWriter(filePath);
            spv = new StartProgramView();
            spv.displayStartProgramView();

        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            try {
                if (Andromeda.inFile != null) {
                    Andromeda.inFile.close();
                }

                if (Andromeda.outFile != null) {
                    Andromeda.outFile.close();
                }

                if (Andromeda.logFile != null) {
                    Andromeda.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }
//<editor-fold defaultstate="collapsed" desc="comment">
// player class
/*Player playerOne = new Player();

playerOne.setName("Fred");

String playerInfo = playerOne.toString();
System.out.println(playerInfo);*/
//Excelsior
/* Excelsior excelsior = new Excelsior();

excelsior.setDescription("This is the description of the ship");
excelsior.setShipIntegrity(100);
excelsior.setArmor(100);
excelsior.setWeapons(5);
excelsior.setCrew(12);
excelsior.setCredits(57000);

int status;
status = excelsior.getShipIntegrity();
         */
//String spaceshipInfo = excelsior.toString();
//System.out.println(status);
/*
//game class
Game newGame = new Game();

newGame.setTotalTime("2016-01-30 00:00:00.00000000");

String gameTime = newGame.toString();
System.out.println(gameTime);


//Logbook class
Logbook newLog = new Logbook();

newLog.setExplored(5);
newLog.setEncounter(8);
newLog.setCredits(excelsior.getCredits());

String log = newLog.toString();
System.out.println(log);

// map class

Map mapOne = new Map();

mapOne.setPlanetName("andromeda");

String MapInfo = mapOne.toString();
System.out.println(MapInfo);

//enemy class

Enemy enemyOne = new Enemy();

enemyOne.setName("Borg");
enemyOne.setDescription("Robots");

String EnemyInfo = enemyOne.toString();
System.out.println(EnemyInfo);

//Materials class

MaterialResources materialOne = new MaterialResources();

materialOne.setIridium(10);
materialOne.setPalladium(10);
materialOne.setPlatinum(5);

String MaterialOne = materialOne.toString();
System.out.println(MaterialOne);

// Planet Class

Planet planetOne = new Planet();

planetOne.setName("Mars");
planetOne.setDescription("Red planet");
planetOne.setSystem("Local Cluster");
planetOne.setVisited(Boolean.TRUE);
planetOne.setExplored(Boolean.TRUE);
planetOne.setX(1);
planetOne.setY(1);

String PlanetOne = planetOne.toString();
System.out.println(PlanetOne);


         */
//</editor-fold>
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Andromeda.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Andromeda.player = player;
    }

    public static Excelsior getShip() {
        return ship;
    }

    public static void setShip(Excelsior ship) {
        Andromeda.ship = ship;
    }

    public static List<Map> getMap() {
        return map;
    }

    public static void setMap(List<Map> map) {
        Andromeda.map = map;
    }

    public static Planet getPlanet() {
        return planet;
    }

    public static void setPlanet(Planet planet) {
        Andromeda.planet = planet;
    }

    public static Material getMaterial() {
        return material;
    }

    public static void setMaterial(Material material) {
        Andromeda.material = material;
    }

    public static Weapon getWeapon() {
        return weapons;
    }

    public static void setWeapon(Weapon weapon) {
        Andromeda.weapons = weapon;
    }

    public static Logbook getLogbook() {
        return logbook;
    }

    public static void setLogbook(Logbook logbook) {
        Andromeda.logbook = logbook;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outfile) {
        Andromeda.outFile = outfile;
    }

    public static BufferedReader getInfile() {
        return inFile;
    }

    public static void setInfile(BufferedReader infile) {
        Andromeda.inFile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Andromeda.logFile = logFile;
    }

}
