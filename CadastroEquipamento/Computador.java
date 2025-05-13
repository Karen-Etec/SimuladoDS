/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.CadastroEquipamento.model;

/**
 *
 * @author Admin
 */
public class Computador extends Equipamento{
    String processador;
    
    public Computador(String nome, String modelo, String processador) {
        super(nome, modelo);
        this.processador = processador;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("--Dados do Equipamento--");
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Processador do Computador: " + processador);
    }
}
