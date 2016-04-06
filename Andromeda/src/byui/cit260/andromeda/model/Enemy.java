/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import java.io.Serializable;

/**
 *
 * @author Oscar
 */
public class Enemy implements Serializable {

    private String name;
    private String description;
    private double HP;
    private double atck;

    public Enemy() {
        this.name = name;
        this.description = description;
        this.HP = HP;
        this.atck = atck;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getHP() {
        return HP;
    }

    public double getAtck() {
        return atck;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setAtck(double atck) {
        this.atck = atck;
    }

    @Override
    public String toString() {
        return ""
                + "\nName: \t\t" + name 
                + "\nDescription: \t" + description
                + "\nHP: \t\t" + HP 
                + "\nAttack: \t" + atck 
                + "\n";
    }

}
