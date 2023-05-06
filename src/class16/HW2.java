package class16;

public class HW2 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name
     */
    private static String vowelsStr(String s){
            s=s.replaceAll("[^aeiouy]","");
       return s;
    }
    public static void main(String[] args) {
        System.out.println(HW2.vowelsStr("I practice Java"));
    }
}
