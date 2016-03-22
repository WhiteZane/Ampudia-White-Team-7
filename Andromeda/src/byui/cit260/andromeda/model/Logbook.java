/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import java.io.Serializable;

/**
 * @author zane
 * @author oscar
 */
public class Logbook implements Serializable {

    private int planetsExplored = 0;
    private int enemiesEncountered = 0;
    private int enemiesDefeated = 0;
    private int creditsAcquired = 0;

    public Logbook() {

    }

    public int getPlanetsExplored() {
        return planetsExplored;
    }

    public void setPlanetsExplored(int planetsExplored) {
        this.planetsExplored = planetsExplored;
    }

    public int getEnemiesEncountered() {
        return enemiesEncountered;
    }

    public void setEnemiesEncountered(int enemiesEncountered) {
        this.enemiesEncountered = enemiesEncountered;
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public void setEnemiesDefeated(int enemiesDefeated) {
        this.enemiesDefeated = enemiesDefeated;
    }

    public int getCreditsAcquired() {
        return creditsAcquired;
    }

    public void setCreditsAcquired(int creditsAcquired) {
        this.creditsAcquired = creditsAcquired;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.planetsExplored;
        hash = 59 * hash + this.enemiesEncountered;
        hash = 59 * hash + this.enemiesDefeated;
        hash = 59 * hash + this.creditsAcquired;
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
        if (this.planetsExplored != other.planetsExplored) {
            return false;
        }
        if (this.enemiesEncountered != other.enemiesEncountered) {
            return false;
        }
        if (this.enemiesDefeated != other.enemiesDefeated) {
            return false;
        }
        if (this.creditsAcquired != other.creditsAcquired) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Logbook"
                + "\nplanetsExplored:\t" + planetsExplored
                + "\nenemiesEncountered:\t" + enemiesEncountered
                + "\nenemiesDefeated:\t" + enemiesDefeated
                + "\ncreditsAcquired:\t" + creditsAcquired
                + "\n";
    }

}
