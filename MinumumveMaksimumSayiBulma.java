import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç Tane Sayı Gireceksiniz ?");
        int count = scan.nextInt();//Kaç Kez Sayı Gireceğimizi Giriyoruz
        int number, max = 0, min = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ".sayıyı giriniz:");
            number = scan.nextInt();//Sayiyi giriyoruz
            if (i == 1) {   //eğer girilen sayı ilk ve son ise hem max.hem min. olacaktır
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
                //her girilen sayi degeri bir sonrakinden büyük olarak atanacak
            }
            if (number < min) {
                min = number;
                //her girilen sayi degeri bir sonrakinden kücük olarak atanacak
            }
        }
        System.out.println("Maksimum Sayı: " + max);
        System.out.println("Minimum Sayı: " + min);
    }
}
