/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andromeda;

import byui.cit260.andromeda.model.Enemy;
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
        
        planetOne.setName("Andromeda");
        planetOne.setDescription("M2 class planet");
        planetOne.setSystem("Lylat System");
        planetOne.setVisited(Boolean.TRUE);
        planetOne.setExplored(Boolean.TRUE);
        
        
        String PlanetOne = planetOne.toString();
        System.out.println(PlanetOne);
        
        
        
    }
    
}
