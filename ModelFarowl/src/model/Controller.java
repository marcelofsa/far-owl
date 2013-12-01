/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.*;
import conection.ActionsBD;
import conection.Conexao;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author CasaPc
 */
public class Controller {

    private static final Conexao c1 = Conexao.getInstance();
    private static ActionsBD conta = ActionsBD.getInstance();

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
     */
    public Controller() {
        boolean i;

        i = c1.Conectar("maridb.hopto.org", "maridb", "marisenha");

        if (i == true) {
            System.out.println("Conectado");
        } else {
            System.out.println("erro ao conectar");
        }
    }

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
    public void cadastrarUsuario(String nome, String login, String senha, String confirmaSenha, String email, String confirmaEmail) throws UsuarioJaExisteException, SenhaincompativelException, EmailJaCadastradoException, ContaDeletadaException, CaracteresInvalidosException, SQLException {
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
                    conta.inserirConta(0, nome, login, senha, email);
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
     * @param texto
     * @return
     */
    public boolean filtrarPost(String texto) {
        String text[] = texto.split("");
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
        return false;
    }

    /**
     *
     * @param email
     * @throws javax.mail.MessagingException
     */
    public void recuperarSenha(String email) throws MessagingException {
        enviaEmail(email, "Prezado usuario, \n"
                + "Sua nova senha é:" + gerarSenhaNova() + "\n\nIsso é uma mensagem automatica.\n" + "\nNão responda a este email");
    }

    public String gerarSenhaNova() {
        String[] carct = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String senha = "";

        for (int x = 0; x < 16; x++) {
            int j = (int) (Math.random() * carct.length);
            senha += carct[j];

        }

        return senha;

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
        if (logado.getSenha().equals(senhaAntiga)) {
            if (novaSenha.equals(confirmacaoSenha)) {
                logado.setSenha(novaSenha);
            }
        }
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

    private void enviaEmail(String email, String mensagem) throws MessagingException {
        Properties props = new Properties();
        /**
         * Parâmetros de conexão com servidor Gmail
         */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("suportefarowl@gmail.com", "cjkllmnop");
                    }
                });

        /**
         * Ativa Debug para sessão
         */
        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("suportefarowl@gmail.com")); //Remetente

            Address[] toUser = InternetAddress.parse(email);

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("SUPORTE FAROWL");//Assunto
            message.setText(mensagem);
            /**
             * Método para enviar a mensagem criada
             */
            Transport.send(message);

            System.out.println("Feito!!!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
