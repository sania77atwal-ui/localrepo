
public class Patten {

    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println("");
        }
        int k=5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= k - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}