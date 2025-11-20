import java.util.Scanner;
public class Main {
    public static void precedimiento(int pNum){
        int pTotal = 0;
        for (int i = 0; i <= 10; i++){
             pTotal =  i * pNum;
             System.out.println(pNum + " x " + i + " = " + pTotal );
        }
    }
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Introduce el numero de la operacion: ");
        int iNum = scObj.nextInt();
        precedimiento(iNum);
    }
}