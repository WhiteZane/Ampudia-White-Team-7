/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author ghosty
 */
public class MaterialResources implements Serializable{
    private int iridium;
    private int palladium;
    private int platinum;

    public MaterialResources() {
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
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.iridium;
        hash = 37 * hash + this.palladium;
        hash = 37 * hash + this.platinum;
        return hash;
    }

    @Override
    public String toString() {
        return "MaterialResources{" + "iridium=" + iridium + ", palladium=" + palladium + ", platinum=" + platinum + '}';
    }
    
   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialResources other = (MaterialResources) obj;
        if (this.iridium != other.iridium) {
            return false;
        }
        if (this.palladium != other.palladium) {
            return false;
        }
        if (this.platinum != other.platinum) {
            return false;
        }
        return true;
    }
    
    
    
    
}
