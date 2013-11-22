/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CasaPc
 */
public class Comum extends Usuario {

    private String sobrenome;
    private int score;

    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param email
     */
    public Comum(String nome, String login, String senha, String email) {
        super(nome, login, senha, email);
    }

    /**
     *
     * @param nome
     * @param senha
     */
    public Comum(String nome, String senha) {
       super(nome,senha);
    }

    void setSobrenome(String sobrenome) {
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
    public void AdcionarFotoVideo() {

    }

    /**
     *
     */
    public void denunciarComoImpropria() {

    }



    /**
     *
     */
    public void modoAnonimo() {

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
    public void EditarPerfil(){

}

    /**
     *
     */
    public void OcultarPontuacao(){

}
}
