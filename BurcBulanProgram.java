import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık

        int day, month;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Ay Bilgisiniz Giriniz:");
        month = scan.nextInt();
        System.out.println("Lütfen Gün Bilgisini Giriniz:");
        day = scan.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
        }
        if (month == 1) {
            if (day <= 21 && day > 0) {
                System.out.println("Burcunuz: Oğlak");
            } else if (day > 21 && day <= 31) {
                System.out.println("Burcunuz: Kova");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 2) {
            if (day <= 19 && day > 0) {
                System.out.println("Burcunuz: Kova");
            } else if (day > 19 && day <= 29) {
                System.out.println("Burcunuz: Balık");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 3) {
            if (day <= 20 && day > 0) {
                System.out.println("Burcunuz: Balık");
            } else if (day > 20 && day <= 31) {
                System.out.println("Burcunuz: Koç");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 4) {
            if (day <= 20 && day > 0) {
                System.out.println("Burcunuz: Koç");
            } else if (day > 20 && day <= 30) {
                System.out.println("Burcunuz: Boğa");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 5) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: Boğa");
            } else if (day > 22 && day <= 31) {
                System.out.println("Burcunuz: İkizler");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 6) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: İkizler");
            } else if (day > 22 && day <= 30) {
                System.out.println("Burcunuz: Yengeç");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 7) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: Yengeç");
            } else if (day > 22 && day <= 31) {
                System.out.println("Burcunuz: Aslan");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 8) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: Aslan");
            } else if (day > 22 && day <= 31) {
                System.out.println("Burcunuz: Başak");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 9) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: Başak");
            } else if (day > 22 && day <= 30) {
                System.out.println("Burcunuz: Terazi");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 10) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: Terazi");
            } else if (day > 22 && day <= 31) {
                System.out.println("Burcunuz: Akrep");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 11) {
            if (day <= 21 && day > 0) {
                System.out.println("Burcunuz: Akrep");
            } else if (day > 21 && day <= 30) {
                System.out.println("Burcunuz: Yay");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
        if (month == 12) {
            if (day <= 22 && day > 0) {
                System.out.println("Burcunuz: Yay");
            } else if (day > 21 && day <= 30) {
                System.out.println("Burcunuz: Oğlak");
            } else {
                System.out.println("Yanlış Gün/Ay Bilgisi Girdiniz !");
            }
        }
    }
}