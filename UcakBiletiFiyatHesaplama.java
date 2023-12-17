import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

double kmUcreti=0.10;
int km,yas;
int yolculukTipi;


Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen KM Bilgisi Giriniz");
        km = scan.nextInt();
        System.out.println("Lütfen Yaşınızı Giriniz");
        yas = scan.nextInt();
        System.out.println("Lütfen Yolculuk Türünü Giriniz\n1-Tek Yön 2-Gidiş-Dönüş");
        yolculukTipi = scan.nextInt();

        double tutar = km*kmUcreti;

        if(yas<12){
            if(yolculukTipi==2){
                System.out.println("Toplam Tutar:"+(tutar*0.5)*0.8);
            } else if (yolculukTipi==1) {
                System.out.println("Toplam Tutar:"+(tutar*0.5));
            }
            else{
                System.out.println("Hatalı Bilgi Girdiniz !");
            }
        }
        if(yas>12&&yas<24){
            if(yolculukTipi==2){
                System.out.println("Toplam Tutar:"+(tutar*0.9)*0.8);
            } else if (yolculukTipi==1) {
                System.out.println("Toplam Tutar:"+(tutar*0.9));
            }
            else{
                System.out.println("Hatalı Bilgi Girdiniz !");
            }
        }
        if(yas>65){
            if(yolculukTipi==2){
                System.out.println("Toplam Tutar:"+(tutar*0.7)*0.8);
            } else if (yolculukTipi==1) {
                System.out.println("Toplam Tutar:"+(tutar*0.7));
            }
            else{
                System.out.println("Hatalı Bilgi Girdiniz !");
            }
        }
        if (yas>24&&yas<65){
            if(yolculukTipi==2){
                System.out.println("Toplam Tutar:"+(tutar*0.8));
            }
            else if (yolculukTipi==1) {
                System.out.println("Toplam Tutar:"+tutar);
            }
            else{
                System.out.println("Hatalı Bilgi Girdiniz !");
            }

        }

    }
}