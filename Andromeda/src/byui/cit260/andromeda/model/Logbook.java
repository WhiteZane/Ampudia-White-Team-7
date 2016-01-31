/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import java.io.Serializable;

/**
 *
 * @author oscar
 */
public class Logbook implements Serializable{
    
    private int explored;
    private int encounter;
    private int credits;

    public Logbook(){
        
    }
    
    public int getExplored() {
        return explored;
    }

    public void setExplored(int explored) {
        this.explored = explored;
    }

    public int getEncounter() {
        return encounter;
    }

    public void setEncounter(int encounter) {
        this.encounter = encounter;
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
        hash = 89 * hash + this.explored;
        hash = 89 * hash + this.encounter;
        hash = 89 * hash + this.credits;
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
        final Logbook other = (Logbook) obj;
        if (this.explored != other.explored) {
            return false;
        }
        if (this.encounter != other.encounter) {
            return false;
        }
        if (this.credits != other.credits) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Logbook{" + "explored=" + explored + ", encounter=" + encounter + ", credits=" + credits + '}';
    }
    
    
}
