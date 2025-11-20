import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int iNumAlm = scObj.nextInt();
        float iNota = 0;
        float iTotal = 0;
        float iSuma = 0;
        for (int i = 1; i <= iNumAlm; i++) {
            System.out.print("Introduce la nota del alumno: ");
            iNota = scObj.nextInt();
            iSuma = iSuma + iNota;
            iTotal = iSuma / iNumAlm;
        }
        System.out.println("La media de los alumnos es: " + iTotal);
    }
}
