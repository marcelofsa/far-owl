/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.*;
import java.util.ArrayList;

/**
 *
 * @author CasaPc
 */
public class Controller {

    private final ArrayList<Conta> contas = new ArrayList();
    private final ArrayList<Conta> contasDeletadas = new ArrayList();
    private Conta logado;

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
     */
    public void CadastrarUsuario(String nome, String login, String senha, String confirmaSenha, String email, String confirmaEmail) throws UsuarioJaExisteException, SenhaincompativelException, EmailJaCadastradoException, ContaDeletadaException {
        Comum c = new Comum(nome, login, senha, email);

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
        if (contas.contains(new Comum(nome, senha))) {

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
    public void GerarRaking() {

    }

    /**
     *
     */
    public void Avisar() {

    }

    /**
     *
     */
    public void EncriptarSenha() {

    }

    /**
     *
     * @return
     */
    public boolean FiltrarPost() {
        return false;

    }

    /**
     *
     * @param email
     * @return
     */
    public boolean verificarEmail(String email) {
        if (true) {
            return true;
        }

        return false;
    }

    /**
     *
     * @param email
     * @return
     */
    public boolean verificarLogin(String email) {
        if (true) {
            return true;
        }

        return false;
    }

    /**
     *
     * @param email
     */
    public void recuperarSenha(String email) {

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
     */
    public void notificar() {

    }

    /**
     *
     */
    public void denunciarImpropria() {

    }

    /**
     *
     */
    public void modoAnonimo() {

    }

    /**
     *
     */
    public void apoir() {

    }

    /**
     *
     */
    public void desapoiar() {

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

    }

    /**
     *
     */
    public void comentar() {

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
     */
    public void alterarSenha() {

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
     * @return
     */
    public Oficial criarOficial(String nome, String login, String senha, String confirmaSenha, String email, String confirmaEmail) {
        return null;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean verificarEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
