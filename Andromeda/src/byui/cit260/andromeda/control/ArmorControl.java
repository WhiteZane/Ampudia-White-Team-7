/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.andromeda.control;

import static java.lang.Integer.parseInt;

/**
 *
 * @author zane
 */
public class ArmorControl {
    public double armorChoice(String result){
        
        
      int choice = parseInt(result);
        
      System.out.println(" Armor Upgrade Menu");  
    
      if(choice == 1){
          System.out.println("you have chosen Shield effeciency");
      return choice;
      }else{
              return -1;
              }
    }

    
        
    
    
            
}
