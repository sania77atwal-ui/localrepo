import java.util.*;

class Strings {
    public static void main(String[] args) {
        // String declaration

        // String name="Sania";
        // String fullname="Sania Atwal";
        // String sentence=" My name is Sania";
        // System.out.println("Enter your name:");
        // Scanner sc= new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        // concatenation
        // String name="Sania";
        // String lastname="Atwal";
        // String fullname=name+" "+lastname;
        // System.out.println(fullname.length());

        // charAt
        // for(int i=0;i<fullname.length();i++){
        // System.out.print(fullname.charAt(i));
        // }

        // Campare .compareTo
        //String name1 = "Sania";
        //String name2 = "Sania";

        // if(name1.compareTo(name2)==0){
        // System.out.println("strings are equal");
        // }else{
        // System.out.println("strings are not equal");
        // }
        //if (name1 == name2) {
            //System.out.println("strings are equal");
        //} else {
            //System.out.println("strings are not equal");
        //}

        //subString
        //String name="My name is Sania";
        //String sub=name.substring(11);
        //System.out.print(sub);

        //parseInt      toString
        //int num=123;
        //String number=Integer.toString(num);
        //System.out.print(number);

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String [] array=new String[size];
         //input
         int tolength=0;
         for(int i=0;i<size;i++){
             array[i]=sc.next();
             tolength+=array[i].length();
         }
         System.out.print(tolength);
    }
}