import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int number = random.nextInt(100);//0 ile 100 arasında rastgele int sayı üretiyor
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("Lütfen bir sayı giriniz");
            int selected = scan.nextInt();

            if (selected <= 0 || selected > 99) {
                System.out.println("UYARI ! : 0 ile 100 arasında Sayı Giriniz");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız!\n" +
                            "Kalan Hakkınız: " + (5 - right));
                }
                else{
                    isWrong=true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir !");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler !" + selected + "Sayısı Doğru Tahmin !");
                isWin = true;

                break;
            } else {

                System.out.println("Bilemediniz !");
                if (selected > number) {
                    System.out.println("Girdiğiniz Sayı Büyük");
                } else {
                    System.out.println("Girdiğiniz Sayı Küçük");
                }
                wrong[right++]=selected;
                System.out.println("Kalan Hakkınız: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz !");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}