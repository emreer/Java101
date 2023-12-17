import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x,y,secim;

        System.out.println("1.sayıyı giriniz:");
        x = scan.nextInt();
        System.out.println("2.sayıyı giriniz:");
        y = scan.nextInt();

        System.out.println("Hangi İşlemi Yapmak İstiyorsunuz ?\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç: " + (x + y));
                break;
            case 2:
                System.out.println("Sonuç: " + (x - y));
                break;
            case 3:
                System.out.println("Sonuç: " + (x * y));
                break;
            case 4:
                System.out.println("Sonuç: " + (x / y));
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız");
                break;
        }


    }
}