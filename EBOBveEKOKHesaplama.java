import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı Giriniz:");
        int n1 = scan.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz:");
        int n2 = scan.nextInt();

        int ekok = 1, ebob = 1, i = 1;

        //6:12-24-6 ve 8 EKOKu : 24
        //8:16-24-...

        System.out.println("---------EKOK HESAPLAMA---------");
        while (ekok <= n1 * n2) {
            if (ekok % n1 == 0 && ekok % n2 == 0) {
                System.out.println(n1 + " ve " + n2 + " sayılarının EKOK değeri: " + ekok);
                break;
            }
            ekok++;
        }
        System.out.println("---------EBOB HESAPLAMA---------");
        while (i <= n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB değeri: " + ebob);
    }
}


