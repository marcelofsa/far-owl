/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author CasaPc
 */
public class ArquivoNaoSuportadoException extends Exception {

    /**
     *
     * @param string
     */
    public ArquivoNaoSuportadoException(String string) {
        super(string);
    }

}
