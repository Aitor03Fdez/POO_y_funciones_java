import java.util.Scanner;
public class Main {
    public static boolean funcion(int fNum){
        if(fNum % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Introduce el valor de la operacion: ");
        int iNum = scObj.nextInt();
        boolean res = funcion(iNum);

        if(res){
            System.out.println("El valor de la operacion es: "+res);
        } else {
            System.out.println("El valor de la operacion es: "+res);
        }
    }
}
