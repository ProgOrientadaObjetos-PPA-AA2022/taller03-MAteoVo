
package paquete001;

public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroCedes;
    private double gastosEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerTipoInstitucion(String t){
        tipoInstitucion = t;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public void establecerNumeroAlumnos(int a){
        numeroAlumnos = a;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    public void establecerNumeroDocentes(int d){
        numeroDocentes = d;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public void establecerNumeroCedes(int c){
        numeroCedes = c;
    }
    
    public int obtenerNumeroCedes(){
        return numeroCedes;
    }
    
    public void establecerGastosEstudiante(double g){
        gastosEstudiante = g;
    }
    public double obtenerGastosEstidiante(){
        return gastosEstudiante;
    }
    
    public void establecerPresupuesto(){
        presupuesto = obtenerNumeroAlumnos() * obtenerGastosEstidiante();
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
}
