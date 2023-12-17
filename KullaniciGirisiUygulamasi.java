import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, secim, yeniSecim;
        String unutulanSifre = "java1234";


        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz:");
        userName = scan.nextLine();
        System.out.println("Şifrenizi Giriniz:");
        password = scan.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {

            System.out.println("Başarıyla Giriş Yapıldı!");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Girilen Şifre Hatalı!");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz ? Evet (E) /Hayır (H)");

            secim = scan.nextLine();

            if (secim.equals("E")) {
                System.out.println("Yeni Şifrenizi Belirleyiniz..");

                yeniSecim = scan.nextLine();

                if (yeniSecim.equals("java1234")) {
                    System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz !");
                }
                else{
                    System.out.println("Yeni Şifreniz Başarıyla Oluşturulmuştur !");
                }

            } else {
                System.out.println("Tekrar Anasayfaya Yönlendiriliyorsunuz..");
            }

        } else {
            System.out.println("Kullanıcı Bilgileri Hatalı!");
        }

    }
}