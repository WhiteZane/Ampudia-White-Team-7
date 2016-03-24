/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.Andromeda.view;

import andromeda.Andromeda;
import java.io.PrintWriter;

/**
 *
 * @author oscar
 */
public class ErrorView {
    private static final PrintWriter errorFile = Andromeda.getOutfile();
    private static final PrintWriter logFile = Andromeda.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
        "---------------------------------------------"
        +"\n- ERROR -" + errorMessage
        +"\n-------------------------------------------");
    
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
