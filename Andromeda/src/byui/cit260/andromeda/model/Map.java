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
    private Map[] map;

    public Map[] getMap() {
        return map;
    }

    public void setMap(Map[] map) {
        this.map = map;
    }


    public Map() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.map);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "planetName=" + map + '}';
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
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
