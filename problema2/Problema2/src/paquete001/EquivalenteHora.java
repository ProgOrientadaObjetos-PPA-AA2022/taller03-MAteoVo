
package paquete001;

public class EquivalenteHora {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerHoras(double h) {
        horas = h;
    }
    public double obtenerHoras(){
        return horas;
    }
    
    public void establecerMinutos(){
        minutos = obtenerHoras() * 60;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public void establecerSegundos(){
        segundos = obtenerHoras() * 3600;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    
    public void establecerDias(){
        dias = obtenerHoras() / 24;
    }
    
    public double obtenerDias(){
        return dias;
    }
}
