/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import byui.cit260.andromeda.model.Excelsior;
import exceptions.ExcelsiorControlExceptions;
import static java.lang.Integer.parseInt;


/**
 *
 * @author zane & oscar
 */
public class ExcelsiorControl {

    public double calcRepairs(String hours,  String repair,  String totals) throws ExcelsiorControlExceptions {
            
        
        Excelsior excelsior = new Excelsior();
        int status = excelsior.getShipIntegrity();

        int repairCost;
        
        int time = parseInt(hours);
        int cost = parseInt(repair);
        int total = parseInt(totals);
        
        try{
        if ((time >= 1 && time <= 10) && (cost >= 1 && cost <= 100)) {
            repairCost = time * cost;

            if (repairCost >= 1000) {
                throw new ExcelsiorControlExceptions("\n*** Error *** Repair out of boundaries");
            }
            if (repairCost == total) {
                System.out.println("Repairs Succesful");
                excelsior.setShipIntegrity(100);
            }
            else{
                throw new ExcelsiorControlExceptions("\n*** Error *** Failed to repair");
            
            }
            return repairCost;
            

        }
        
    
    } catch(NumberFormatException e) { 
        
    }
    
        return -1;
    
    }
     
}
        
     
    
    



    
