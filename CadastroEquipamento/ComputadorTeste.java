/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.CadastroEquipamento.test;

import br.edu.etec.CadastroEquipamento.model.Computador;

/**
 *
 * @author Admin
 */
public class ComputadorTeste {
    public static void main(String[] args) {
        Computador pc = new Computador("Think Centre", "Lenovo", "Intel5");
        pc.exibirDados();
    }
}
