import java.util.Scanner;
public class Main {
    public static float funcion(float fBase, float fAltura){
        float resultado = (fBase * fAltura)/2;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Introduce el valor de la base:");
        float iBase = scObj.nextFloat();
        System.out.println("Introduce el valor de la altura:");
        float iAltura = scObj.nextFloat();
        float area = funcion(iBase, iAltura);
        System.out.println("El area es: "+area);
    }
}