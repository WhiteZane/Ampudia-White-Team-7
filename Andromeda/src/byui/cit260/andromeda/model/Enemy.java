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
public enum Enemy implements Serializable {

    Enemy1("description 1."),
    Enemy2("description 2."),
    Enemy3("description 3."),
    Enemy4("description 4."),
    Enemy5("description 5.");

    private final String description;

    private final double hitPoints;
    private final double attackPoints;

    Enemy(String description) {

        this.description = description;
        this.hitPoints = 15;
        this.attackPoints = 5; 
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Enemy{" + "name=" + ", description=" + description + '}';
    }

}
