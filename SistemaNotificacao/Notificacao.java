/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.SistemaNotificacao.model;

/**
 *
 * @author musas
 */
public class Notificacao {
    String destinatario;
    String mensagem;
    TipoNotificacao tipo;
    
    public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }
    
    public void preparar() {
        System.out.println("Preparando notificação para: " + destinatario);
    }
    
    public void enviar() {
        System.out.println("Notificação");
    }
}
