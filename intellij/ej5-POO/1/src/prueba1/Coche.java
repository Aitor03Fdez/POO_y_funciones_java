package prueba1;

public class Coche {

    private String marca;
    private String modelo;
    private String etiquetaEco;
    private int velocidadMax;

    public Coche() {}

    public Coche(String marca, String modelo,  String etiquetaEco, int velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.etiquetaEco = etiquetaEco;
        this.velocidadMax = velocidadMax;
    }

    public Coche(String modelo,  String etiquetaEco, int velocidadMax) {
        this.modelo = modelo;
        this.etiquetaEco = etiquetaEco;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEtiquetaEco() {
        return this.etiquetaEco;
    }

    public void setEtiquetaEco(String etiquetaEco) {
        this.etiquetaEco = etiquetaEco;
    }

    public int getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Etiqueta: " + this.getEtiquetaEco());
        System.out.println("Velocidad max: " + this.getVelocidadMax());
    }

    public boolean comprobarZBE(String etiquetaEco) {
        boolean resultado = false;
        if (etiquetaEco.equals("0") || etiquetaEco.equals("ECO")) {
            resultado = true;

        } else {
            resultado = false;

        }
        return resultado;
    }

    public int sobrepasarVelocidadMax(int velocidadMax) {
        int velocidadRecomendada = 120;
        int resultado = velocidadMax - velocidadRecomendada;
        return resultado;
    }

    public void EjemploSinStatic(){
        System.out.println("Ejemplo sin Static");
    }
    public static void EjemploConStatic(){
        System.out.println("Ejemplo con Static");
    }
}
