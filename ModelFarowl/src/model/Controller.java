/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Exceptions.*;
import java.util.ArrayList;

/**
 *
 * @author CasaPc
 */
public class Controller {
    
    private String BlackList[];
    private ArrayList<Conta> contas=new ArrayList();
    
    /**
     *
     * @param nome
     * @param login
     * @param senha
     * @param confirmaSenha
     * @param email
     * @param confirmaEmail
     * @throws UsuarioJaExisteException
     * @throws SenhaincompativelException
     */
    public void CadastrarUsuario(String nome, String login, int senha,int confirmaSenha, String email, String confirmaEmail) throws UsuarioJaExisteException, SenhaincompativelException, EmailJaCadastradoException{
    Conta c=new Comum(nome,login,senha,email); 
    
    for(int i=0; i<contas.size(); i++){
    if(contas.get(i).compareEmail(c)){
        throw new EmailJaCadastradoException("Já existe cadastro com esse email");
    }
    }
    
    if(senha==confirmaSenha){
        
        
    if(contas.contains(c)){
            contas.add(c);
    }
        else {
            throw new UsuarioJaExisteException("Este Login já esta sendo utilizado por outro Usuario");
        }
        }else {
            throw new SenhaincompativelException("A senha e sua confirmação diferem");
        }
    }
    
    /**
     *
     */
    public void GerarRaking(){
    
    }
    
    /**
     *
     */
    public void Avisar(){
    
    }
    
    /**
     *
     */
    public void EncriptarSenha(){
    
    }
    
    /**
     *
     * @return
     */
    public boolean FiltrarPost(){
        return false;
    
    
    }
    
    /**
     *
     * @return
     */
    public boolean verificarEmail(){
        return false;
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
