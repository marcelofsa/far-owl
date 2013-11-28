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
public class Oficial extends Usuario {

    private String endereco;
    private int CNPJ;
    private String setorAtuacao;

    Oficial(String nome, String login, String senha, String email, String cidade, String estado, String pais, File foto, String endereco, int CNPJ, String setorAtuacao) throws CaracteresInvalidosException {
        super(nome, login, senha, email, cidade, estado, pais, foto);
        this.endereco = endereco;
        this.CNPJ = CNPJ;
        this.setorAtuacao = setorAtuacao;
    }

    /**
     *
     * @return
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     *
     * @return
     */
    public int getCNPJ() {
        return CNPJ;
    }

    /**
     *
     * @param CNPJ
     */
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     *
     * @return
     */
    public String getSetorDeAtuacao() {
        return setorAtuacao;
    }

    /**
     *
     * @param setorAtuacao
     */
    public void setSetorDeAtuacao(String setorAtuacao) {
        this.setorAtuacao = setorAtuacao;
    }

    /**
     *
     */
    public void EditarPerfil() {

    }

    void editarPerfil(String endereco, int CNPJ, String setorAtuacao) {
        this.endereco = endereco;
        this.setorAtuacao = setorAtuacao;
        this.CNPJ = CNPJ;
    }
}
