/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author oscar
 */
public class Excelsior implements Serializable{
    
    private final String description = 
            "\nThe Excelsior was a Systems Alliance starship. She is a prototype "
            + "\n\"deep scout\" frigate, first of the eponymous Normandy class, "
            + "\nco-developed by the Alliance and the Turian Hierarchy with the "
            + "\nsponsorship of the Citadel Council. She is optimized for solo "
            + "\nreconnaissance missions deep within unstable regions, using "
            + "\nstate-of-the-art stealth technology powered by an experimental "
            + "\ndrive core. ";
    private int shipIntegrity = 100;
    private int armor = 100;
    List<Weapon> weapons;
    private int crew = 10;
    private int credits = 500;
    Planet planet;
    List<Material> materials;
    
    public Excelsior() {
        
    }

    public String getDescription() {
        return description;
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

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
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

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.shipIntegrity;
        hash = 29 * hash + this.armor;
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
        return "\nExcelsior"
                + "\nDescription:\t" + description
                + "\nShipIntegrity:\t" + shipIntegrity
                + "\nArmor:\t\t" + armor
                + "\nWeapons:\t" + weapons
                + "\nCrew:\t\t" + crew 
                + "\nCredits:\t" + credits 
                + "\n\nMaterials\n" + materials
                + "\n\nCurrent Planet" + planet
                + "\n";
    }
    
}
