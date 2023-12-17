import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bir sayının kendisi hariç pozitif tam sayı çarpanları
        // (kalansız bölen sayıların) toplamı kendisine eşit olan
        // sayıya mükemmel sayı denir.

        //28: 1+2+4+7+14=28--Mükemmel Sayı
        //10: 1+2+5=8!=10--Mükemmel Sayı Değil!
        //15: 1+3+5=9!=15----Mükemmel Sayı Değil!

        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("---Mükemmel Sayı Bulma---");
        System.out.println("Lütfen Sayı Giriniz: ");
        int number = scan.nextInt();

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " Mükemmel Sayıdır");
        } else if (number < 0) {
            System.out.println("Lütfen Pozitif Sayı Giriniz");
        } else {
            System.out.println(number + " Mükemmel Sayı Değildir !");
        }
    }
}
