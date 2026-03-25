/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A03;

/**
 *
 * @author ALUMNO
 */
public class NotificacionEmail implements Notificable {
    @Override
    public void Notificacion(String mensaje){
        System.out.println("Mensaje enviado" + mensaje);
    }
}
