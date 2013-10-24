/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author CasaPc
 */
public class BuscaNaoEncontradaException extends Exception{

    /**
     *
     * @param string
     */
    public BuscaNaoEncontradaException(String string) {
        super(string);
    }
    
}
