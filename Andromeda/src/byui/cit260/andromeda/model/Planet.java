/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import java.io.Serializable;

/**
 *
 * @author ghosty
 */
public enum Planet implements Serializable {
    Earth, Mars, Jupiter, Saturn, Uranus, Neptune,
    Naxell, Thail, Beregale, Illium, Ponolus,
    Gamayun, Alkonost, Bannik, Pragia, Zimitra,
    Ruam, Tuchanka, Kruban, Durak, Kanin,
    Uriyah, Rannoch, GethDebrisField, GethDreadnought, MigrantFleet, MassRelay;

    private String name;
    private String description;
    private String system;
    private Boolean visited;
    private Boolean explored;
    private int x;
    private int y;
    private String enemy;
    
    Planet(){
        this.name = null;
        this.description = null;
        this.system = null;
        this.visited = false;
        this.x = 0;
        this.y = 0;
        this.enemy = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Boolean getExplored() {
        return explored;
    }

    public void setExplored(Boolean explored) {
        this.explored = explored;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    @Override
    public String toString() {
        return "Planet"
                + "\nName=" + name
                + "\nDescription=" + description
                + "\nSystem=" + system
                + "\nVisited=" + visited
                + "\nExplored=" + explored
                + "\nx=" + x
                + "\ny=" + y
                + "";
    }

}
