import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int r;
                double pi = 3.14;

                Scanner input = new Scanner(System.in);
                System.out.println("Dairenin Yarıçapını Giriniz..");

                r=input.nextInt();
                double cevre = 2*pi*r;
                double alan = pi*r*r;

                System.out.println("Dairenin Çevresi: "+cevre);
                System.out.println("Dairenin Alanı: "+alan);

            }
        }
