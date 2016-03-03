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
public class MapView extends View{

    public MapView() {
        super("\n————————————————————————— [ Galaxy ] ———————————————————————————"
                + "\n                                                               "
                + "\n  Local Cluster [LC]                                           "
                + "\n                                                               "
                + "\n                                              Perseus Veil [PV]"
                + "\n                                                               "
                + "\n                         Crescent Nebula [CN]                  "
                + "\n                                                               "
                + "\n                                                               "
                + "\n        Nubian Expanse [NE]                                    "
                + "\n                                                               "
                + "\n                                           Krogan System [KS]  "
                + "\n"
                + "\nE : Exit to Game Menu");
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "LC":
                this.LocalCluster();
                break;

            case "PV":
                this.PerseusVeil();
                break;

            case "CN":
                System.out.println("\n\n\t*** In development… ***\n\n");
                break;

            case "NE":
                System.out.println("\n\n\t*** In development… ***\n\n");
                break;

            case "KS":
                System.out.println("\n\n\t*** In development… ***\n\n");
                break;

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void LocalCluster() {
        LocalClusterView localCluster;
        localCluster = new LocalClusterView();
        localCluster.displayLocalClusterView();
    }

    private void PerseusVeil() {
        PerseusVeilView perseusVeil;
        perseusVeil = new PerseusVeilView();
        perseusVeil.display();
    }

}
