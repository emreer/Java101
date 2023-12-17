import java.util.Scanner;
public class Main {

    static int fibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayısı Giriniz: ");
        int x = scanner.nextInt();
        System.out.println(fibonacci(x));
//1, 1, 2, 3, 5, 8, 13
    }
}