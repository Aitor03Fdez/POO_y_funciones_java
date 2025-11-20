package Ejercicio1;

public class Alumno {

    private String nombre;
    private int nota;

    public Alumno(){}

    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre );
        System.out.println("Nota: " + this.nota);
    }

    public boolean esAprobado(){
        boolean resul = false;
        if (nota>=5){
            resul = true;
        } else {
            resul = false;
        }
        return resul;
    }
}
