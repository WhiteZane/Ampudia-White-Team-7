/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import byui.cit260.andromeda.control.ArmorControl;
import byui.cit260.andromeda.model.Excelsior;
import exceptions.ExcelsiorControlExceptions;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zane 
 */
public class ArmorView extends View{
    public ArmorView() {
        super(
                "…………………………………………………………………………………"
                + "\n  Enforce Armor"
                + "\n…………………………………………………………………………………"
                + "\nC : Check ship Status"
                + "\nU : Upgrade Ship Armor"
                + "\nE : Return to Location Menu ");
    }
    
    public boolean doAction(String repairOption) {

        repairOption = repairOption.toUpperCase();

        switch (repairOption) {

            case "C":
                this.checkStatus();
                break;
            case "U":
                this.upgradeArmor();
                break;

            default:
                this.console.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }
    
    
    private void checkStatus() {
        Excelsior excelsior = new Excelsior();
        int status = excelsior.getShipIntegrity();
        this.console.println("\n\t Ship Status:  " + status);
        if (status == 100) {
            this.console.println("\t Excelsior has taken no damage");
        } else if (status <= 90) {
            this.console.println("\t Excelsior has taken minor damage");

        } else if (status <= 80) {
            this.console.println("\t Excelsior has taken moderate damage");
        } else if (status <= 70) {
            this.console.println("\t Excelsior has taken moderate damage");
        } else if (status <= 60) {
            this.console.println("\t Excelsior has taken major damage");
        } else if (status <= 50) {
            this.console.println("\t Excelsior has taken major damage");
        }
    }
    private void upgradeArmor() {
        
        ArmorControl armorUpgrade = new ArmorControl();
        Scanner inputs = new Scanner(System.in);
        
        String result;
        
        
        this.console.println("******Armor Upgrade Menu**********"
                            + "\nSelect an upgrade to purchase it"
                            + "\n\t1. Upgrade shield effeciency reduce damage by 1"
                            + "\n\t Upgrade cost: 5 iridium "
                            + "\n\t2. Upgrade shield capicitors reduce damage by 2"
                            + "\n\t Upgrade cost 10 iridium");
        
        
        result = inputs.next();
        
        double total;
        total = armorUpgrade.armorChoice(result);
        
        
        
        
        
        
        
    }
    
    
}
