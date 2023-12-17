import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hava Sıcaklığı Değeri Giriniz:");

        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        heat = scan.nextInt();

        if(heat<=5){
            System.out.println("Kayak Yapabilirsiniz");
        } else if (heat>5&&heat<=15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        } else if (heat>15&&heat<25) {
            System.out.println("Pikniğe Gidebilirsiniz");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }


    }
}