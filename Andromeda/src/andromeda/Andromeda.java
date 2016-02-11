/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andromeda;

import byui.cit260.andromeda.model.Enemy;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Logbook;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.MaterialResources;
import byui.cit260.andromeda.model.Planet;
import byui.cit260.andromeda.model.Player;

/**
 *
 * @author ghosty
 */
public class Andromeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // player class
        Player playerOne = new Player();
        
        playerOne.setName("Fred");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Excelsior
        Excelsior excelsior = new Excelsior();
        
        excelsior.setDescription("This is the description of the ship");
        excelsior.setShipIntegrity(100);
        excelsior.setArmor(100);
        excelsior.setWeapons(5);
        excelsior.setCrew(12);
        excelsior.setCredits(57000);
        
        String spaceshipInfo = excelsior.toString();
        System.out.println(spaceshipInfo);
        
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
        
        
        
    }
    
}
