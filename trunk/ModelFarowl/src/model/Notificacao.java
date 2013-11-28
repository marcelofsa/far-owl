/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.CaracteresInvalidosException;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Notificacao {

    private String texto;
    private File file;
    private String tag;
    private boolean status;
    private ArrayList<Usuario> apoios;
    private ArrayList<Usuario> denuncias;
    private ArrayList<Comentario> comentarios;
    private int IdUser;
    private int Id;
    private int score;
    private boolean Anonimo;

    /**
     *
     * @return
     */
    public int getIdUsuario() {

        if (Anonimo) {
            if (Controller.logado.getId() == IdUser || Controller.logado instanceof Administrador) {
                return IdUser;
            }
            return -1;
        }
        return IdUser;
    }

    /**
     *
     * @param IdUser
     */
    public void setIdUsuario(int IdUser) {
        this.IdUser = IdUser;
    }

    /**
     *
     * @param texto
     * @param file
     * @param IdUser
     * @param Id
     * @param tag
     * @param status
     * @throws CaracteresInvalidosException
     */
    public Notificacao(String texto, File file, int IdUser, int Id, String tag, boolean status) throws CaracteresInvalidosException {
        if (texto == null && file == null) {
            throw new CaracteresInvalidosException("");
        }
        this.texto = texto;
        this.file = file;
        this.tag = tag;
        this.status = status;
        this.IdUser = IdUser;
        this.Id = Id;
    }

    /**
     *
     * @param texto
     * @param foto
     * @param user
     */
    public Notificacao(String texto, File foto, int user) {
        this.texto = texto;
        this.file = foto;
        this.IdUser = user;
    }

    /**
     *
     * @param texto
     * @param foto
     * @param user
     * @param anonimo
     */
    public Notificacao(String texto, File foto, int user, boolean anonimo) {
        this.texto = texto;
        this.file = foto;
        this.IdUser = user;
        this.Anonimo = anonimo;
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

    /**
     *
     * @param texto
     * @param foto
     * @param tag
     */
    public Notificacao(String texto, File foto, String tag) {
        this.texto = texto;
        this.file = foto;
        this.tag = tag;
        score = 1;
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
    public File getFile() {
        return file;
    }

    /**
     *
     * @param file
     */
    public void setFile(File file) {
        this.file = file;
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
    public void comentar() {

    }

    int qtdApoios() {
        return 0;
    }

    boolean getStatus() {
        return status;
    }

    void mudarStatus(boolean b, int i) {
        if (i == IdUser) {
            status = b;
        }
    }

}
