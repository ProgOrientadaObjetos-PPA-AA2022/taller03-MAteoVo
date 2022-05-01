
package paquete001;

public class Terreno {

    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void establecerAncho(double a) {
        ancho = a;
    }

    public void establecerLargo(double l) {
        largo = l;
    }

    public void establecerValorMetroCuadrado(double v) {
        valorMetroCuadrado = v;
    }
    public void establecerArea(){
        area = obtenerAncho() * obtenerLargo();
    }
    public void establecerCostoTerreno() {
        costoTerreno = obtenerArea() * obtenerValorMetroCuadrado();
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    public double obtenerLargo(){
        return largo;
    }
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    public double obtenerArea(){
         return area;
    }
    public double obtenerCostoTerreno(){
        return costoTerreno;
    }
    

}
