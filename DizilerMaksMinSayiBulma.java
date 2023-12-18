import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] arr = {15,12,788,1,-1,-778,2,0};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int number=input.nextInt();
        int min = arr[0];
        int max = arr[0];

        for(int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        for(int i:arr){
            if(i>number){
                if (i<max){
                    max=i;
                }
            }
            if(i<number){
                if(i>min){
                    min=i;
                }
            }
        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: "+min);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: "+max);
    }
}