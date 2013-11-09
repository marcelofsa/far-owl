/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author CasaPc
 */
public abstract class Conta  implements Comparable {
    
    private String nome;
    private String login;
    private int senha;
    private String email;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Conta(String nome, String login, int senha, String email){
        
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

       /**
     *
     * @param t
     * @return
     */
    @Override
      public int compareTo(Object t) {
      return nome.compareTo(((Conta)t).getLogin());
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }
       
    
      /**
     *
     * @param t
     * @return
     */
    public boolean compareEmail(Conta t) {
      return email.equals(((Conta)t).getLogin());
    }
    
}
