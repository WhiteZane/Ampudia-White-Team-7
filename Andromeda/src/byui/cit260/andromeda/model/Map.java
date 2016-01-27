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
public class Map implements Serializable{
    private String planetName;

    public Map(String planetName) {
        this.planetName = planetName;
    }

    public Map() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.planetName);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "planetName=" + planetName + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.planetName, other.planetName)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
