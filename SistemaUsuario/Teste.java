/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaUsuario.test;

import static br.edu.etec.SistemaUsuario.model.NivelAcesso.ADMIN;
import br.edu.etec.SistemaUsuario.model.Usuario;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String[] args) {
        Usuario user = new Usuario("Meu Login", "MinhaSenha", ADMIN, true);
        user.autenticar("MinhaSenha");
        System.out.println("Nivel de acesso: " + user.getNivel());
        
    }
}
