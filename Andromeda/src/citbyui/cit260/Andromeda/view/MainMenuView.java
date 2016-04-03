/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.control.GameControl;

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
                + "\n"
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(Andromeda.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        this.console.println("\nEnter the file path where the saved file is located.");

        try {
            String filePath = keyboard.readLine();
            GameControl.getSavedGame(filePath);
            Andromeda.getCurrentGame();
            this.console.println(
                    "\nSaved game loaded."
                    + "\n––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––"
                    + "\n\tWelcome back " + Andromeda.getCurrentGame().getPlayer().getName() + "!"
                    + "\n––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
                    //+ "\n Materials " + Andromeda.getCurrentGame().getExcelsior().getMaterials().toString());
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void howToPlay() {
        HelpMenuView helpMenu;
        helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
