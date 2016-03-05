/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import byui.cit260.andromeda.model.Excelsior;

/**
 *
 * @author ghosty
 */
public class RepairShip extends View {

    Excelsior excelsior = new Excelsior();
    int status = excelsior.getShipIntegrity();

    public RepairShip() {
        super(
                "…………………………………………………………………………………"
                + "\n  Repair Menu"
                + "\n…………………………………………………………………………………"
                + "\nC : Check ship Status"
                + "\nO : Repair orders"
                + "\nM : Make Repairs "
                + "\nE : Return to Location Menu ");
    }

    public boolean doAction(String repairOption) {

        repairOption = repairOption.toUpperCase();

        switch (repairOption) {

            case "C":
                this.checkStatus();
                break;
            case "O":
                this.repairOrders();
                break;
            case "M":
                this.makeRepairs();
                break;

            default:
                System.out.println("\n*** Error *** Invalid selection. Try again.");
                break;
        }
        return false;
    }

    private void checkStatus() {
        Excelsior excelsior = new Excelsior();
        int status = excelsior.getShipIntegrity();
        System.out.println("\n\t Ship Status:  " + status);
        if (status == 100) {
            System.out.println("\t Excelsior has taken no damage");
        } else if (status <= 90) {
            System.out.println("\t Excelsior has taken minor damage");

        } else if (status <= 80) {
            System.out.println("\t Excelsior has taken moderate damage");
        } else if (status <= 70) {
            System.out.println("\t Excelsior has taken moderate damage");
        } else if (status <= 60) {
            System.out.println("\t Excelsior has taken major damage");
        } else if (status <= 50) {
            System.out.println("\t Excelsior has taken major damage");
        }
    }

    private void repairOrders() {
        Excelsior excelsior = new Excelsior();
        int status = excelsior.getShipIntegrity();
        if (status == 100) {
            System.out.println("\t Excelsior has no repairs to be made");
        } else if (status <= 90) {
            System.out.println("\t Excelsior has taken minor damage"
                    + "\n repair costs : shield generator 3 platinum 1 hour "
                    + "\n\t\tshield alignment module 2 paladium 1 hour");
        } else if (status <= 80) {
            System.out.println("\t Excelsior has taken moderate damage"
                    + "\n repair costs : shield generator 3 platinum 1 hour "
                    + "\n\t\tshield alignment module 2 paladium 1 hour"
                    + "\n\t\tminor hull damage module 2 iriduim 2 hours");
        } else if (status <= 70) {
            System.out.println("\t Excelsior has taken moderate damage"
                    + "\n repair costs : shield generator 4 platinum 1 hour "
                    + "\n\t\tshield alignment module 2 paladium 1 hour"
                    + "\n\t\ttminor hull damage module 3 iriduim 2 hours");
        } else if (status <= 60) {
            System.out.println("\t Excelsior has taken major damage"
                    + "\n repair costs : shield generator 4 platinum 1 hour "
                    + "\n\t\tshield alignment module 2 paladium 1 hour"
                    + "\n\t\tmoderate hull damage    5 iriduim  4 hours");
        } else if (status <= 50) {
            System.out.println("\t Excelsior has taken major damage"
                    + "\n repair costs : shield generator 4 platinum 1 hour "
                    + "\n\t\tshield alignment module 4 paladium 1 hour"
                    + "\n\t\tsevere hull damage      5 iriduim  5 hours"
                    + "\n\t\tDamage to weapons and engine 3 paladium 2 hours");
        }
    }

    private void makeRepairs() {
        System.out.println("To make repairs you need to calculate the repair Orders"
                + "\n To calculate repair orders use this formula: "
                + " Repairs = (Cost * time) "
                + "\nEnter Repair here: ");
    }
}
