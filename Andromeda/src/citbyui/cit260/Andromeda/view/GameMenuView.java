/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import byui.cit260.andromeda.control.GameControl;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Planet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
                + "\n"
                + "\n1 : Print Game Report"
                + "\n2 : Calculate Planets Distance");
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

            case "1":
                this.printReport();
                break;

            case "2": {
                try {
                    this.calculation();
                } catch (MapControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
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
        this.console.println("\nEnter the file path for file where the game is to be saved.");

        try {
            String filePath = keyboard.readLine();
            GameControl.saveGame(Andromeda.getCurrentGame(), filePath);
            this.console.println("\n\nSave complete!");
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void calculation() throws MapControlException {
        CalcDistanceView view = new CalcDistanceView();
        view.displayCalcDistanceView();
    }

    private void printReport() {
        this.console.println("\nEnter the file path and file name where the report is to be saved.");
        Game game = Andromeda.getCurrentGame();
        try {
            String report = keyboard.readLine();
            this.allPlanets(game.getMap(), report);
            this.console.println("\n\nReport saved in " + report);
        } catch (Exception e) {
            ErrorView.display("GameMenuView", e.getMessage());
        }
    }

    private void allPlanets(List<Map> mapReport, String outputLocation) {
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\tPlanets");
            out.printf("%n%-20s%-20s%10s", "System", "Planet","Coordinates");
            out.printf("%n%-20s%-20s%10s", "–––––––––––––––––", "–––––––––––––––––","––––––");

            for (Map map : mapReport) {
                out.printf("%n%-20s", map.getSystem());

                String planet = "";
                String coordinates = "";
                
                for (int i = 0; i <= map.getPlanets().size() - 1; i++) {
                    planet = map.getPlanets().get(i).getName();
                    coordinates = map.getPlanets().get(i).getX()+","+map.getPlanets().get(i).getX();
                    out.printf("%n%-20s%-20s%10s", "", planet,coordinates);
                }

            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
