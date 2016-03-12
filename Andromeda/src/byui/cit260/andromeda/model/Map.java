/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.model;

import byui.cit260.andromeda.control.MapControl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 *
 * @author ghosty
 */
public class Map implements Serializable{
    
    private String system;
    private List<Planet> planets;
    private String coordinates;

    
    public Map(){
    }
    
    public String getSystem(String system) {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    

    @Override
    public String toString() {
        return    "\nMap"
                + "\nSystem: " + system 
                + "\nPlanets: " + planets
                + "\nCoordinates: " + coordinates
                + "\n";
    }
    
}
