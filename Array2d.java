import java.util.Scanner;

public class Array2d {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        // array created
        int[][] array = new int[row][col];
        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[][] transpose = new int[col][row];
        //transpose[col][row] = array[i][j];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]);
                 transpose[j][i]=array[i][j];
            }
            System.out.println();
        }
        for (int j = 0; j < col; j++) {
        for (int i = 0; i < row; i++) {

            System.out.print(transpose[j][i]);
        }
        System.out.println();
        }

    }
}
