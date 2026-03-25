/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A05;

/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        Notificable Email = new NotificacionEmail();
        Notificable SMS = new NotificacionSMS();
        Notificable Push = new NotificacionPush();
        
        String mensaje = "Prueba mensaje :v";
        
        Email.Notificacion(mensaje);
        SMS.Notificacion(mensaje);
        Push.Notificacion(mensaje);
        
        Notificable paloma = new Notificable(){
        @Override
            public void Notificacion(String mensaje){
                System.out.println("Cuu cuu: El CEO os saluda");
            } 
        };
    }
}
    
    




