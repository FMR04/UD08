/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A01;

/**
 *
 * @author ALUMNO
 */
public interface DispositivoConectado {
    static final String red = "Wifi 7";
    
    boolean encender();
    boolean apagar();
    
    default void conectar(){
        System.out.println(red);
    }
    
    static void mostrarInfoGeneral(){
        System.out.println("Interfaz del dispositivo");
    }
}
