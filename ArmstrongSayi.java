import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz..");
        int number = scan.nextInt();
        int basNumber = 0, tempNumber = number;
        int basValue, total = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Basamak Sayısı: " + basNumber);

        tempNumber = number;
        System.out.print("Sayılar:");
        while (tempNumber != 0) {

            basValue = tempNumber % 10;
            tempNumber /= 10;
            total += basValue;
            System.out.print(basValue+" ");
        }


        System.out.println("\nSayıların Toplamı: " + total + " ");
    }
}