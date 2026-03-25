/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A01;

/**
 *
 * @author ALUMNO
 */
public class Televisor implements DispositivoConectado{
    boolean encendido = false;
    
    @Override
    public boolean encender(){
        if (encendido == false){
            encendido = true;
            System.out.println("Estado TV: Encendido");
        } else {
            System.out.println("El televisor ya está encendido");
        }
        return encendido;
    }
@Override
    public boolean apagar(){
        if (encendido == true){
            encendido = false;
            System.out.println("Estado TV: Apagao");
        } else {
            System.out.println("El televisor ya está apagado");
        }
        return encendido;
    }
}
