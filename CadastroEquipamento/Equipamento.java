/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.CadastroEquipamento.model;

/**
 *
 * @author Admin
 */
public class Equipamento {
    String nome;
    String modelo;
    
    public Equipamento(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }
    
    public void exibirDados() {
        System.out.println("--Dados do Equipamento--");
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
    }
}
