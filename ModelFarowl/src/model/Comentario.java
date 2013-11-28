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
public class Comentario {

    private String Texto;
    private File foto;
    private int Id;
    private int IdNotificacao;
    private int IdUsuario;
    private boolean Anonimo;

    /**
     *
     * @param Texto
     * @param foto
     * @param IdUsuario
     * @param Anonimo
     * @throws CaracteresInvalidosException
     */
    public Comentario(String Texto, File foto, int IdUsuario, boolean Anonimo) throws CaracteresInvalidosException {
        if (Texto == null && foto == null) {
            throw new CaracteresInvalidosException("");
        }
        this.Texto = Texto;
        this.foto = foto;
        this.IdUsuario = IdUsuario;
        this.Anonimo = Anonimo;
    }

    public Comentario(String texto, File midia, int ID, int IdNot) throws CaracteresInvalidosException {
        if (texto == null && midia == null) {
            throw new CaracteresInvalidosException("");
        }
        this.Texto = texto;
        this.foto = midia;
        this.IdUsuario = ID;
        this.IdNotificacao = IdNot;

    }

    /**
     *
     * @return
     */
    public String getTexto() {
        return Texto;
    }

    /**
     *
     * @param Texto
     */
    public void setTexto(String Texto) {
        this.Texto = Texto;
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

    /**
     *
     * @return
     */
    public int getIdNotificacao() {
        return IdNotificacao;
    }

    /**
     *
     * @param IdNotificacao
     */
    public void setIdNotificacao(int IdNotificacao) {
        this.IdNotificacao = IdNotificacao;
    }

    /**
     *
     * @param Texto
     * @param foto
     * @param Id
     */
    public Comentario(String Texto, File foto, int Id) {
        this.Texto = Texto;
        this.foto = foto;
        IdUsuario = Id;
    }

    public Comentario(String text, File foto, int i, int idNot, int comentId) throws CaracteresInvalidosException {
        if (text == null && foto == null) {
            throw new CaracteresInvalidosException("");
        }
        this.Texto = text;
        this.foto = foto;
        IdUsuario = i;
        IdNotificacao = idNot;
        Id = comentId;
    }

    /**
     *
     * @return
     */
    public int getIdUsuario() {

        if (Anonimo) {
            if (Controller.logado.getId() == IdUsuario || Controller.logado instanceof Administrador) {
                return IdUsuario;
            }
            return -1;
        }
        return IdUsuario;
    }

    /**
     *
     * @param IDUsuario
     */
    public void setIdUsuario(int IDUsuario) {
        this.IdUsuario = IDUsuario;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @param Id
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    public File getFile() {
        return foto;
    }

}
