
package paquete002;
import paquete001.Terreno;

public class Ejecutor {
    public static void main(String[] args){
        Terreno tr = new Terreno();
        tr.establecerAncho(34.50);
        tr.establecerLargo(75.20);
        tr.establecerValorMetroCuadrado(60.25);
        tr.establecerArea();
        tr.establecerCostoTerreno();
        
        System.out.printf("Ancho del Terreno: %.3f\n" + "Largo del Terreno: %.3f\n" + "Valor del metro cuadrado: %.3f\n" 
                + "Area del Terreno: %.2f\n" + "Costo del Terreno: %.2f\n", tr.obtenerAncho(),
                tr.obtenerLargo(), tr.obtenerValorMetroCuadrado(),
                tr.obtenerArea(), tr.obtenerCostoTerreno());
        Terreno tr2 = new Terreno();
        tr2.establecerAncho(50);
        tr2.establecerLargo(124.30);
        tr2.establecerValorMetroCuadrado(45.50);
        tr2.establecerArea();
        tr2.establecerCostoTerreno();
        
        System.out.printf("Ancho del Terreno: %.3f\n" + "Largo del Terreno: %.3f\n" + "Valor del metro cuadrado: %.3f\n" 
                + "Area del Terreno: %.2f\n" + "Costo del Terreno: %.2f\n", tr2.obtenerAncho(),
                tr2.obtenerLargo(), tr2.obtenerValorMetroCuadrado(),
                tr2.obtenerArea(), tr2.obtenerCostoTerreno());
    }
}
