public class FibonacciSerisi {

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }

    public static void main(String args[]) {

        recursiveMethod(4);

        //f(1)=2
        //f(2)=2
        //f(3)=3*f(2) = 6
        //f(4)=4*f(3)
    }
}




