/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;

/**
 *
 * @author CasaPc
 */
public abstract class Usuario extends Conta {

    private String cidade;
    private String Estado;
    private String pais;
    private Image foto;

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Usuario(String nome, String login, String senha, String email) {
        super(nome, login, senha, email);
    }

    /**
     *
     * @return
     */
    public Comentario Comentar() {
        return null;

    }


    public void adcionarFotoVideo() {

    }

    public void Ordenarnotificacoes() {

    }

    public void RecuperarSenha() {

    }

    public void MudarIdioma() {

    }

    public void BuscarNotificacao() {

    }

    public void AcessarMenu() {

    }

    public Comentario VisualizarComentario() {
        return null;

    }

    public void VisualizarPerfil() {

    }

    public void AlterarSenha() {

    }

    public void VisualizarRaking() {

    }

    public void SobreApp() {

    }

    public void VisualizarMapa() {

    }

    public void VisualizarAvisos() {

    }

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
    public Image getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(Image foto) {
        this.foto = foto;
    }

 

}
