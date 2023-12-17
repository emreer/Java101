import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Taban sayısı giriniz..");
        int x = scan.nextInt();
        System.out.println("Üs sayısı giriniz..");
        int y = scan.nextInt();
        int total=1;

        for(int i=1;i<=y;i++){
            total*=x;
        }
        System.out.println(total);


    }
}