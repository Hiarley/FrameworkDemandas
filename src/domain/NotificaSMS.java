/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author hiarl
 */
public class NotificaSMS extends Notificao{
    public NotificaSMS(String mensagem) {
            super(mensagem);
    }

    public void enviar() {
            System.out.println("Enviando notificacao por SMS...");
            System.out.println(getMensagem());
    }
}
