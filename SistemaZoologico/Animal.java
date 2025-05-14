/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaZoologico.model;

/**
 *
 * @author musas
 */
abstract class Animal {
    String nome;
    int idade;
    Habitat habitat;
    
    public Animal(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }
    
    abstract void emitirSom();
    
    public void exibirInfo() {
        System.out.println("--Dados do Animal--");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habitat: " + habitat);
    }
}
