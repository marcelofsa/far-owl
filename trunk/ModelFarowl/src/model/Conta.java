/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.CaracteresInvalidosException;
import java.io.File;
import java.util.Objects;

/**
 *
 * @author CasaPc
 */
public class Conta implements Comparable {

    private String nome;
    private String login;
    private String senha;
    private String email;
    private int ID;

    /**
     *
     * @return retorna o ID
     */
    public int getId() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setId(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Conta(String nome, String login, String senha, String email) throws CaracteresInvalidosException {
        if (nome == null || login == null || senha == null || email == null
                || nome.equals("") || login.equals("") || senha.equals("") || email.equals("")) {
            throw new CaracteresInvalidosException("");
        }
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        setId(Controller.contas.size());
    }

    /**
     *
     * @param login
     * @param senha
     */
    public Conta(String login, String senha) {

        this.login = login;
        this.senha = senha;
    }

    /**
     *
     * @param login
     * @param senha
     * @return
     */
    public boolean fazerLogin(String login, int senha) {

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
    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
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
        return nome.compareTo(((Conta) t).getLogin());
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
        return email.equals(t.getLogin());
    }

    void mudarStatus(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Notificacao notificar(String texto, File midia) {
        if (this instanceof Comum) {
            if (texto == null && midia == null) {
                return null;
            }
            if (texto.equals("")) {
                return null;
            }
            return new Notificacao(texto, midia, this.ID);

        }
        return null;
    }

    void apoiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void notificarAnonimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void comentarAnonimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void buscarNotificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void desapoiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void excluirNotificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Comentario comentar(String texto, File midia) {
        return new Comentario(texto, midia, this.ID);
    }

    Comentario comentar(String texto, File midia, int IdNot) throws CaracteresInvalidosException {
        return new Comentario(texto, midia, this.ID, IdNot);
    }

}
