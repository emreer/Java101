import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Dizinin Boyutunu Giriniz:");
        int len = scan.nextInt();

        int [] list = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println((i+1) + ".Elemanı Giriniz:");
            int value = scan.nextInt();
            list[i]=value;
        }
        System.out.println("Dizinin Elemanları:");
        System.out.println(Arrays.toString(list));
        System.out.println("Küçükten Büyüğe Doğru Sıralaması:");
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}