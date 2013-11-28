/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.*;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author CasaPc
 */
public class Controller {

    static ArrayList<Conta> contas = new ArrayList();
    static ArrayList<Notificacao> notificacoes = new ArrayList();
    private ArrayList<Conta> contasDeletadas = new ArrayList();
    private ArrayList<String> emails = new ArrayList();
    private ArrayList<String> blackList = new ArrayList();
    static Conta logado;

    static final int not = 1;
    static final int coment = 2;
    static final int apoio = 5;

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param confirmaSenha
     * @param email
     * @param confirmaEmail
     * @throws UsuarioJaExisteException
     * @throws SenhaincompativelException
     * @throws Exceptions.EmailJaCadastradoException
     * @throws Exceptions.ContaDeletadaException
     * @throws Exceptions.CaracteresInvalidosException
     */
    public void cadastrarUsuario(String nome, String login, String senha, String confirmaSenha, String email, String confirmaEmail) throws UsuarioJaExisteException, SenhaincompativelException, EmailJaCadastradoException, ContaDeletadaException, CaracteresInvalidosException {
        Comum c = new Comum(nome, login, senha, email, "", "", "", null, "", 0, "");

        for (int i = 0; i < contas.size(); i++) {  //verifica emails cadastrados
            if (contas.get(i).compareEmail(c)) {
                throw new EmailJaCadastradoException("Já existe cadastro com esse email");
            }
        }

        if (contasDeletadas.contains(c)) {  //
            throw new ContaDeletadaException("Esta conta foi deletada");
        }

        if (senha == null ? confirmaSenha == null : senha.equals(confirmaSenha)) {
            if (email == null ? confirmaEmail == null : email.equals(confirmaEmail)) {

                if (!contas.contains(c)) {
                    contas.add(c);
                    logado = c;
                } else {
                    throw new UsuarioJaExisteException("Este Login já esta sendo utilizado por outro Usuario");
                }
            } else {
                throw new SenhaincompativelException("O email e sua confirmação diferem");
            }
        } else {
            throw new SenhaincompativelException("A senha e sua confirmação diferem");
        }
    }

    /**
     *
     * @param nome
     * @param senha
     * @return
     */
    public Conta fazerLogin(String nome, String senha) {
        Comum c = new Comum(nome, senha);
        if (contas.contains(c)) {
            logado = c;
        }
        return null;

    }

    /**
     *
     * @param sobrenome
     * @param estado
     * @param cidade
     * @param pais
     */
    public void criarPerfil(String sobrenome, String estado, String cidade, String pais) {

        if (logado instanceof Usuario) {
            ((Usuario) logado).setCidade(cidade);
            ((Usuario) logado).setEstado(estado);
            ((Usuario) logado).setPais(pais);
        }
        if (logado instanceof Comum) {
            ((Comum) logado).setSobrenome(sobrenome);
        }
    }

    /**
     *
     */
    public void gerarRaking() {

    }

    /**
     *
     */
    public void avisar() {

    }

    /**
     *
     */
    public void encriptarSenha() {

    }

    /**
     *
     * @param texto
     * @return
     */
    public boolean filtrarPost(String texto) {
        String text[] = texto.split(" ");
        for (String text1 : text) {
            return blackList.contains(text1);
        }
        return false;
    }

    /**
     *
     * @param email
     * @return
     */
    public boolean verificarEmail(String email) {
        return !emails.contains(email);
    }

    /**
     *
     * @param login
     * @return
     */
    public boolean verificarLogin(String login) {

        return true;
    }

    /**
     *
     * @param email
     */
    public void recuperarSenha(String email) {
        //enviaEmail(email);
    }

    /**
     *
     */
    public void conectarTwitter() {

    }

    /**
     *
     */
    public void conectarFacebook() {

    }

    /**
     *
     */
    public void conectarGooglePlus() {

    }

    /**
     *
     */
    public void adcionarPublicidade() {

    }

    /**
     *
     */
    public void excluirNotificacao() {
        if (logado instanceof Comum || logado instanceof Administrador) {
            logado.excluirNotificacao();
        }
    }

    /**
     *
     */
    public void modificarPublicidade() {

    }

    /**
     *
     */
    public void visualizarAnonimo() {

    }

    /**
     *
     */
    public void excluirConta() {

    }

    /**
     *
     */
    public void visualizarDenuncias() {

    }

    /**
     *
     */
    public void bloqDesboqUser() {

    }

    /**
     *
     */
    public void editarPerfilComun() {

    }

    /**
     *
     * @param texto
     * @param midia
     */
    public void notificar(String texto, File midia) {
        logado.notificar(texto, midia);
    }

    /**
     *
     */
    public void denunciarImpropria() {

    }

    /**
     *
     */
    public void notificarAnonimo() {
        logado.notificarAnonimo();
    }

    /**
     *
     */
    public void comentarAnonimo() {
        logado.comentarAnonimo();
    }

    /**
     *
     */
    public void apoiar() {
        logado.apoiar();
    }

    /**
     *
     */
    public void desapoiar() {
        logado.desapoiar();
    }

    /**
     *
     */
    public void ocultarPontuacao() {

    }

    /**
     *
     */
    public void mudarStatus() {
        logado.mudarStatus(true);
    }

    /**
     *
     * @param texto
     * @param midia
     */
    public void comentar(String texto, File midia) {
        logado.comentar(texto, midia);
    }

    /**
     *
     */
    public void ordenarNotificacoes() {

    }

    /**
     *
     */
    public void mudarIdioma() {

    }

    /**
     *
     */
    public void buscarNotificacao() {
        logado.buscarNotificacao();
    }

    /**
     *
     */
    public void visualizarComentario() {

    }

    /**
     *
     */
    public void visualizarPerfil() {

    }

    /**
     *
     * @param senhaAntiga
     * @param confirmacaoSenha
     * @param novaSenha
     */
    public void alterarSenha(String senhaAntiga, String novaSenha, String confirmacaoSenha) {

    }

    /**
     *
     */
    public void visualizarRaking() {

    }

    /**
     *
     */
    public void sobre() {

    }

    /**
     *
     */
    public void visualizarMapa() {

    }

    /**
     *
     */
    public void visualizarAvisos() {

    }

    /**
     *
     */
    public void sair() {

    }

    /**
     *
     */
    public Controller() {
    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param confirmaSenha
     * @param email
     * @param confirmaEmail
     * @return
     */
    public Administrador criarAdmin(String nome, String login, String senha, String confirmaSenha, String email, String confirmaEmail) {
        return null;

    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param confirmaSenha
     * @param email
     * @param confirmaEmail
     * @param endereco
     * @param CNPJ
     * @param setorAtuacao
     * @return
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Oficial criarOficial(String nome, String login, String senha, String confirmaSenha, String email, String confirmaEmail, String endereco, int CNPJ, String setorAtuacao) throws CaracteresInvalidosException {
        if (logado instanceof Administrador) {
            Oficial f = new Oficial(nome, login, senha, email, "", "", "", null, endereco, CNPJ, setorAtuacao);
            return f;
        }
        return null;

    }

    /**
     *
     * @return
     */
    public boolean verificarEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
