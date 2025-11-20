import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Introduce la cantidad de numeros: ");
        int iCant = scObj.nextInt();
        int iNum = 0;
        int iNeg = 0;
        for(int i = 1 ; i <= iCant ; i++){
            System.out.print("Introduce un numero: ");
            iNum = scObj.nextInt();
            if(iNum < 0){
                iNeg++;
            }
        }
        System.out.print("La cantidad de número negativos es: " + iNeg);
    }
}
