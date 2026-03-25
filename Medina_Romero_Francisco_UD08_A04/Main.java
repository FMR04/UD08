/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A04;

/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {

        ImpresoraBasica basica = new ImpresoraBasica();
        ImpresoraAvanzada avanzada = new ImpresoraAvanzada();

        basica.imprimir();
        avanzada.imprimir();
        avanzada.escanear();

        // basica.escanear();
        // Peta porque no tiene el metodo escanear
    }
}
