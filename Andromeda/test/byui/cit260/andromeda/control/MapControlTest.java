/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ghosty
 */
public class MapControlTest {
    
    public MapControlTest() {
    }
    @Test
    public void testCalcPlanetDistance(){
        System.out.println("calcPlanetDistance");
        double xOne = 0.0;
        double xTwo = 0.0;
        double yOne = 30.0;
        double yTwo = 7.0;
        MapControl instance = new MapControl();
        double expResult = 23.0;
        double result = instance.calcPlanetDistance(xOne, xTwo, yOne, yTwo);
        assertEquals(expResult, result, .01);
    
    /******************
     * Test Case #2
     *****************/
    System.out.println("\tTest case #2");
        
        xOne = 2.0;
        yOne = 2.0;
        xTwo = 8.0;
        yTwo = 5.0;
        
        expResult = -1;
        
        result = instance.calcPlanetDistance(xOne, xTwo, yOne, yTwo);
        
        assertEquals(expResult, result, 0.01);
    
    /******************
     * Test Case #3
     *****************/
    System.out.println("\tTest case #3");
        
        xOne = -101.0;
        xTwo = 4.0;
        yOne = 18.0;
        yTwo = 7.0;
        
        expResult = -1;
        
        result = instance.calcPlanetDistance(xOne, xTwo, yOne, yTwo);
        
        assertEquals(expResult, result, 0.01);
    
        
    }
}
