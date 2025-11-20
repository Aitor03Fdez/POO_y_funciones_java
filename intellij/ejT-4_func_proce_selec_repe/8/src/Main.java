import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int iNum = scObj.nextInt();
        int iDivisor = 0;

        for (int i = 1; i <= iNum; i++) {
            if (iNum % i == 0) {
                iDivisor++;
            }
        }

        if (iDivisor == 2) {
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}