import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int iNum = 0;
        int iSuma = 0;
        int iIteraciones = 0;
        while (iNum >= 0) {
            System.out.println("Introduce el numero");
            iNum = scObj.nextInt();
            if (iNum >= 0) {
                iSuma += iNum;
                iIteraciones++;
            }
        }
        System.out.println("La media de todos ls numeros positivos es: "+ iSuma/iIteraciones);
    }
}
