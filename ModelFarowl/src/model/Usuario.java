/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author CasaPc
 */
public abstract class Usuario extends Conta{
    
    String cidade;
    String Estado;
    String pais;
    ImageIcon foto;
    
    public Usuario(String nome, String login, int senha, String email) {
        super(nome, login, senha, email);
    }
    
}
