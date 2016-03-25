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
public class ExploreLocationView extends View {

    public ExploreLocationView() {
        super(
                "\n\t∞∞∞ Exploration ∞∞∞"
                + "\nItems found:"
                + "\nIridium +(random number)"
                + "\nPaladium +(random number)"
                + "\nPlatinum +(random number)"
                + "\n"
                + "\nNew crew members +(random number)"
                + "\n"
                + "\nE : Exit");
    }

    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "E":
                this.exit();
                break;

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }

        return false;
    }

    private void exit() {
        ExploreLocationView exitMenu = new ExploreLocationView();
        exitMenu.display();
    }
}
