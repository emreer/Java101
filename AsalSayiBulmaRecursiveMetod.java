import java.util.Scanner;
public class Main {
    static int isPrime(int number, int i) {

        if (number == i) {
            return 1;
        } else {
            if (number % i == 0) {
                return 0;
            } else {
                return isPrime(number, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int x = scan.nextInt();
        int i = 2;

        if (isPrime(x, i) == 1) {
            System.out.println("Girilen Sayı Asaldır: " + x);
        } else {
            System.out.println("Girilen Sayı Asal Değildir: " + x);
        }
    }
}