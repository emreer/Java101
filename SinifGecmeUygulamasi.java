import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //
        //Geçme Notu : 55
        //
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılması

        int mat, fizik, turkce, kimya, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = scan.nextInt();
        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = scan.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz:");
        turkce = scan.nextInt();
        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = scan.nextInt();
        System.out.println("Müzik Notunuzu Giriniz:");
        muzik = scan.nextInt();

        double average = (mat + fizik + kimya + turkce + muzik) / 5;

        if (average >= 0 && average <= 55) {
            System.out.println("Maalesef Seneye Tekrar Görüşmek Üzere !");
        } else if (average>55&&average<=100){
            System.out.println("Tebrikler Sınıfı Geçtiniz !");
        }
        else{
            System.out.println("Ortalama 0 ile 100 arasında olmalıdır !\n" +
                    "LÜtfen Girdiğiniz Bilgileri Kontrol Ediniz");
        }
    }
}