package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona objPersona1 = new Persona(22,"Aitor");
        objPersona1.mostrarInformacion();
        boolean edad1 = objPersona1.esMayorDeEdad();
        System.out.println("¿Mayor de edad?: " + edad1);
        objPersona1.setEdad(13);
        objPersona1.mostrarInformacion();
        boolean edad2 = objPersona1.esMayorDeEdad();
        System.out.println("¿Mayor de edad?: " + edad2);
    }
}
