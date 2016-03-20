/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\nE : Exit to Main Menu"
                + "\n"
                + "\n1 : Calculate Planets Distance");
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

            case "1": {
                try {
                    this.calculation();
                } catch (MapControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
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

        StarshipStatus status;
        status = new StarshipStatus();
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
        System.out.println("*** saveGame function called ***");
    }

    private void calculation() throws MapControlException {
        CalcDistanceView view = new CalcDistanceView();
        view.displayCalcDistanceView();
    }
}
