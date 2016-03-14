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
public class Weapon implements Serializable{
    
    private String name;
    private double attackpoints;
    private int quantity;

    public Weapon() {
        this.name = name;
        this.attackpoints = attackpoints;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackpoints() {
        return attackpoints;
    }

    public void setAttackpoints(double attackpoints) {
        this.attackpoints = attackpoints;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "\nWeapon" + name
                + "\nAttack points: \t" + attackpoints
                + "\nQuantity:\t" + quantity
                + "\n";
    }
    
    
}
