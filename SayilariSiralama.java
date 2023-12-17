import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        int a, b, c;

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz:");
        a = scan.nextInt();
        System.out.println("2.Sayıyı Giriniz:");
        b = scan.nextInt();
        System.out.println("3.Sayıyı Giriniz:");
        c = scan.nextInt();

        if (a > b && a > c) {

            if (b > c) {
                System.out.println("Girilen Sayılar\n" + c + "," + b + "," + a);
                System.out.println("Sayıların Sıralaması: " + a + ">" + b + ">" + c);
            } else if (c > b) {
                System.out.println("Girilen Sayılar\n" + b + "," + c + "," + a);
                System.out.println("Sayıların Sıralaması: " + a + ">" + c + ">" + b);
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println("Girilen Sayılar\n" + c + "," + a + "," + b);
                System.out.println("Sayıların Sıralaması: " + b + ">" + a + ">" + c);
            } else if (a < c) {
                System.out.println("Girilen Sayılar\n" + a + "," + c + "," + b);
                System.out.println("Sayıların Sıralaması: " + b + ">" + c + ">" + a);
            }

        }
    }
}