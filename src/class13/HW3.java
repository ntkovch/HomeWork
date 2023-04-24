package class13;

public class HW3 {
    public static void main(String[] args) {
        /*
        How would you swap  2 strings without a temporary variable?
         */

        String name1="Jon";
        String name2="Tonny";
        System.out.println("before swapping name1="+name1);
        System.out.println("before swapping name2="+name2);

       name1=name1.concat(name2);
       name2=name1.substring(0,name1.length()-name2.length());
       name1=name1.substring(name2.length());
        System.out.println("----------------------------------");
        System.out.println("after swapping name1="+name1);
        System.out.println("after swapping name2="+name2);

    }
}
