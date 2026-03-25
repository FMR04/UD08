/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A02;

/**
 *
 * @author ALUMNO
 */
public class PagoBizum implements MetodoPago {

    @Override
    public void procesarPago(double importe) {
        System.out.println("Pago realizado con Bizum: " + importe);
    }

    @Override
    public void logTransaccion(double importe) {
        System.out.println("Transaccion Bizum de: " + importe);
    }
}