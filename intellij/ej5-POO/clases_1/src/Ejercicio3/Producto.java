package Ejercicio3;

public class Producto {

    private double precio;
    private int cantidad;
    private String nombre;

    public Producto(double precio, int cantidad, String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double modificarPrecio(double newPrecio) {
        return precio = newPrecio;
    }

    public void vender(int cantidadVendida){
        int stockFinal = this.cantidad - cantidadVendida;
        String resultado;
        if(stockFinal < 0){
            resultado = "Falta de stock";
        } else {
            resultado = "Stock encontrado";
        }
        System.out.println(resultado);
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
    }


}

