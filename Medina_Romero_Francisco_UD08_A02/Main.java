/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD08_A02;

/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {

        MetodoPago bizum = new PagoBizum();
        MetodoPago tarjeta = new PagoTarjeta();

        bizum.procesarPago(100);
        bizum.generarFactura(100);

        tarjeta.procesarPago(200);
        tarjeta.generarFactura(200);
    }
}
