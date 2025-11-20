import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scDia = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 7");
        int iDia = scDia.nextInt();
        switch (iDia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Dia de la semana no válido");
        }
    }
    public static void conIf() {
        Scanner scDia = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 7");
        int iDia = scDia.nextInt();
        if (iDia == 1) {
            System.out.println("Es lunes");
        } else if (iDia == 2) {
            System.out.println("Es martes");
        } else if (iDia == 3) {
            System.out.println("Es miercoles");
        } else if (iDia == 4) {
            System.out.println("Es jueves");
        } else if (iDia == 5) {
            System.out.println("Es viernes");
        } else if (iDia == 6) {
            System.out.println("Es sabado");
        } else if (iDia == 7) {
            System.out.println("Es domingo");
        } else {
            System.out.println("Día de la semanano válido");
        }
    }

}
