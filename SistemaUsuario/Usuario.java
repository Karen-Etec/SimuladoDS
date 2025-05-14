/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaUsuario.model;

/**
 *
 * @author Admin
 */
public class Usuario {
    String login;
    String senha;
    NivelAcesso nivel;
    boolean ativo;
    
    public Usuario(String login, String senha, NivelAcesso nivel, boolean ativo) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = ativo;
    }
    
    public boolean autenticar(String senhaInformada){
        if (ativo) {
            if (senhaInformada.equals(senha)) {
                System.out.println("Senha correta");
                return true;
            } else {
                System.out.println("Senha incorreta");
                return false;
            }
        } else {
            System.out.println("Login inexistente");
            return false;
        }
    }
    
    public boolean desativar(){
        return ativo = false;
    }
    
    public NivelAcesso getNivel(){
        return nivel;
    }
    
    public String getLogin(){
        return login;
    }
}
