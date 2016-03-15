/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import byui.cit260.andromeda.model.Enemy;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
class EnemyControl {
    //Use of a one or multidimensional array or ArrayList.
    static List<Enemy> createEnemy(double i) {

        List<Enemy> enemyList = new ArrayList<>();

        if (i <= 3) {

            Enemy pirate = new Enemy();
            pirate.setName("Pirates");
            pirate.setDescription(
                    "\nPirates operate on many worlds in the lawless Terminus Systems. "
                    + "\nSome make their living by scavenging from shipping lanes, or "
                    + "\nrunning lightning raids on lightly-defended outposts. Often "
                    + "\npirates will also be involved in slaving, gun running and many "
                    + "\nother types of criminal endeavours. They usually hide out on "
                    + "\nuncharted worlds, often in abandoned bases or deep underground. ");
            pirate.setHP(100);
            pirate.setAtck(15);
            enemyList.add(pirate);

        } else if (i <= 6 && i > 3) {
            Enemy mercenary = new Enemy();
            mercenary.setName("Mercenaries");
            mercenary.setDescription(
                    "\nMercenaries are individuals that work in mercenary bands that "
                    + "\noperate throughout the galaxy. They are usually hired by "
                    + "\ncriminal organisations that require \"heavy muscle\", or by "
                    + "\nindividuals who want protection or assassination services. "
                    + "\nSometimes euphemistically referring to themselves as \"private "
                    + "\nsecurity organisations\", mercenaries will commonly raid remote "
                    + "\noutposts or unprotected starships when unemployed. ");
            mercenary.setHP(300);
            mercenary.setAtck(20);
            enemyList.add(mercenary);
        } else if (i <= 10 && i > 6) {
            Enemy geth = new Enemy();
            geth.setName("Geth");
            geth.setDescription(
                    "\nThe geth (\"Servant of the People\" in Khelish) are a race of "
                    + "\nnetworked artificial intelligences that reside beyond the"
                    + "\nPerseus Veil. The geth were created by the quarians as laborers "
                    + "\nand tools of war. When the geth became sentient and began to "
                    + "\nquestion their masters, the quarians attempted to exterminate "
                    + "\nthem. The geth won the resulting war, and reduced the quarians "
                    + "\nto a race of nomads. ");
            geth.setHP(600);
            geth.setAtck(100);
            enemyList.add(geth);
        }
        
        return enemyList;
    }

}
