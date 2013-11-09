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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Notificacao(String texto, ImageIcon foto, String tag) {
        this.texto = texto;
        this.foto = foto;
        this.tag = tag;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isStatus() {
        return status;
    }

    public void MudarStatus(boolean status) {
        this.status = status;
    }
    
    public void ExcluirNotificação(){
    
    }
}
