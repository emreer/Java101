import java.util.Scanner;
public class TaksiKilometreUygulamasi {
    public static void main(String[] args) {

        //Kilometre başına 2.2 TL
        //Taksi açılış ücreti 10 TL
        //Min. Ücret 20 TL olacak

        double tutar,acilisTutari=10,kmTutari=2.2;
        int km;

        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen gidilen mesafeyi km cinsinden giriniz..");

        km = input.nextInt();
        tutar=km*kmTutari;

        tutar+=acilisTutari;

        tutar = (tutar)<20?20:tutar;

        System.out.println("Toplam Tutar: "+tutar);



    }
}