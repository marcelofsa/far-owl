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

    public Conta(String nome, String login, int senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    
    
    public boolean fazerLogin(String login, int senha){
        
        
        
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Conta{" + "nome=" + nome + '}';
    }

    
}
