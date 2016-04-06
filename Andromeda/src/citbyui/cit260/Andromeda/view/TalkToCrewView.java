/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

/**
 *
 * @author oscar
 */
public class TalkToCrewView extends View {

    public TalkToCrewView() {
        super(
                "\n…………………………………………………………………………………"
                + "\n  Talk to Crew"
                + "\n…………………………………………………………………………………"
                + "\n"
                + "\n *** Shows a message based on the game progress. ***"
                + "\n"
                + "\nE : Exit");
    }

    public boolean doAction(String choice) {
        return false;
    }
}
