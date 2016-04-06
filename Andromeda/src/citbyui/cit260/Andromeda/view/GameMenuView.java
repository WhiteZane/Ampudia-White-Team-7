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
public class GameMenuView extends View {

    public GameMenuView() {
        super(
                "\n…………………………………………………………………………………"
                + "\n  Game Menu"
                + "\n…………………………………………………………………………………"
                + "\nM : Move to location "
                + "\nV : View Ship Status "
                + "\nT : Talk to Crew Members"
                + "\nC : Check Logbook"
                + "\nS : Save Game"
                + "\n"
                + "\nE : Exit to Main Menu"
                + "\n");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "M":
                this.moveToLocation();
                break;
            case "V":
                this.viewShipStatus();
                break;
            case "T":
                this.talkToCrew();
                break;
            case "C":
                this.checkLogbook();
                break;
            case "S":
                this.saveGame();
                break;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection.");
                break;
        }
        return false;
    }

    private void moveToLocation() {
        MapView map;
        map = new MapView();
        map.display();
    }

    private void viewShipStatus() {
        StarshipStatusView status;
        status = new StarshipStatusView();
        status.display();
    }

    private void talkToCrew() {
        TalkToCrewView talkToCrew;
        talkToCrew = new TalkToCrewView();
        talkToCrew.display();
    }

    private void checkLogbook() {
        LogBookView logBook;
        logBook = new LogBookView();
        logBook.display();
    }

    private void saveGame() {
        this.console.println("\nEnter the file path for file where the game is to be saved.");

        try {
            String filePath = keyboard.readLine();
            GameControl.saveGame(Andromeda.getCurrentGame(), filePath);
            this.console.println(
                    "\n*****************************************************************"
                    + "\n\tSave complete!"
                    + "\n*****************************************************************");
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

}
