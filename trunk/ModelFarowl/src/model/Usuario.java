/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.BuscaNaoEncontradaException;
import Exceptions.CaracteresInvalidosException;
import Exceptions.NovaSenhaInvalidaException;
import java.io.File;

/**
 *
 * @author CasaPc
 */
public class Usuario extends Conta {

    private String cidade;
    private String Estado;
    private String pais;
    private File foto;

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     * @param cidade
     * @param estado
     * @param foto
     * @param pais
     * @throws Exceptions.CaracteresInvalidosException
     */
    public Usuario(String nome, String login, String senha, String email, String cidade, String estado, String pais, File foto) throws CaracteresInvalidosException {
        super(nome, login, senha, email);
        this.cidade = cidade;
        this.Estado = estado;
        this.pais = pais;
        this.foto = foto;
    }

    /**
     *
     * @param nome
     * @param senha
     */
    public Usuario(String nome, String senha) {
        super(nome, senha);
    }

    /**
     *
     * @param nome
     * @param cidade
     * @param estado
     * @param pais
     * @param imagem
     */
    public void editarPerfil(String nome, String cidade, String estado, String pais, File imagem) {

        super.setNome(nome);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setFoto(imagem);

    }

    /**
     *
     * @return
     */
    public Comentario Comentar() {
        return null;

    }

    /**
     *
     */
    public void adcionarFotoVideo() {

    }

    /**
     *
     */
    public void Ordenarnotificacoes() {

    }

    /**
     *
     */
    public void RecuperarSenha() {

    }

    /**
     *
     */
    public void MudarIdioma() {

    }

    /**
     *
     */
    public void BuscarNotificacao() {

    }

    /**
     *
     */
    public void AcessarMenu() {

    }

    /**
     *
     * @return
     */
    public Comentario VisualizarComentario() {
        return null;

    }

    /**
     *
     */
    public void VisualizarPerfil() {

    }

    /**
     *
     */
    public void AlterarSenha() {

    }

    /**
     *
     */
    public void VisualizarRaking() {

    }

    /**
     *
     */
    public void SobreApp() {

    }

    /**
     *
     */
    public void VisualizarMapa() {

    }

    /**
     *
     */
    public void VisualizarAvisos() {

    }

    /**
     *
     */
    public void Sair() {

    }

    /**
     *
     * @return
     */
    public String getCidade() {
        return cidade;
    }

    /**
     *
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     *
     * @return
     */
    public String getEstado() {
        return Estado;
    }

    /**
     *
     * @param Estado
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     *
     * @return
     */
    public File getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(File foto) {
        this.foto = foto;
    }

    void visualizarNotificacao(Notificacao not) {

    }

    public void buscarNotificacao(String tag) throws BuscaNaoEncontradaException {
        if (Controller.notificacoes.isEmpty()) {
            throw new BuscaNaoEncontradaException("");
        }

    }

    public void mudarSenha(String senhaAntiga, String senhaNova, String confirmSenha) throws NovaSenhaInvalidaException {
        if (senhaNova.equals(confirmSenha)) {
            if (senhaAntiga.equals(super.getSenha())) {
                super.setSenha(senhaNova);
            }
        } else {
            throw new NovaSenhaInvalidaException("");
        }
    }

}
