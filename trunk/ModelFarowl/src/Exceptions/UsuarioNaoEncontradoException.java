/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author CasaPc
 */
public class UsuarioNaoEncontradoException extends Exception{

    /**
     *
     * @param string
     */
    public UsuarioNaoEncontradoException(String string) {
        super(string);
    }
    
}
