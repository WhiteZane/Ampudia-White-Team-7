/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.control.GameControl;
import exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super(
                "…………………………………………………………………………………"
                + "\n  Main Menu"
                + "\n…………………………………………………………………………………"
                + "\nG : Start new game "
                + "\nL : Load saved game "
                + "\nH : How to play"
                + "\nE : Exit game"
                + "\n");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "G":
                this.startNewGame();
                break;
            case "L":
                this.loadSavedGame();
                break;
            case "H":
                this.howToPlay();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Andromeda.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        System.out.println("*** loadSavedGame function called ***");
    }

    private void howToPlay() {
        HelpMenuView helpMenu;
        helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
