/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import java.util.Scanner;
import byui.cit260.andromeda.control.MapControl;
import exceptions.MapControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author oscar
 */
public class CalcDistanceView {

    protected final BufferedReader keyboard = Andromeda.getInfile();
    protected final PrintWriter console = Andromeda.getOutFile();

    public void displayCalcDistanceView() throws MapControlException {
        boolean done = false;
        do {
            //From System
            String system = "Local Cluster";
            //From Planet
            this.console.println("From planet: ");
            String fromPlanet = this.getInput();
            if (fromPlanet.toUpperCase().equals("E")) {
                return;
            }
            this.console.println("Coodinates\nx: ");
            double x1 = Double.parseDouble(this.getNumber());
            this.console.println("y: ");
            double y1 = Double.parseDouble(this.getNumber());

            //To Planet
            this.console.println("\nTo planet: ");
            String toPlanet = this.getInput();
            this.console.println("Coodinates\nx: ");
            double x2 = Double.parseDouble(this.getNumber());
            this.console.println("y: ");
            double y2 = Double.parseDouble(this.getNumber());

            done = this.doAction(system, fromPlanet, x1, y1, toPlanet, x2, y2);
        } while (!done);
    }

    private String menu;

    public CalcDistanceView() {
        this.menu
                = "\n\nCalculate the distance between planets in Astronomical Units(AU)."
                + "\n"
                + "\n—————————————————————— [ Local Cluster ] ———————————————————————"
                + "\n                                                                "
                + "\n                                o Uranus   o Neptune            "
                + "\n                                  [18][7]     [30][7]           "
                + "\n                    -O- Saturn                                  "
                + "\n                         [8][5]                                 "
                + "\n              O Jupiter                                         "
                + "\n                  [4][4]                                        "
                + "\n                                                                "
                + "\n    . Mars                                                      "
                + "\n      [1][1]                                                    "
                + "\n. Earth                                                         "
                + "\n  [0][0]                                                        "
                + "\n                                                                ";
        this.console.println(menu);
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String selection = "";
        boolean valid = false;

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(),"\n* Value can not be blank.");
                continue;
            }
            break;
        }
        return selection;
    }

    private String getNumber() {
        Scanner keyboard = new Scanner(System.in);
        String selection = "";
        boolean valid = false;

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(),"\n* Value can not be blank.\n");
                continue;
            }
            try {
                Double.parseDouble(selection);
                valid = true;
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "\n* The value must be a number.");
            }
        }
        return selection;
    }

    public boolean doAction(String system, String fromPlanet, double x1, double y1, String toPlanet, double x2, double y2) throws MapControlException {

        MapControl distance = new MapControl();

        try {
            double value = distance.calcPlanetDistance(system, fromPlanet, x1, y1, toPlanet, x2, y2);
            this.displayNextView(value, fromPlanet, toPlanet);
        } catch (MapControlException me) {
            ErrorView.display(this.getClass().getName(), me.getMessage());
        }
        return true;
    }

    private void displayNextView(double value, String fromPlanet, String toPlanet) {
        double fixedValue = Math.round(value * 10) / 10.0;
        this.console.println(
                "\n*****************************************************************"
                + "\n\t" + fixedValue + " AU is the distance between " + fromPlanet + " and " + toPlanet + "."
                + "\n*****************************************************************"
        );
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
