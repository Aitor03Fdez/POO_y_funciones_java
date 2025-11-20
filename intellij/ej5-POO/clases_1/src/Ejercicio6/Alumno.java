package Ejercicio6;

public class Alumno {

    private String nombre;
    private String nombreAsignatura;
    private double notaParcial1Examen;
    private double notaParcial2Examen;
    private double notaExposicion;
    private double notaEjercicios;
    private double notaTrabajoClase;

    public Alumno(){}

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    public double getNotaParcial1Examen() {
        return notaParcial1Examen;
    }
    public void setNotaParcial1Examen(double notaParcial1Examen) {
        this.notaParcial1Examen = notaParcial1Examen;
    }
    public double getNotaParcial2Examen() {
        return notaParcial2Examen;
    }
    public void setNotaParcial2Examen(double notaParcial2Examen) {
        this.notaParcial2Examen = notaParcial2Examen;
    }
    public double getNotaExposicion() {
        return notaExposicion;
    }
    public void setNotaExposicion(double notaExposicion) {
        this.notaExposicion = notaExposicion;
    }
    public double getNotaEjercicios() {
        return notaEjercicios;
    }
    public void setNotaEjercicios(double notaEjercicios) {
        this.notaEjercicios = notaEjercicios;
    }
    public double getNotaTrabajoClase() {
        return notaTrabajoClase;
    }

    public void insertarRegistro(String nombre, String nombreAsignatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = notaParcial1Examen;
        this.notaParcial2Examen = notaParcial2Examen;
        this.notaExposicion = notaExposicion;
        this.notaEjercicios = notaEjercicios;
        this.notaTrabajoClase = notaTrabajoClase;
    }

    public void modificarRegistros(String nombre, String nombreAsignatura, double notaParcial1Examen, double notaParcial2Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase ) {
        this.nombre = nombre;
        this.nombreAsignatura = nombreAsignatura;
        this.notaParcial1Examen = notaParcial1Examen;
        this.notaParcial2Examen = notaParcial2Examen;
        this.notaExposicion = notaExposicion;
        this.notaEjercicios = notaEjercicios;
        this.notaTrabajoClase = notaTrabajoClase;
    }

    public void eliminarRegistro() {
        this.nombre = " ";
        this.nombreAsignatura = " ";
        this.notaParcial1Examen = 0;
        this.notaParcial2Examen = 0;
        this.notaExposicion = 0;
        this.notaEjercicios = 0;
        this.notaTrabajoClase = 0;
    }

    public double calcularNotaPrimeraEvaluacion(double notaParcial1Examen, double notaExposicion, double notaEjercicios, double notaTrabajoClase){
        double media = (notaParcial1Examen + notaExposicion + notaEjercicios + notaTrabajoClase)/4;
        return media;
    }


}
