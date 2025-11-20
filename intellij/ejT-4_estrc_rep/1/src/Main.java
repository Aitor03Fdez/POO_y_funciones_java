public class Main {
    public static void main(String[] args) {
        int iPrimerMes = 5;
        int iTotal = 0;
        for (int i = 1; i <= 12; i++) {
            iTotal = iTotal + iPrimerMes;
            iPrimerMes = iPrimerMes * 2;
        }
        System.out.println(iTotal);
    }
}
