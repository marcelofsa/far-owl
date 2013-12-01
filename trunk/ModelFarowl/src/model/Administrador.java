/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.CaracteresInvalidosException;
import java.io.File;

/**
 *
 * @author Lucas
 */
public class Administrador extends Conta {

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Administrador(String nome, String login, String senha, String email) throws CaracteresInvalidosException {
        super(nome, login, senha, email);
    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param confirmacaoSenha
     * @param email
     * @param confirmacaoEmail
     * @return retorna um novo administrador
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Administrador CriarAdmin(String nome, String login, String senha, String confirmacaoSenha, String email, String confirmacaoEmail) throws CaracteresInvalidosException {

        if (senha.equals(confirmacaoSenha) && email.equals(confirmacaoEmail)) {
            return new Administrador(nome, login, senha, email);
        } else {
            return null;
        }
    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param confirmacaoSenha
     * @param email
     * @param confirmacaoEmail
     * @param cidade
     * @param estado
     * @param setorAtuacao
     * @param CNPJ
     * @param foto
     * @param pais
     * @param endereco
     * @return retorna uma conta oficial
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Oficial criarOficial(String nome, String login, String senha, String confirmacaoSenha, String email, String confirmacaoEmail,
            String cidade, String estado, String pais, File foto, String endereco, int CNPJ, String setorAtuacao) throws CaracteresInvalidosException {

        if ((senha == null ? confirmacaoSenha == null : senha.equals(confirmacaoSenha)) && email.equals(confirmacaoEmail)) {
            return new Oficial(nome, login, senha, email, cidade, estado, pais, foto, endereco, CNPJ, setorAtuacao);
        } else {
            return null;
        }
    }

    public Comum visualizarNotificacaoAnonimo(Notificacao notificacao) {
        return (Comum) Controller.contas.get(notificacao.getIdUsuario());
    }

    public Comum visualizarComentarioAnonimo(int Id) {
        return (Comum) Controller.contas.get(Id);

    }

}
