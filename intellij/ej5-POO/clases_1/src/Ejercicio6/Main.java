package Ejercicio6;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Alumno objAlumno = new Alumno();
        Scanner scObj = new Scanner(System.in);
        int iNum = 0;
        do {
            System.out.println("Ingrese el numero de lo q quiere hacer: " + "\n" +
                    "1- Insertar Registro" + "\n" +
                    "2- Modificar registro" + "\n" +
                    "3- Eliminar registro" + "\n" +
                    "4- Calcular tu nota" + "\n" +
                    "5- Salir");
            iNum = scObj.nextInt();
            switch (iNum) {
                case 1:
                    System.out.println("Ingrese el nombre del registro: ");
                    String nombre = scObj.next();

                    System.out.println("Ingrese el nombre de la Asignatura: ");
                    String nombreAsignatura = scObj.next();

                    System.out.println("Ingrese la nota del Parcial 1 (Examen):");
                    double notaParcial1Examen = scObj.nextDouble();

                    System.out.println("Ingrese la nota del Parcial 2 (Examen):");
                    double notaParcial2Examen = scObj.nextDouble();

                    System.out.println("Ingrese la nota de la Exposición:");
                    double notaExposicion = scObj.nextDouble();

                    System.out.println("Ingrese la nota de los Ejercicios:");
                    double notaEjercicios = scObj.nextDouble();

                    System.out.println("Ingrese la nota del Trabajo en Clase:");
                    double notaTrabajoClase = scObj.nextDouble();

                    objAlumno.insertarRegistro(nombre,nombreAsignatura,notaParcial1Examen, notaParcial2Examen, notaExposicion, notaEjercicios, notaTrabajoClase);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del registro: ");
                    String mnombre = scObj.next();

                    System.out.println("Ingrese el nombre de la Asignatura: ");
                    String mnombreAsignatura = scObj.next();

                    System.out.println("Ingrese la nota del Parcial 1 (Examen):");
                    double mnotaParcial1Examen = scObj.nextDouble();

                    System.out.println("Ingrese la nota del Parcial 2 (Examen):");
                    double mnotaParcial2Examen = scObj.nextDouble();

                    System.out.println("Ingrese la nota de la Exposición:");
                    double mnotaExposicion = scObj.nextDouble();

                    System.out.println("Ingrese la nota de los Ejercicios:");
                    double mnotaEjercicios = scObj.nextDouble();

                    System.out.println("Ingrese la nota del Trabajo en Clase:");
                    double mnotaTrabajoClase = scObj.nextDouble();

                    objAlumno.modificarRegistros(mnombre,mnombreAsignatura,mnotaParcial1Examen, mnotaParcial2Examen, mnotaExposicion, mnotaEjercicios, mnotaTrabajoClase);
                    break;
                case 3:
                    objAlumno.eliminarRegistro();
                    break;
                case 4:
                    System.out.println("Ingrese la nota del Parcial 1 (Examen):");
                    double nnotaParcial1Examen = scObj.nextDouble();

                    System.out.println("Ingrese la nota de la Exposición:");
                    double nnotaExposicion = scObj.nextDouble();

                    System.out.println("Ingrese la nota de los Ejercicios:");
                    double nnotaEjercicios = scObj.nextDouble();

                    System.out.println("Ingrese la nota del Trabajo en Clase:");
                    double nnotaTrabajoClase = scObj.nextDouble();
                    double nota = objAlumno.calcularNotaPrimeraEvaluacion(nnotaParcial1Examen, nnotaExposicion, nnotaEjercicios, nnotaTrabajoClase);
                    System.out.println("Su media es: " + nota);
                    break;
                default:
                    System.out.println("Opcion no permitida");
                    break;
            }
        } while(iNum != 5);
    }
}

