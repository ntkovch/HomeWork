package class16;

public class HW1 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String reverseStr(String s){
        String rev="";
        for (int i = s.length()-1; i >=0 ; i--) {
            rev+=s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(HW1.reverseStr("Syntax"));
    }
}
