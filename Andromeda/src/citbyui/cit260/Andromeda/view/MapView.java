/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Map;
import byui.cit260.andromeda.model.Planet;
import java.util.List;

/**
 *
 * @author oscar
 */
public class MapView extends View {

    public MapView() {
        super(
                "\n————————————————————————— [ Galaxy ] ———————————————————————————"
                + "\n                                                               "
                + "\n  Local Cluster [LC]                                           "
                + "\n                                              Krogan DMZ [KD]  "
                + "\n                                                               "
                + "\n                                                               "
                + "\n                         Crescent Nebula [CN]                  "
                + "\n                                                               "
                + "\n                                                               "
                + "\n        Nubian Expanse [NE]                                    "
                + "\n                                                               "
                + "\n                                           Perseus Veil [PV]   "
                + "\n                                                               "
                + "\n[Enter coordinates – Example: lc]                             "
                + "\nE : Exit to Game Menu"
                + "\n");
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
                this.CrescentNebula();
                break;

            case "NE":
                this.NubianExpanse();
                break;

            case "KD":
                this.KroganDMZ();
                break;

            default:
                ErrorView.display(this.getClass().getName(), "Invalid selection.");
                break;
        }
        return false;
    }

    private void LocalCluster() {
        LocalClusterView localCluster;
        localCluster = new LocalClusterView();
        localCluster.display();
    }

    private void PerseusVeil() {
        Game game = Andromeda.getCurrentGame();
        List<Map> map = game.getMap();
        String secret = "Unknown";
        String x = "?";
        String y = "?";
        int key = 0;

        for (int j = 0; j <= map.size() - 1; j++) {
            List<Planet> planet = map.get(j).getPlanets();
            for (int i = 0; i <= planet.size() - 1; i++) {
                if (planet.get(i).getVisited() == true) {
                    key += 1;
                    if (key == 26) {
                        secret = "Mass Relay";
                        int setX = (int) (Math.random() * 100);
                        int setY = (int) (Math.random() * 100);

                        map.get(4).getPlanets().get(5).setX(setX);
                        map.get(4).getPlanets().get(5).setY(setY);

                        x = Integer.toString(setX);
                        y = Integer.toString(setY);

                        console.println(
                                  "\n\n*************************************************"
                                + "\n*\tYou have discovered a new Location!\t*"
                                + "\n*************************************************\n");
                    }
                }
            }
        }

        PerseusVeilView perseusVeil;
        perseusVeil = new PerseusVeilView(secret, x, y);
        perseusVeil.display();
    }

    private void CrescentNebula() {
        CrescentNebulaView crescentNebula;
        crescentNebula = new CrescentNebulaView();
        crescentNebula.display();
    }

    private void NubianExpanse() {
        NubianExpanseView nubianExpanse;
        nubianExpanse = new NubianExpanseView();
        nubianExpanse.display();
    }

    private void KroganDMZ() {
        KroganSystemView kroganSystem;
        kroganSystem = new KroganSystemView();
        kroganSystem.display();
    }
}
