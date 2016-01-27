/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andromeda;

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
        
        Player playerOne = new Player();
        
        playerOne.setName("andromeda");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
