/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import exceptions.MapControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zane and oscar
 */
public class MapControlTest {

    public MapControlTest() {
    }

    @Test
    public void testCalcPlanetDistance() throws MapControlException {

        String fromPlanet = "Earth";
        double x1 = 0.0;
        double y1 = 0.0;
        String toPlanet = "Neptune";
        double x2 = 30.0;
        double y2 = 7.0;
        MapControl instance = new MapControl();
        double expResult = 30.8;
        double result = instance.calcPlanetDistance(fromPlanet, x1, y1, toPlanet, x2, y2);
        assertEquals(expResult, result, .01);

        System.out.println("calcPlanetDistance\n\tTest case #1 | Valid");
        
        
        /*
         * ****************
         * Test Case #2
         * ****************
         */
        fromPlanet = "Mars";
        x1 = 2.0;
        y1 = 2.0;
        toPlanet = "Saturn";
        x2 = 8.0;
        y2 = 5.0;

        expResult = -1;
        result = instance.calcPlanetDistance(fromPlanet, x1, y1, toPlanet, x2, y2);
        assertEquals(expResult, result, .01);
        
        System.out.println("\tTest case #2 | Wrong Coordinates");
        
        
        /*
         * ****************
         * Test Case #3
         * ****************
         */

        fromPlanet = "Jupiter";
        x1 = -101.0;
        y1 = 4.0;
        toPlanet = "Uranus";
        x2 = 18.0;
        y2 = 7.0;

        expResult = -1;
        result = instance.calcPlanetDistance(fromPlanet, x1, y1, toPlanet, x2, y2);
        assertEquals(expResult, result, .01);
        
        System.out.println("\tTest case #3 | Out of Range");
    }
    
    @Test
    public void testCalcTime() {
    
        // Test Case #1
        String fromPlanet = "Illium";
        String toPlanet = "Bergale";
        double inputDistance = 11.7;
        int speed = 6;
        MapControl instance2 = new MapControl();
        double expResult = 1.95;
        double result = instance2.calcTime(inputDistance, speed, fromPlanet, toPlanet);
        assertEquals(expResult, result, .01);

        System.out.println("calcTime\n\tTest case #1 | Valid");
        
        // Test Case #2
        fromPlanet = "Illium";
        toPlanet = "Ponolus";
        inputDistance = 52.3;
        speed = 6;
        
        expResult = -1;
        result = instance2.calcTime(inputDistance, speed, fromPlanet, toPlanet);
        assertEquals(expResult, result, .01);

        System.out.println("\tTest case #2 | Wrong distance input");
        
        
        // Test Case #3
        fromPlanet = "Bergale";
        toPlanet = "Illium";
        inputDistance = 11.7;
        speed = 9;
        
        expResult = -1;
        result = instance2.calcTime(inputDistance, speed, fromPlanet, toPlanet);
        assertEquals(expResult, result, .01);

        System.out.println("\tTest case #3 | Speed out of range");
    }
}
