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

    /**
     *
     * @param Texto
     * @param foto
     */
    public Comentario(String Texto, Image foto) {
        this.Texto = Texto;
        this.foto = foto;
    }

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
    
    
}
