import java.util.Scanner;

public class Main {
    public static void procedimiento(int var2) {
        System.out.println(var2);
    }
    public static int funcion(int fVar){
        int resultado = fVar * 2;
        return resultado;
    }
    public static void main(String[] args) {
        int var = 4;
        procedimiento(var);
        int valor = funcion(var);
        System.out.println(valor);
    }
}
