import java.util.Scanner;

public class ExponentCalculator {
    Scanner scanner = new Scanner(System.in);

    public void calc() {

        System.out.print("Üssü alınacak sayı : ");
        int num = scanner.nextInt();
        System.out.print("üs olacak sayı : ");
        int exponent = scanner.nextInt();

        int total = num;

        for (int i = exponent - 1; i > 0; i--) {
            total *= num;
        }

        System.out.println("Sonuç = " + total);

    }
}
