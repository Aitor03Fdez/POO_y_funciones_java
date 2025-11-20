package Ejercicio8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rectangulo objRectangulo = new Rectangulo();
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el ancho del rectangulo: ");
        double ancho = input.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double alto = input.nextDouble();
        double area = objRectangulo.calcularArea(ancho,alto);
        double perimetro = objRectangulo.calcularPerimetro(ancho,alto);
        System.out.println("Su area del rectangulo es: " + area);
        System.out.println("Su perimetro del rectangulo es: " + perimetro);

        objRectangulo.mostrarDimensiones(area, perimetro);
    }
}
