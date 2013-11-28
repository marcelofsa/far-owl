/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.CaracteresInvalidosException;
import java.io.File;

/**
 *
 * @author CasaPc
 */
public class Comum extends Usuario {

    private String sobrenome;
    private int score;
    private String dataNasc;

    /**
     *
     * @return
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     *
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     *
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     *
     * @return
     */
    public String getDataNasc() {
        return dataNasc;
    }

    /**
     *
     * @param dataNasc
     */
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     * @param cidade
     * @param sobrenome
     * @param estado
     * @param pais
     * @param aniversario
     * @param foto
     * @param x
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Comum(String nome, String login, String senha, String email, String cidade, String estado, String pais, File foto, String aniversario, int x, String sobrenome) throws CaracteresInvalidosException {
        super(nome, login, senha, email, cidade, estado, pais, foto);
        this.dataNasc = aniversario;
        this.sobrenome = sobrenome;

    }

    /**
     *
     * @param nome
     * @param senha
     */
    public Comum(String nome, String senha) {
        super(nome, senha);
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     *
     * @return
     */
    public Notificacao notificar() {
        score++;
        return null;

    }

    /**
     *
     */
    public void Apoiar() {

    }

    /**
     *
     */
    public void desApoiar() {

    }

    /**
     *
     */
    public void ConectarFacebook() {

    }

    /**
     *
     */
    public void ConectarTwitter() {

    }

    /**
     *
     */
    public void ConectarGooglePlus() {

    }

    /**
     *
     */
    public void VisualizarTermos() {

    }

    /**
     *
     */
    public void EditarPerfil() {

    }

    /**
     *
     */
    public void OcultarPontuacao() {

    }

    public Notificacao notificarAnonimo(String text, File midia) {
        return new Notificacao(text, midia, this.getId(), true);
    }

    public Comum visualizarPerfil(int idUsuario) {
        if (idUsuario == -1) {
            if (idUsuario == super.getId()) {
                return (Comum) Controller.contas.get(idUsuario);
            }

            return null;
        }
        return (Comum) Controller.contas.get(idUsuario);

    }

    public Comentario comentarAnonimo(String texto, File foto) throws CaracteresInvalidosException {
        return new Comentario(texto, foto, this.getId(), true);
    }

    public int getQtdNotificacoes() {
        int x = 0;
        for (int i = 0; i < Controller.notificacoes.size(); i++) {
            if (Controller.notificacoes.get(i).getIdUsuario() == Controller.logado.getId()) {
                x++;
            }
        }
        return x;
    }

    public void excluirNotificacao(int id) {
        Controller.notificacoes.remove(id);
    }

    public void editarPerfil(String cidade, String estado, String pais, String nome, String sobrenome, File foto) {
        setCidade(cidade);
        setEstado(estado);
        setPais(pais);
        setNome(nome);
        setSobrenome(sobrenome);
        setFoto(foto);
    }

}
