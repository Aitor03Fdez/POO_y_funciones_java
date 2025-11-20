import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Elige una opción: " + "\n" +
                "1- Ropa con descuento"+ "\n" +
                "2- Financiación"+ "\n" +
                "3- Salir");
        int iEntry = myObj.nextInt();
        switch (iEntry) {
            case 1:
                System.out.println("¿De que quiere saber el descuento?: " + "\n" +
                        "1- Calzado"+ "\n" +
                        "2- Camisas"+ "\n" +
                        "3- Pantalones"+ "\n" +
                        "4- Salir");
                int iIf =  myObj.nextInt();
                if(iIf == 1){
                    System.out.println("El calzado no tiene descuento");
                } else if (iIf == 2){
                    System.out.println("Las camisas tienen un 20% de descuento");
                } else if (iIf == 3){
                    System.out.println("Los pantalones tienen un 5% descuento");
                } else if (iIf == 4){
                    System.out.println("Se cierra el programa");
                } else {
                    System.out.println("No se puede saber el descuento");
                }
                break;
            case 2:
                System.out.println("Segun terminos y condiciones se aplica un aumento del 5% mensual del producto financiado");
                System.out.println("Digame el precio de su compra:");
                int iPrecio = myObj.nextInt();
                System.out.println("Digame la cantidad de meses a financiar:");
                int iMeses = myObj.nextInt();
                break;
            case 3:
                System.out.println("Se cierra el programa");
                break;
            default:
                System.out.println("Esa opción no es válida");
                break;
        }
    }
}