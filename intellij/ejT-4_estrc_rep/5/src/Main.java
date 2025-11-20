import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        int iAzar = (int) (Math.random() * 50) + 1;
        int iNumInt = 0;
        int iNum = 0;
        while (iNumInt < 6 && iAzar != iNum) {
            System.out.print("Dime un número: ");
            iNum = scNum.nextInt();
            iNumInt++;
            if (iNum > iAzar) {
                System.out.println("Tu número es menor");
            } else {
                System.out.println("Tu número es mayor");
            }
        }

        if (iNum == iAzar) {
            System.out.println("Has adivinado el numero en " + iNumInt);
        } else {
            System.out.println("No lo has adivinado, el numero era: " + iAzar);
        }

    }
}
