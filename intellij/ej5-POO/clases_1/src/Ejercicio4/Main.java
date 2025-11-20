package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cilindro objCilindro = new Cilindro(12.56, 8.56);

        double volumen = objCilindro.calcularVolumen();
        double area  = objCilindro.calcularAreaLateral();
        System.out.println("Volumen: " + volumen);
        System.out.println("Area: " + area);
        objCilindro.mostrarMedidad();
    }
}
