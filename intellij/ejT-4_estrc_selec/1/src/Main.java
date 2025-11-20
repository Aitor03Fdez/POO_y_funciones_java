import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int iNum1 = myObj.nextInt();
        if (iNum1 >= 100){
            System.out.println("Número grande");
        } else {
            System.out.println("Perfecto");
        }
    }
}
