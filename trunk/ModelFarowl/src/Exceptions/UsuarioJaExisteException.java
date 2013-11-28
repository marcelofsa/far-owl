/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author CasaPc
 */
public class UsuarioJaExisteException extends Exception {

    /**
     *
     * @param string
     */
    public UsuarioJaExisteException(String string) {
        super(string);
    }

}
