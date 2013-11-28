/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author CasaPc
 */
public class EmailDeCadastroNaoExiste extends Exception {

    /**
     *
     * @param string
     */
    public EmailDeCadastroNaoExiste(String string) {
        super(string);
    }

}
