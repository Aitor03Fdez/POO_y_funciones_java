package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Aitor", "yo");
        libro1.estado();
        libro1.prestar();
        libro1.estado();
        libro1.devolver();
        libro1.estado();
    }
}
