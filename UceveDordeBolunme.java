import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayiAdedi=0, toplam = 0;
        System.out.println("Bir Sayı Giriniz... ");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {

            //3'e ve4'e bölünebilen sayılar
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
                toplam += i;//başta toplam 0'dır ancak i değeri kadar arttırılır
                sayiAdedi++;//döngü çalıştıkça 1!er arttırılır

            }
        }
        System.out.println("Toplam: " + toplam);//3'e ve 4'e bölünen sayıların toplamı
        System.out.println("Sayıların Ortalaması:"+toplam/sayiAdedi);//Bu sayıların ortalaması

    }
}