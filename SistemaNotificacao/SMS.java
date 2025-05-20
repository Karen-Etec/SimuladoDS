/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaNotificacao.model;

/**
 *
 * @author musas
 */
public class SMS extends Notificacao{
    public SMS(String destinatario, String mensagem, TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo);
    }
    
    @Override
    public void enviar() {
        String texto = mensagem.length() > 160 ? mensagem.substring(0, 160) : mensagem;
        System.out.println("Enviando SMS para " + destinatario + ":" + texto);
    }
}
