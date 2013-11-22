/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CasaPc
 */
public class Administrador extends Conta{

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Administrador(String nome, String login, String senha, String email) {
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
     */
    public Administrador CriarAdmin(String nome, String login, String senha, String confirmacaoSenha, String email, String confirmacaoEmail){
        
        if(senha.equals(confirmacaoSenha) && email.equals(confirmacaoEmail)){
        return new Administrador(nome, login, senha, email);
        }
        else {
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
     * @param setorAtuacao
     * @param CNPJ
     * @param endereco
     * @return retorna uma conta oficial
     */
    public Oficial CriarOficial(String nome, String login, String senha, String confirmacaoSenha, String email, String confirmacaoEmail, String setorAtuacao, int CNPJ, String endereco){
        
        if((senha == null ? confirmacaoSenha == null : senha.equals(confirmacaoSenha)) && email.equals(confirmacaoEmail)){
        return new Oficial(nome, login, senha, email, endereco, CNPJ, setorAtuacao);
        }
        else {
            return null;
        }
    }
    
    /**
     *
     */
    public void ExcluirNotificacao(){
    
    }
    
    /**
     *
     */
    public void AdcionarPublicidade(){
    
    }
    
    /**
     *
     */
    public void ModificarPublicidade(){
    
    }
    
    /**
     *
     */
    public void VisualizarAnonimo(){
    
    }
    
    /**
     *
     */
    public void VisualizarDenuncias(){
    
    }
    
    /**
     *
     */
    public void ExcluirConta(){
    
    }
    
    /**
     *
     */
    public void BloqDesBloqUser(){
    
    }

 
    
    
    
}
