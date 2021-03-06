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
public class Game implements Serializable {

    private Player player;
    private Excelsior excelsior;
    private List<Map> map;
    private String totalTime;
    private List<Weapon> weapons;

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
    
    
    public Game() {

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Excelsior getExcelsior() {
        return excelsior;
    }

    public void setExcelsior(Excelsior excelsior) {
        this.excelsior = excelsior;
    }

    public List<Map> getMap() {
        return map;
    }

    public void setMap(List<Map> map) {
        this.map = map;
    }
    

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.totalTime);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nGame"
                + "\nPlayer " + player
                + "\nExcelsior: " + excelsior
                + "\nMap"
                + "\n" + map
                + "\n\nTotalTime:\t" + totalTime
                + "\n";
    }

}
