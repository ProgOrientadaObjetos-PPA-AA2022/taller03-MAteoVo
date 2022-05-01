/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

import paquete001.EquivalenteHora;
public class Ejecutor {
    public static void main(String[] args){
        EquivalenteHora hr = new EquivalenteHora();
        hr.establecerHoras(34.3);
        hr.establecerMinutos();
        hr.establecerSegundos();
        hr.establecerDias();
        
        System.out.printf("Horas: %.3f\n" + "Minutos: %.3f\n" + "Segundos: %.3f\n" 
        + "Dias: %.3f\n", hr.obtenerHoras(),
        hr.obtenerMinutos(), hr.obtenerSegundos(),
        hr.obtenerDias());
        
        EquivalenteHora hr2 = new EquivalenteHora();
        hr2.establecerHoras(72);
        hr2.establecerMinutos();
        hr2.establecerSegundos();
        hr2.establecerDias();
        
        System.out.printf("Horas: %.3f\n" + "Minutos: %.3f\n" + "Segundos: %.3f\n" 
        + "Dias: %.3f\n", hr2.obtenerHoras(),
        hr2.obtenerMinutos(), hr2.obtenerSegundos(),
        hr2.obtenerDias());
    }
}
