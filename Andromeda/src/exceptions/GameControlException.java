/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ghosty
 */
public class GameControlException extends Exception{

    public GameControlException() {
    }

    public GameControlException(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GameControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GameControlException(Throwable thrwbl) {
        super(thrwbl);
    }
    

    
    
    
}
