/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CasaPc
 */
public class Oficial extends Usuario{
    
    private String endereco;
    private int CNPJ;
    private String setorAtuacao;
    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Oficial(String nome, String login, String senha, String email) {
        super(nome, login, senha, email);
    }

    /**
     *
     */
    public void EditarPerfil(){

}
}
