package peaksoft;

public class Main {

    public static void main(String[] args) {
        int summa = 0;
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                summa+=i;
            }
        }System.out.println(summa);
    }
}
