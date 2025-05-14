/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaZoologico.test;

import br.edu.etec.SistemaZoologico.model.Arara;
import br.edu.etec.SistemaZoologico.model.Golfinho;
import static br.edu.etec.SistemaZoologico.model.Habitat.AEREO;
import static br.edu.etec.SistemaZoologico.model.Habitat.AQUATICO;
import static br.edu.etec.SistemaZoologico.model.Habitat.TERRESTRE;
import br.edu.etec.SistemaZoologico.model.Leao;

/**
 *
 * @author musas
 */
public class TesteZoologico {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba", 5, TERRESTRE);
        leao.exibirInfo();
        leao.emitirSom();
        
        Golfinho golfinho = new Golfinho("Flipper", 2, AQUATICO);
        golfinho.exibirInfo();
        golfinho.emitirSom();
        
        Arara arara = new Arara("Blue", 1, AEREO);
        arara.exibirInfo();
        arara.emitirSom();
    }
}
