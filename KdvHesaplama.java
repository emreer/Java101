import java.util.Scanner;

public class KdvHesaplama {

        public static void main(String[] args) {


            double kdvliTutar;

            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen tutarı giriniz..");

            double tutar = input.nextDouble();

            //Girilen tutar 0 ile 1000 arasında ise, KDV Oranı: 18%, değilse 8% alınacak
            double kdvOran = tutar>0&&tutar<=1000?0.18:0.8;

            kdvliTutar=(kdvOran*tutar)+tutar;

            System.out.println("Tutar: "+tutar);
            System.out.println("KDV Oranı: "+kdvOran);
            System.out.println("KDV'li Tutar: "+kdvliTutar);

        }

    }
