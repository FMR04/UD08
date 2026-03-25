/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A02;

/**
 *
 * @author ALUMNO
 */
public interface MetodoPago {
    double IVA = 0.21;

    void procesarPago(double importe);

    void logTransaccion(double importe);

    default void generarFactura(double importe){
        logTransaccion(importe);
        double total = importe + (importe * IVA);
        System.out.println("Importe final con IVA: " + total);
    }
}
