public class Main {
    public static void main(String[] args) {
        int[] list = {1,4,7,8,7,9,4,45,46,45};

        int frekans;

        for (int i = 0; i < list.length; i++) {

            int number = list[i];
            frekans = 0;
            int repetitive=0;

            if (number == repetitive) {
                continue;
            }

            for(int j=i;j<list.length;j++){
                if(number==list[j]){
                    frekans++;
                    list[j]=repetitive;
                }
            }
            System.out.println(number+" sayısı "+frekans+" kere tekrar etmiştir.");
        }
    }
}
