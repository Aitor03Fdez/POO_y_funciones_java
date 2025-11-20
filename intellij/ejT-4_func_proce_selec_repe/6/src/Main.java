import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int iIntentos = 1;
        boolean iSalida = false;
        while (iIntentos <= 3) {
            System.out.println("Introduce la cotraseña:");
            String iPwd = scObj.nextLine();
            if(iPwd.equals("Dam2025")){
                System.out.println("Contraseña acertada");
                iIntentos = iIntentos + 4;
                iSalida = true;
            } else{
                iIntentos++;
            }

        }
        if(!iSalida){
            System.out.println("Se bloquea el programa");
        }
    }
}