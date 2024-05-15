
package paquete02;
import paquete01.LibretaCalificacion;

public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";
        LibretaCalificacion libreta = new LibretaCalificacion(
                nombreEstudiante,notas);
        libreta.establecerPromedio();
        // Si yo comento esta linea ya no estaria llamado lo que tengo 
        // en promedio y tomaria como valor lo que tiene como defecto que seria
        // un double
        libreta.establecerPromedioCualitativo();
        // Asi mismo si yo dejo comentada esta linea no me llama abasulutamente 
        // nada y de igual forma toma como valor lo que este asiganado en el 
        // promedio culitativo que seria un String y me presentaria null que es 
        //lo que toma por defecto
        System.out.printf("%s\n ",libreta);
    }
}
