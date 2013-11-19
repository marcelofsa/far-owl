/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author CasaPc
 */
public class Notificacao {
    
    private String texto;
    private ImageIcon foto;
    private String tag;
    private boolean status;
    private ArrayList <Usuario> apoios;
    private ArrayList <Comentario> comentarios;
    private int ID;

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @param texto
     * @param foto
     * @param tag
     */
    public Notificacao(String texto, ImageIcon foto, String tag) {
        this.texto = texto;
        this.foto = foto;
        this.tag = tag;
    }

    /**
     *
     * @return
     */
    public String getTexto() {
        return texto;
    }

    /**
     *
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     *
     * @return
     */
    public ImageIcon getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    /**
     *
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     *
     * @return
     */
    public boolean isStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void MudarStatus(boolean status) {
        this.status = status;
    }
    
    /**
     *
     */
    public void ExcluirNotificação(){
    
    }
}
