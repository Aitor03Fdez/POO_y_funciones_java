package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto objProducto = new Producto(12.54, 300, "pelotas");
        objProducto.modificarPrecio(15.99);
        objProducto.vender(50);
        objProducto.mostrarInfo();

    }
}
