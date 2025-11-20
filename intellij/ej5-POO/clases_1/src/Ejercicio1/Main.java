package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Alumno objAlumno1 = new Alumno("Aitor", 10);
        objAlumno1.mostrarInformacion();
        boolean nota = objAlumno1.esAprobado();
        System.out.println("aprobado = " + nota);
    }
}
