import java.util.*;

 class loop {
    public static void main(String args[]){
        System.out.print("enter the table you want to print:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }
    }
}