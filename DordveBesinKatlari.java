import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Sayi giriniz.. ");
        number = input.nextInt();

        System.out.println("Dördün Katları--- ");
        for(int i=1; i<=number; i=i*4)
        {
            System.out.println(i+" ");
        }

        System.out.println("Beşin Katları--- ");
        for(int j=1; j<=number; j*=5)
        {
            System.out.println(j+" ");
        }
    }
}