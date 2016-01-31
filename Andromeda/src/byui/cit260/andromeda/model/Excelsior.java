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
 * @author oscar
 */
public class Excelsior implements Serializable{
    
    private String description;
    private int shipIntegrity;
    private int armor;
    private int weapons;
    private int crew;
    private int credits;

    public Excelsior(String description, int shipIntegrity, int armor, int weapons, int crew, int credits) {
        this.description = description;
        this.shipIntegrity = shipIntegrity;
        this.armor = armor;
        this.weapons = weapons;
        this.crew = crew;
        this.credits = credits;
    }

    public Excelsior() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getShipIntegrity() {
        return shipIntegrity;
    }

    public void setShipIntegrity(int shipIntegrity) {
        this.shipIntegrity = shipIntegrity;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getWeapons() {
        return weapons;
    }

    public void setWeapons(int weapons) {
        this.weapons = weapons;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.shipIntegrity;
        hash = 29 * hash + this.armor;
        hash = 29 * hash + this.weapons;
        hash = 29 * hash + this.crew;
        hash = 29 * hash + this.credits;
        return hash;
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
        final Excelsior other = (Excelsior) obj;
        if (this.shipIntegrity != other.shipIntegrity) {
            return false;
        }
        if (this.armor != other.armor) {
            return false;
        }
        if (this.weapons != other.weapons) {
            return false;
        }
        if (this.crew != other.crew) {
            return false;
        }
        if (this.credits != other.credits) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Excelsior{" + "description=" + description + ", shipIntegrity=" + shipIntegrity + ", armor=" + armor + ", weapons=" + weapons + ", crew=" + crew + ", credits=" + credits + '}';
    }
    
}
