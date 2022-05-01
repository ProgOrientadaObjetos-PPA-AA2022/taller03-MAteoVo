
package Paquete002;
import paquete001.InstitucionEducativa;
public class Ejecutor {
    public static void main(String[] args){
        InstitucionEducativa id = new InstitucionEducativa();
        id.establecerNombre("Eugenio Espejo");
        id.establecerTipoInstitucion("Particular");
        id.establecerNumeroAlumnos(1250);
        id.establecerNumeroDocentes(45);
        id.establecerNumeroCedes(2);
        id.establecerGastosEstudiante(78.99);
        id.establecerPresupuesto();
        
        System.out.printf("Nombre de la Institucion: %s\n" + "Tipo de Institucion: %s\n" + "Numero de estudiantes: %d\n" + "Numero de docentes: %d\n" 
        + "Numero de cedes: %d\n" + "Gastos Proyectado por estudiante: %.2f\n" + "Presupuesto: %.2f\n", id.obtenerNombre(), id.obtenerTipoInstitucion(),
        id.obtenerNumeroAlumnos(), id.obtenerNumeroDocentes(), id.obtenerNumeroCedes(), id.obtenerGastosEstidiante(), id.obtenerPresupuesto());
        
        InstitucionEducativa id2 = new InstitucionEducativa();
        id2.establecerNombre("San Francisco");
        id2.establecerTipoInstitucion("Fiscomicional");
        id2.establecerNumeroAlumnos(1500);
        id2.establecerNumeroDocentes(60);
        id2.establecerNumeroCedes(1);
        id2.establecerGastosEstudiante(50.63);
        id2.establecerPresupuesto();
        
        System.out.printf("Nombre de la Institucion: %s\n" + "Tipo de Institucion: %s\n" + "Numero de estudiantes: %d\n" + "Numero de docentes: %d\n" 
        + "Numero de cedes: %d\n" + "Gastos Proyectado por estudiante: %.2f\n" + "Presupuesto: %.2f\n", id2.obtenerNombre(), id2.obtenerTipoInstitucion(),
        id2.obtenerNumeroAlumnos(), id2.obtenerNumeroDocentes(), id2.obtenerNumeroCedes(), id2.obtenerGastosEstidiante(), id2.obtenerPresupuesto());
    }
}
