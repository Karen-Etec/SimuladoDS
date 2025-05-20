/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaNotificacao.model;

/**
 *
 * @author musas
 */
public class Email extends Notificacao{
    public Email(String destinatario, String mensagem, TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo.EMAIL);
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}
