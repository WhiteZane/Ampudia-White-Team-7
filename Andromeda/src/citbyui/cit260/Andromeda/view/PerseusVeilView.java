/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class PerseusVeilView extends View{



    public PerseusVeilView() {
       super("——————————————————————— [ Perseus Veil ] ———————————————————————"
                + "\n      O Uriyah                                         ! Unknown"
                + "\n        [-2][6]                                           [?][?]"
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
                + "\n[Enter coordinates – Example: 4,4]"
                + "\nE : Return to Galaxy Map");
    }

    String planet = "";

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "-2,6":
                planet = "Uriyah";
                this.moveToLocation();
                break;

            case "-2,2":
                planet = "Rannoch";
                this.moveToLocation();
                break;

            case "0,0":
                planet = "Geth Debris Field";
                this.moveToLocation();
                break;

            case "1,-1":
                planet = "Geth Dreadnought";
                this.moveToLocation();
                break;

            case "2,-4":
                planet = "Migrant Fleet";
                this.moveToLocation();
                break;

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void moveToLocation() {
        LocationMenuView locationMenu;
        locationMenu = new LocationMenuView(planet);
        locationMenu.displayLocationMenu(planet);
    }

    private void exit() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
