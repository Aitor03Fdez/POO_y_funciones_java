import java.util.Scanner;
public class Main {
    public static int funcion(int fVar){
        int resultado = fVar * 2;
        return (int) resultado;
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Introduce el valor del número que quieres duplicar");
        int iVar = scObj.nextInt();
        int iValor = funcion(iVar);
        System.out.println("El resultado es: " + iValor);
    }
}
