import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scFac = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int iNum1 = scFac.nextInt();
        int iResultado = 1;
        int iContador = 1;
        while (iNum1 >= iContador) {
            iResultado = iResultado * iContador;
            iContador++;
        }
        System.out.println(iResultado);
    }
}
