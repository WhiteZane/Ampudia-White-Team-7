/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import byui.cit260.andromeda.model.Material;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class MaterialControl {

    public static List<Material> createMaterialsList() {

        List<Material> material = new ArrayList<>();

        Material shipMaterials = new Material();
        shipMaterials.setIridium(5);
        shipMaterials.setPalladium(10);
        shipMaterials.setPlatinum(5);

        material.add(shipMaterials);

        return material;
    }
}
