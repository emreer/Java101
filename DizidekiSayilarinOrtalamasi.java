public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2,3};
        double sum = 0.0;
        double harmonik=0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        for(double j=1;j<=list.length;j++){
            harmonik+=(1/j);
        }

        double average = sum / list.length;
        System.out.println("Dizideki Sayıların Ortalaması: " + average);
        System.out.println("Dizideki Harmonik Ortalama: "+harmonik);
    }
}