package Ejercicio10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del titular: ");
        String titular = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(titular);

        System.out.println("\nEstado inicial de la cuenta:");
        cuenta.mostrarSaldo();

        System.out.print("Introduce cantidad a depositar: ");
        double deposito = sc.nextDouble();
        cuenta.depositar(deposito);
        cuenta.mostrarSaldo();

        System.out.print("Introduce cantidad a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);
        cuenta.mostrarSaldo();
    }
}
