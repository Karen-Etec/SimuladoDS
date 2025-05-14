/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaPagamento.test;

import br.edu.etec.SistemaPagamento.model.PagamentoCartao;
import static br.edu.etec.SistemaPagamento.model.StatusPagamento.PENDENTE;

/**
 *
 * @author musas
 */
public class PagamentoTeste {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao(100, PENDENTE, "0010001001111100");
        cartao.exibirStatus();
        cartao.processarPagamento();
        cartao.exibirStatus();
    }
}
