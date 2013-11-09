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
public class Comentario {
    
    String Texto;
    Image foto;
    private int ID;

    public Comentario(String Texto, Image foto) {
        this.Texto = Texto;
        this.foto = foto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
