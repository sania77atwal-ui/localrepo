import java.util.Scanner;

class Strings2{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the string:");
        String name=sc.next();
        System.out.println(name);

        String result="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='e'){
                result=result + 'i';
            }else{
                result=result+name.charAt(i);
            }
        }
        System.out.print(result);
    }
}