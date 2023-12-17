import java.util.Scanner;
public class Main {
    static int power(int i, int x) {

        if (x == 0) return 1; //üs 0 olursa sonuç 1 olacak
        else return i * power(i, x-1 );

        //2^2=2*2^1
        //2^3=2*2^2
        //f(x)=i*f(x-1)

    }
    //f(x)=y
    //f(x+1)=f(x)*x
    //f(3)=f(2)*2

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Taban Değerini Giriniz");
        int sub = scan.nextInt();

        System.out.println("Üs Değerini Giriniz");
        int exp = scan.nextInt();

        System.out.println("Sonuç: " + power(sub, exp));
    }
}