/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import java.io.Serializable;

/**
 *
 * @author ghosty
 */

public class Material implements Serializable {

    private int iridium;
    private int palladium;
    private int platinum;

    public Material() {
        this.iridium = iridium;
        this.palladium = palladium;
        this.platinum = platinum;
    }

    public int getIridium() {
        return iridium;
    }

    public void setIridium(int iridium) {
        this.iridium = iridium;
    }

    public int getPalladium() {
        return palladium;
    }

    public void setPalladium(int palladium) {
        this.palladium = palladium;
    }

    public int getPlatinum() {
        return platinum;
    }

    public void setPlatinum(int platinum) {
        this.platinum = platinum;
    }

    @Override
    public String toString() {
        return "\nIridium:\t" + iridium 
                + "\nPalladium:\t" + palladium 
                + "\nPlatinum:\t" + platinum 
                + "\n";
    }
    
    
}



/*public enum Material implements Serializable {

iridium("rare metal", 5),
palladium("rare metal", 10),
platinum("rare metal", 5);

private final String description;
private final int amount;

private Material(String description, int amount) {
this.description = description;
this.amount = amount;
}


public String getDescription() {
return description;
}

public int getAmount() {
return amount;
}

@Override
public String toString() {
return "\nMaterialResources"
+ "\nIridium: " + this.iridium.amount
+ "\nPalladium: " + this.palladium.amount
+ "\nPlatinum: " + this.platinum.amount
+ "\n";
}

}*/