/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CasaPc
 */
public abstract class Conta {
    
    private String nome;
    private String login;
    private int senha;
    private String email;

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Conta(String nome, String login, int senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    
    
    /**
     *
     * @param login
     * @param senha
     * @return
     */
    public boolean fazerLogin(String login, int senha){
        
        return false;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public int getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Conta{" + "nome=" + nome + '}';
    }

    
}
