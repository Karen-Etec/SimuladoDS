/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaNotificacao.test;

import br.edu.etec.SistemaNotificacao.model.Email;
import br.edu.etec.SistemaNotificacao.model.Notificacao;
import br.edu.etec.SistemaNotificacao.model.SMS;
import static br.edu.etec.SistemaNotificacao.model.TipoNotificacao.EMAIL;
import static br.edu.etec.SistemaNotificacao.model.TipoNotificacao.SMS;

/**
 *
 * @author musas
 */
public class NotificacaoTeste {
    public static void main(String[] args) {
        Notificacao[] nots = new Notificacao[1];
        
        nots[0] = new Email("MeuEmail@email", "Mensagem do meu email", EMAIL);
        nots[1] = new SMS("11999991111", "Mensagem do meu SMS", SMS);
        
        for (Notificacao n : nots) {
            n.preparar();
            n.enviar();
    }
}
}

