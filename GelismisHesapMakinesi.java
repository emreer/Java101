import java.util.Scanner;

public class Main {

    static int toplama(int x, int y) {
        return x + y;
    }

    static int cikarma(int x, int y) {
        return x - y;
    }

    static int carpma(int x, int y) {
        return x * y;
    }

    static int bolme(int x, int y) {
        if (y == 0) {
            System.out.println("Bölen 0 olamaz !");
            return 0;
        }
        return x / y;
    }

    static int usAlma(int taban, int us) {
        int result = 1;
        for (int i = 1; i <= us; i++) {

            result *= taban;
        }
        return result;
    }

    static void factorial(int number) {

        int result = 1;
        for (int i = 1; i <= number; i++) {

            result *= i;
        }
        System.out.println(number + "!: " + result);
    }

    static int mod(int num1, int num2) {
        return num1 % num2;
    }

    static int square(int n1, int n2) {
        return n1 * n2;
    }

    static int perimeter(int n1, int n2) {
        return 2 * (n1 + n2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu =
                "1- Toplama İşlemi 2- Çıkarma İşlemi 3- Çarpma İşlemi 4- Bölme işlemi\n" +
                        "5- Üslü Sayı Hesaplama 6- Faktoriyel Hesaplama 7- Mod Alma 8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0- Çıkış Yap -->";

        do {
            System.out.println("Merhaba");
            System.out.println("Bir İşlem Seçiniz:");
            System.out.println(menu);

            select = scan.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Birinci Sayıyı Giriniz:");
                    int a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz:");
                    int b = scan.nextInt();
                    System.out.println("Sonuç: " + toplama(a, b));
                    break;
                case 2:
                    System.out.print("Birinci Sayıyı Giriniz:");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz:");
                    b = scan.nextInt();
                    System.out.println("Sonuç: " + cikarma(a, b));
                    break;
                case 3:
                    System.out.print("Birinci Sayıyı Giriniz:");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz:");
                    b = scan.nextInt();
                    System.out.println("Sonuç: " + carpma(a, b));
                    break;
                case 4:
                    System.out.print("Birinci Sayıyı Giriniz:");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz:");
                    b = scan.nextInt();
                    System.out.println("Sonuç: " + bolme(a, b));
                    break;

                case 5:
                    System.out.print("Taban Sayısını Giriniz:");
                    a = scan.nextInt();
                    System.out.print("Üs Sayısını Giriniz:");
                    b = scan.nextInt();
                    System.out.println("Sonuç: " + usAlma(a, b));
                    break;
                case 6:
                    System.out.print("Bir Sayı Giriniz:");
                    a = scan.nextInt();
                    factorial(a);
                    break;

                case 7:
                    System.out.print("Birinci Sayı Giriniz:");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayı Giriniz:");
                    b = scan.nextInt();
                    System.out.println("Mod Alma Sonucu: " + mod(a, b));
                    break;
                case 8:
                    System.out.println("Hangi İşlemi Yapacaksınız ?\n" +
                            "1-Alan Hesabı 2-Çevre Hesabı");
                    int islem = scan.nextInt();
                    if (islem == 1) {
                        System.out.print("Kısa Kenarı Giriniz:");
                        a = scan.nextInt();
                        System.out.print("Uzun Kesanı Giriniz:");
                        b = scan.nextInt();
                        System.out.println("Dikdörtgenin Alanı: " + square(a, b) + " metrekaredir");
                    }
                    if (islem == 2) {
                        System.out.print("Kısa Kenarı Giriniz:");
                        a = scan.nextInt();
                        System.out.print("Uzun Kesanı Giriniz:");
                        b = scan.nextInt();
                        System.out.println("Dikdörtgenin Çevresi: " + perimeter(a, b) + " metredir");
                    }

                    break;

                default:
                    break;

            }

        } while (select != 0);


    }
}