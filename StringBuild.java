public class StringBuild {
    public static void main(String[] args) {
        StringBuilder name= new StringBuilder("Aman");
        System.out.println(name);
        //  System.out.println(name.charAt(0));

          //setchar
          //name.setCharAt(0 ,'T' );
          //System.out.println(name);

          ////insert    
          //name.insert(2, 'n');
          //System.out.println(name);

          ////delete   ending is non inclusive
          //name.delete(2, 3);
          //System.out.println(name);

          //append
           //name.append('o');
           //name.append('n');
           //name.append('y');
           //System.out.println(name.length());

        //reverse
        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-1-i;

            char frontchar=name.charAt(front);
            char backchar=name.charAt(back);

            name.setCharAt(front, backchar);
            name.setCharAt(back, frontchar);
        }
        System.out.print(name);
    }
}
