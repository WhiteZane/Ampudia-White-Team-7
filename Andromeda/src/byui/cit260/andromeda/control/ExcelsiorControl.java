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
public class ExcelsiorControl {
    public double calcRepairs( int time, int cost){
    
        int repairCost;
        if ((time >= 1 && time <=10) && (cost >=1 && cost <=100)){
            repairCost = time * cost;
            
            if( repairCost >= 1000){
            return -1;
            }
        return repairCost;
        
        
        }
    return -1;
    }
}
