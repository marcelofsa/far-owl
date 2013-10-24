/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author CasaPc
 */
public class UsuarioNaoExisteException extends Exception{

    /**
     *
     * @param string
     */
    public UsuarioNaoExisteException(String string) {
        super(string);
    }
    
}
