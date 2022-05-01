/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.EquipoCelular;
public class Ejecutor {
    public static void main(String[] args){
        EquipoCelular eq = new EquipoCelular();
        
        eq.establecerSistemaOperativo("IOS 13.4");
        eq.establecerTamanioPantalla(9.8);
        eq.establecerCostoInicial(499.99);
        eq.establecerIva(12);
        eq.establecerIvaCostoInicial();
        eq.establecerCostoFinal();
        eq.establecerDireccionMac("00:1e:c2:9e:28:6b.");
        eq.establecerInformacionImei("366873126760262");
        
        System.out.printf("Sistema operativo: %s\n" + "Tamaño de la pantalla: %.2f\n" + "Costo inicial: %.2f\n" + "Iva: %.2f\n" 
        + "Iva del costo inicial: %.2f\n" + "Costo final: %.2f\n" + "Direccion Mac: %s\n" + "Información IMEI: %s\n", eq.obtenerSistemaOperativo(),
        eq.obtenerTamanioPantalla(), eq.obtenerCostoInicial(), eq.obtenerIva(), eq.obtenerIvaCostoInicial(), eq.obtenerCostoFinal(), eq.obtenerDireccionMac(),
        eq.obtenerInformacionImei());
        
        EquipoCelular eq2 = new EquipoCelular();
        
        eq2.establecerSistemaOperativo("IOS 14.01");
        eq2.establecerTamanioPantalla(8.9);
        eq2.establecerCostoInicial(699.99);
        eq2.establecerIva(8);
        eq2.establecerIvaCostoInicial();
        eq2.establecerCostoFinal();
        eq2.establecerDireccionMac("00:5h:c2:4e:28:2t.");
        eq2.establecerInformacionImei("337873541060932");
        
        System.out.printf("Sistema operativo: %s\n" + "Tamaño de la pantalla: %.2f\n" + "Costo inicial: %.2f\n" + "Iva: %.2f\n" 
        + "Iva del costo inicial: %.2f\n" + "Costo final: %.2f\n" + "Direccion Mac: %s\n" + "Información IMEI: %s\n", eq2.obtenerSistemaOperativo(),
        eq2.obtenerTamanioPantalla(), eq2.obtenerCostoInicial(), eq2.obtenerIva(), eq2.obtenerIvaCostoInicial(), eq2.obtenerCostoFinal(), eq2.obtenerDireccionMac(),
        eq2.obtenerInformacionImei());
    }
}
