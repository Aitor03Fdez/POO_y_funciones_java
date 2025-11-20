import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        System.out.print("Introduce un numero y t hago su tabla de multiplicar: ");
        int iNum1 = scNum.nextInt();
        int iTotal = 0;
        for(int i = 0 ;i <= 10 ; i++){
            iTotal = iNum1 * i;
            System.out.println(iNum1 + " x " +  i + "= " + iTotal);
        }
    }
}
