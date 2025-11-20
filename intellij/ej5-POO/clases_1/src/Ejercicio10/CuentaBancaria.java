package Ejercicio10;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double cantidad){
        double total = this.saldo + cantidad;
        this.saldo = total;
    }

    public void retirar(double cantidad){

        if (this.saldo >= cantidad){
            this.saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Tu saldo actual es: " + this.saldo);
    }


}
