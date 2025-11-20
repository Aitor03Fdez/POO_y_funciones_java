import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scCaracter = new Scanner(System.in);
        System.out.print("Dime una letra: ");
        String iCaracter = scCaracter.nextLine();
        if (iCaracter.equals(" ")) {
            System.out.println("Se cierra el programa");
        } else {
            switch (iCaracter) {
                case "a", "e", "i", "o", "u":
                    System.out.println("Es vocal");
                    break;
                default:
                    System.out.println("Es consonante");
                    break;
            }
        }
    }
}
