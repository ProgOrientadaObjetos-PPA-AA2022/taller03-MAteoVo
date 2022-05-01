
package paquete001;

public class EquipoCelular {
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    
    public void establecerSistemaOperativo(String s){
        sistemaOperativo = s;
    }
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public void establecerTamanioPantalla(double t){
        tamanioPantalla = t;
    }
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public void establecerIva(double i){
        iva = i;
    }
    public double obtenerIva(){
        return iva;
    }
    
    public void establecerIvaCostoInicial(){
        ivaCostoInicial = obtenerIva() * obtenerCostoInicial() / 100;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public void establecerCostoFinal(){
        costoFinal = obtenerIvaCostoInicial() + obtenerCostoInicial();
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public void establecerDireccionMac(String dc){
        direccionMac = dc;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public void establecerInformacionImei(String i){
        informacionImei = i;
    }
    public String obtenerInformacionImei(){
        return informacionImei;
    }
             
}
