/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.control.GameControl;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author oscar
 */
public class LogBookView extends View {

    static Game game = Andromeda.getCurrentGame();
    static List<Map> map = game.getMap();

    public static String displayList() {
        String system = "";
        String list = "";
        for (int i = 0; i <= map.size() - 1; i++) {
            for (int j = 0; j <= map.get(i).getPlanets().size() - 1; j++) {
                if (map.get(i).getPlanets().get(j).getVisited() == true) {
                    list += map.get(i).getPlanets().get(j).getName() + ", ";

                }
            }
            if (list == "") {

            } else {
                list = list.substring(0, list.length() - 2) + ".";
                system += "\n\n  " + map.get(i).getSystem() + ":   \t" + list;
                list = "";
            }
        }
        return system;
    }

    public LogBookView() {
        super(
                "…………………………………………………………………………………"
                + "\n  Logbook"
                + "\n…………………………………………………………………………………"
                + "\nLocations visited"
                + displayList() + "\n"
                + "\nEnemies encountered:\t(Not implemented yet)"
                + "\nEnemies defeated:\t(Not implemented yet)"
                + "\nTotal credits acquired:\t(Not implemented yet)"
                + "\n"
                + "\nP : Print Map Report"
                + "\n"
                + "\nE : Exit to Game Menu"
                + "\n");
    }

    public boolean doAction(String helpOption) {

        helpOption = helpOption.toUpperCase();

        switch (helpOption) {
            case "P":
                this.printReport();
                break;

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void printReport() {
        this.console.println("\nEnter the file path and file name where the report is to be saved.");
        Game game = Andromeda.getCurrentGame();
        try {
            String report = keyboard.readLine();
            GameControl.printReport(game.getMap(), report);
            allPlanets(game.getMap(), report);
            this.console.println(
                      "\n*****************************************************************"
                    + "\n\tThe report was printed successfully to \"" + report + "\""
                    + "\n*****************************************************************");
        } catch (Exception e) {
            ErrorView.display("GameMenuView", e.getMessage());
        }
    }

    private void allPlanets(List<Map> mapReport, String outputLocation) {
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\nPLANETS LIST");
            out.printf("%n%-20s%-22s%-15s%-10s",
                    "SYSTEM", "PLANET", "COORDINATES", "VISITED");
            out.printf("%n%-20s%-22s%-15s%-10s",
                    "–––––––––––––––––", "––––––––––––––––––––", "––––––––––––", "––––––––––––");

            for (Map map : mapReport) {
                out.printf("%n%-20s", map.getSystem());

                String planet = "";
                String coordinates = "";
                boolean visited;

                for (int i = 0; i <= map.getPlanets().size() - 1; i++) {
                    planet = map.getPlanets().get(i).getName();
                    coordinates = map.getPlanets().get(i).getX() + "," + map.getPlanets().get(i).getX();
                    visited = map.getPlanets().get(i).getVisited();
                    out.printf("%n%-20s%-22s%-15s%-10b",
                            "", planet, coordinates, visited);
                }
            }
        } catch (Exception e) {
            ErrorView.display("GameMenuView", e.getMessage());
        }
    }

}
