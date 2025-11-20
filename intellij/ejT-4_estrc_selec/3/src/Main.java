import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int iNum1 = myObj.nextInt();
        switch (iNum1) {
            case 0, 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5, 6:
                System.out.println("Aprobado");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("no es una nota valida");
                break;
        }
    }
}