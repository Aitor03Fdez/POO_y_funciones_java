package Ejercicio8;

public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo() {}

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea(double ancho, double alto) {
        double area = ancho * alto;
        return area;
    }

    public double calcularPerimetro(double ancho, double alto) {
        double perimetro = (ancho + alto) *2;
        return perimetro;
    }

    public void mostrarDimensiones(double area, double perimetro) {
        System.out.println("Su area es: " + area + " y su perimetro es: " + perimetro);
    }

}
