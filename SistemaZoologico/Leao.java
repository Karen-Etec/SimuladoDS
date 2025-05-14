/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaZoologico.model;

/**
 *
 * @author musas
 */
public class Leao extends Animal{
    public Leao(String nome, int idade, Habitat habitat) {
        super(nome, idade, habitat);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Roarrr!");
    }
}
