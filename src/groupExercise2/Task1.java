package groupExercise2;

public class Task1 {
    /*
    Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".
     */

    public static void main(String[] args) {
        String str="Hello Java";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        StringBuilder string=new StringBuilder("Hello Java");
        System.out.println(string.reverse());

    }
}
