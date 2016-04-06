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

    public void displayCalcDistanceView(int system) throws MapControlException {
        boolean done = false;
        do {
            //From Planet
            console.println("From planet: ");
            String fromPlanet = this.getInput();
            if (fromPlanet.toUpperCase().equals("E")) {
                return;
            }
            console.println("Coodinates\nx: ");
            double x1 = Double.parseDouble(this.getNumber());
            console.println("y: ");
            double y1 = Double.parseDouble(this.getNumber());

            //To Planet
            console.println("\nTo planet: ");
            String toPlanet = this.getInput();
            console.println("Coodinates\nx: ");
            double x2 = Double.parseDouble(this.getNumber());
            console.println("y: ");
            double y2 = Double.parseDouble(this.getNumber());

            done = this.doAction(system, fromPlanet, x1, y1, toPlanet, x2, y2);
        } while (!done);
    }

    public CalcDistanceView(int system) {
        if (system == 0) {
            this.console.print(
                    "\n\nCalculate the distance between planets in Astronomical Units(AU)."
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
                    + "\n                                                                "
                    + "\n");
        }
        if (system == 1) {
            this.console.print(
                    "\n\nCalculate the distance between planets in Astronomical Units(AU)."
                    + "\n"
                    + "\n————————————————————— [ Crescent Nebula ] ——————————————————————"
                    + "\n                                                                "
                    + "\n                                                  o Ponolus     "
                    + "\n                                                    [46][25]    "
                    + "\n                                          º Illium              "
                    + "\n                                            [11][4]             "
                    + "\n                                o Beregale                      "
                    + "\n                                     [0][0]                     "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n        ¨O Thail                                                 "
                    + "\n           [-88][-38]                                           "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\nO Naxell                                                        "
                    + "\n  [-120][-280]                                                  "
                    + "\n");
        }
        if (system == 2) {
            this.console.print(
                    "\n\nCalculate the distance between planets in Astronomical Units(AU)."
                    + "\n"
                    + "\n—————————————————————— [ Nubian Expanse ] ——————————————————————"
                    + "\n-O- Gamayun                                                     "
                    + "\n    [-25][36]                                                   "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n    o Alkonost                                                  "
                    + "\n       [-21][5]                                                 "
                    + "\n                             º Bannik                           "
                    + "\n                                [0][0]                          "
                    + "\n                                             O Pragia           "
                    + "\n                                               [13][-13]        "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                 . Zimitra      "
                    + "\n                                                   [34][-48]    "
                    + "\n                                                                "
                    + "\n");
        }
        if (system == 3) {
            this.console.print(
                    "\n\nCalculate the distance between planets in Astronomical Units(AU)."
                    + "\n"
                    + "\n—————————————————————— [ Krogan DMZ ] ———————————————————————"
                    + "\n                                                   o Ruam       "
                    + "\n                                                     [32][66]   "
                    + "\n                                                 º Tuchanka     "
                    + "\n                                                    [33][60]    "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                     .Oº Kruban                                 "
                    + "\n                          [5][6]                                "
                    + "\n           º Durak                                              "
                    + "\n             [0][0]                                             "
                    + "\n        o Kanin                                                 "
                    + "\n          [-2][-1]                                              "
                    + "\n                                                                "
                    + "\n");
        }

        if (system == 4) {
            this.console.print(
                    "\n\nCalculate the distance between planets in Astronomical Units(AU)."
                    + "\n"
                    + "\n——————————————————————— [ Perseus Veil ] ———————————————————————"
                    + "\n      O Uriyah                                        * Unknown "
                    + "\n        [-2][6]                                          [?][?] "
                    + "\n                                                                "
                    + "\n     o Rannoch                                                  "
                    + "\n        [-2][2]                                                 "
                    + "\n                                                                "
                    + "\n                   ¨o*’.- Geth Debris Field                     "
                    + "\n                                [0][0]                          "
                    + "\n                        . Geth Dreadnought                      "
                    + "\n                                [1][-1]                         "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                                                "
                    + "\n                                             . Migrant Fleet    "
                    + "\n                                                      [2][-4]   "
                    + "\n                                                                "
                    + "\n");
        }

    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String selection = "";
        boolean valid = false;

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(), "Value can not be blank.");
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
                ErrorView.display(this.getClass().getName(), "Value can not be blank.");
                continue;
            }
            try {
                Double.parseDouble(selection);
                valid = true;
            } catch (NumberFormatException nfe) {
                ErrorView.display(this.getClass().getName(), "The value must be a number.");
            }
        }
        return selection;
    }

    public boolean doAction(int system, String fromPlanet, double x1, double y1, String toPlanet, double x2, double y2) throws MapControlException {

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
