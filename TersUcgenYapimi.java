public class TersUcgenYapimi {
    public static void main(String[] args) {

        System.out.println("---TERS ÜÇGEN OLUŞTURMA---");
        for (int i = 10; i >= 0; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}