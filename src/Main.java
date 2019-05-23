public class Main {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 2; i <= 100; i++) {

            if (i % 2 == 0) {
                suma += i;
                System.out.printf("%d ", i);
            }

        }
        System.out.printf("\nSuma %d ", suma);
    }
}
