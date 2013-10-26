/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CasaPc
 */
public class Comum extends Usuario{
    
    private String sobrenome;

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Comum(String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome=sobrenome;
    }
    
}
