package Ejercicio2;

public class Persona {
    private  int edad;
    private String nombre;

    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esMayorDeEdad(){
        boolean resul = false;
        if (edad >= 18){
            resul = true;
        } else {
            resul = false;
        }
        return resul;
    }

    public void mostrarInformacion(){
        System.out.println("Edad: " + this.edad);
        System.out.println("Nombre: " + this.nombre);
        if (this.edad >= 18){
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
