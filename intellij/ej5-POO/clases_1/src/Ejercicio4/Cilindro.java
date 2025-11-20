package Ejercicio4;

public class Cilindro {

    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen() {
        double resultado = Math.PI * Math.pow(radio,2) * altura;
        return resultado;
    }
    public double calcularAreaLateral() {
        double resultado = 2 * Math.PI * radio * altura;
        return resultado;
    }

    public void mostrarMedidad(){
        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);

        double resultadoArea = calcularAreaLateral();
        double  resultadoVolumen = calcularVolumen();
        System.out.println("Area: " + resultadoArea);
        System.out.println("Volumen: " + resultadoVolumen);
    }
}
