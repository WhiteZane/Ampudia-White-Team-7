/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import java.util.Scanner;
import byui.cit260.andromeda.control.MapControl;
import exceptions.MapControlException;

/**
 *
 * @author oscar
 */
public class CalcDistanceView {

    public void displayCalcDistanceView() throws MapControlException {
        boolean done = false;
        do {
            //From Planet
            System.out.print("From planet: ");
            String fromPlanet = this.getInput();
            if (fromPlanet.toUpperCase().equals("E")) {
                return;
            }
            System.out.print("Coodinates\nx: ");
            double x1 = Double.parseDouble(this.getNumber());
            System.out.print("y: ");
            double y1 = Double.parseDouble(this.getNumber());

            //To Planet
            System.out.print("\nTo planet: ");
            String toPlanet = this.getInput();
            System.out.print("Coodinates\nx: ");
            double x2 = Double.parseDouble(this.getNumber());
            System.out.print("y: ");
            double y2 = Double.parseDouble(this.getNumber());

            done = this.doAction(fromPlanet, x1, y1, toPlanet, x2, y2);
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
        System.out.println(menu);
    }

    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String selection = "";
        boolean valid = false;

        while (!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {
                System.out.println("\n\t*** Error *** Value can not be blank.");
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
                System.out.println("\n*** Error *** Value can not be blank.\n");
                continue;
            }
            try {
                Double.parseDouble(selection);
                valid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("\n*** Error *** The value is not a number.");
            }
        }
        return selection;
    }

    public boolean doAction(String fromPlanet, double x1, double y1, String toPlanet, double x2, double y2) throws MapControlException {

        MapControl distance = new MapControl();
        //double value = distance.calcPlanetDistance(fromPlanet, x1, y1, toPlanet, x2, y2);

        try {
            double value = distance.calcPlanetDistance(fromPlanet, x1, y1, toPlanet, x2, y2);
            this.displayNextView(value, fromPlanet, toPlanet);
        } catch (MapControlException me){
            System.out.println(me.getMessage());
        }
        return true;
    }

    private void displayNextView(double value, String fromPlanet, String toPlanet) {
        double fixedValue = Math.round(value * 10) / 10.0;
        System.out.println(
                "\n*****************************************************************"
                + "\n\t" + fixedValue + " AU is the distance between " + fromPlanet + " and " + toPlanet + "."
                + "\n*****************************************************************"
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
