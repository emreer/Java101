import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {


        int a,b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Kenarı Giriniz:");
        a=input.nextInt();
        System.out.println("İkinci Kenarı Giriniz:");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs Uzunluğu: "+c);

        double alan = (a*b)/2;

        System.out.println("Üçgenin Alanı: "+alan);

    }
}