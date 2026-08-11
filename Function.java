import java.util.Scanner;

public class Function {
    public static int fibonacaSeries(int x) {
        int fn, fn1, fn2;
        
        fn1 = 1;
        fn2 = 0;
        System.out.println(fn2);
        System.out.println(fn1);
        for (int i = 1; i <= x; i++) {
            fn = fn1 + fn2;
            fn2=fn1;
            fn1=fn;
           System.out.println(fn);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit:");
        int a = sc.nextInt();
        fibonacaSeries(a);
    }

}
