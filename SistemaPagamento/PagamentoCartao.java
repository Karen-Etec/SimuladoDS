/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaPagamento.model;

/**
 *
 * @author musas
 */
public class PagamentoCartao extends Pagamento{
    String numeroCartao;
    
    public PagamentoCartao(double valor, StatusPagamento pagamento, String numeroCartao) {
        super(valor, pagamento);
        this.numeroCartao = numeroCartao;
    }
    
    @Override
    public void processarPagamento() {
        pagamento = StatusPagamento.CONCLUIDO;
        System.out.println("Pagamento concluido");
        System.out.println("Ultimos digitos do cartao utilizado: " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
