
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy,kilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz");
        boy = input.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz");
        kilo = input.nextDouble();

        double indeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+indeks);

    }
}