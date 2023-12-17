import java.util.Scanner;
public class AsalSayiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number= scan.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number+"x"+i+" = "+(number*i));
        }

    }
}

