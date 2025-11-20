import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int iIntentos = 0;
        int iSaldo = 1000;
        boolean iSalida = false;
        do {
            System.out.println("Digame la contraseña");
            int iPwd = scObj.nextInt();
            iIntentos++;
            if (iPwd == 1234) {
                iSalida = true;
                System.out.println("Bienvenido, ¿Qué desea hacer?" + "\n" +
                        "1- Consulta saldo" + "\n" +
                        "2- Ingresar dinero" + "\n" +
                        "3- Retirar dinero" + "\n" +
                        "4- Salir");
                int iOpc = scObj.nextInt();
                switch (iOpc) {
                    case 1:
                        System.out.println("Su saldo actual es de: "+ iSaldo);
                        break;
                    case 2:
                        System.out.println("¿Cuanto dinero quieres ingresar?");
                        int iAumento = scObj.nextInt();
                        iSaldo = iSaldo + iAumento;
                        System.out.println("Su saldo actual es de: "+ iSaldo);
                        break;
                    case 3:
                        System.out.println("¿Cuanto dinero quieres retirar?");
                        int iDecremento = scObj.nextInt();
                        iSaldo = iSaldo - iDecremento;
                        System.out.println("Su saldo actual es de: "+ iSaldo);
                        break;
                    default:
                        iIntentos = iIntentos + 3;
                }
            }

        } while (iIntentos < 3);

        if (!iSalida) {
            System.out.println("Se han excedido los intentos");
        }
    }
}
