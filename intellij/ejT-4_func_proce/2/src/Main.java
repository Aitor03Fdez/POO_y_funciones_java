import java.util.Scanner;
public class Main {
    public static void precedimiento(String pVar){
        System.out.println("Hola, "+ pVar +" ¡Bienvenido a Java!");
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("¿Como te llamas? ");
        String nombre = scObj.nextLine();
        precedimiento(nombre);
    }
}