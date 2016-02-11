/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

/**
 *
 * @author ghosty
 */
public class MapControl{
    public double calcPlanetDistance(double xOne, double xTwo, double yOne, double yTwo ){
    
        double distance;
        if (( xOne < -100 || xOne > 100 )||(yOne < -100 || yOne > 100) ){
            return -1;
            
        }
        if (( xTwo < -100 || xTwo > 100 )||(yTwo < -100 || yTwo > 100) ){
            return -1;
        }
       
        //if ((xOne && yOne == planet coordinates)&&(xTwo and yTwo == planet coordinates)){
                  distance = Math.sqrt( Math.pow((xTwo-xOne), 2) + Math.pow((yTwo-yOne),2));
                  // distance == planet 
                  if (distance == 23.0){ 
                      return distance;
                  }
                  return -1;
    
                 
                  
    }
}
