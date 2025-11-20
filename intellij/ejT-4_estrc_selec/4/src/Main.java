import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pwd = new Scanner(System.in);
        String iPwd = pwd.nextLine();
        if (iPwd.equals("admin123")){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
