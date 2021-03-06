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
public class ExcelsiorControlTest {
    
    public ExcelsiorControlTest() {
    }

    /**
     * Test of calcRepairs method, of class ExcelsiorControl.
     */
    @Test
    public void testCalcRepairs() {
        System.out.println("calcRepairs");
        int time = 2;
        int cost = 25;
        ExcelsiorControl instance = new ExcelsiorControl();
        double expResult = 50;
        double result = instance.calcRepairs(time, cost, time); // this temporarily fixes it. 
        assertEquals(expResult, result, 0.01);
        
        /***************
         * Test case #2
         **************/
       
        System.out.println("Test case #2");
        time = 2;
        cost = -100;
        
         expResult = -1;
        
         result = instance.calcRepairs(time, cost);
        
         assertEquals(expResult, result, 0.01);
         
         /***************
         * Test case #3
         **************/
       
        System.out.println("Test case #3");
        time = -5;
        cost = 25;
        
         expResult = -1;
        
         result = instance.calcRepairs(time, cost);
        
         assertEquals(expResult, result, 0.01);

    }
    
}
