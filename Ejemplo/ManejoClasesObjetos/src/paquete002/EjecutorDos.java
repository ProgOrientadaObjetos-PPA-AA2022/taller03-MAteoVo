/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.FacturaTelefono;
/**
 *
 * @author mateovalarezoojeda
 */
public class EjecutorDos {
    public static void main(String[] args){
        FacturaTelefono telefono = new FacturaTelefono();
        String numeroTelefono = "098321321";
        double minutos = 230;
        double valorMinuto = 0.25;

        telefono.establecerNumeroTelefono(numeroTelefono);
        telefono.establecerMinutosMes(minutos);
        telefono.establecerValorMinuto(valorMinuto);

        
        telefono.calcularValorFactura();
        

        System.out.printf("Factura de Teléfono\n\n\tNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n\tValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
    }
}
