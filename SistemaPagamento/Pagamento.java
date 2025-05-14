/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaPagamento.model;

/**
 *
 * @author musas
 */
abstract class Pagamento {
    double valor;
    StatusPagamento pagamento;
    
    public Pagamento(double valor, StatusPagamento pagamento) {
        this.valor = valor;
        this.pagamento = pagamento;
    }
    
    abstract void processarPagamento();
    
    public void exibirStatus() {
        System.out.println("Status: " + pagamento);
    }
}
