import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int iNumAlm = scObj.nextInt();
        int iSuma = 0;
        int iSuspe = 0;
        int iAprob = 0;
        int iMax = 0;
        int iMin = 10;
        for(int i = 0; i < iNumAlm; i++){
            System.out.println("Digame las notas de sus alumnos: ");
            int iNotas = scObj.nextInt();
            iSuma += iNotas;
            if(iNotas < 0) {

                System.out.println("El alumno no puede ser negativo");
                break;

            } else {

                if (iNotas >= 5) {
                    iAprob++;
                } else {
                    iSuspe++;
                }

                if (iMax < iNotas) {
                    iMax = iNotas;
                }
                
                if (iMin > iNotas) {
                    iMin = iNotas;
                }

            }

        }
        System.out.println("La media de sus alumnos es: " + iSuma/iNumAlm);
        System.out.println("El número de suspensos de la clase es: " + iSuspe);
        System.out.println("El número de aprobados de la clase es: " + iAprob);
        System.out.println("La nota mas alta es: " + iMax + " y la mas baja: " + iMin);
    }
}
