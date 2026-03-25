/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A01;

/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {
        DispositivoConectado dispo1 = new Bombilla();
        DispositivoConectado dispo2 = new Televisor();
        dispo1.encender();
        dispo1.apagar();

        dispo2.encender();
        dispo2.apagar();
        dispo1.conectar();
        DispositivoConectado.mostrarInfoGeneral();
    }
}
