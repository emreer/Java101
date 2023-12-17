import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;

        int total = 1, total1 = 1, total2 = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz..");
        x = scan.nextInt();
        System.out.println("Kombinasyon için bir sayı daha giriniz..");
        y = scan.nextInt();
        for (int i = 1; i <= x; i++) {

            total *= i;

        }
        for (int j = 1; j <= y; j++) {

            total1 *= j;

        }
        int z = x - y;
        for (int k = 1; k <= z; k++) {

            total2 *= k;

        }

        System.out.println("C(" + x + "," + y + ")= " + total / (total1 * total2));


    }
}