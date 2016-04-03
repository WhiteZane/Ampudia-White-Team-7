/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import andromeda.Andromeda;
import byui.cit260.andromeda.model.Excelsior;
import byui.cit260.andromeda.model.Game;
import byui.cit260.andromeda.model.Material;

/**
 *
 * @author oscar
 */
public class MaterialControl {

    public static Material createPlanetMaterial() {

        Material material = new Material();

        material.setIridium((int) (Math.random() * 10) + 2);
        material.setPalladium((int) (Math.random() * 10) + 2);
        material.setPlatinum((int) (Math.random() * 10) + 2);

        return material;
    }

    public static void addMaterials(int newIridium, int newPalladium, int newPlatinum) {
        Game game = Andromeda.getCurrentGame();
        Excelsior ship = game.getExcelsior();
        Material materials = ship.getMaterials();

        materials.setIridium(newIridium + materials.getIridium());
        materials.setPalladium(newPalladium + materials.getPalladium());
        materials.setPlatinum(newPlatinum + materials.getPlatinum());

    }
}
