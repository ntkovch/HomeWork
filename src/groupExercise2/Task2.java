package groupExercise2;

public class Task2 {
    /*
    Check if a String is Palindrome: Determine whether a given string is
     a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome
     */

    public static void isPalindrome(String str1){
        str1=str1.toLowerCase();
        StringBuilder str=new StringBuilder(str1);
        String str2=str.reverse().toString().toLowerCase();
        if(str1.equals(str2)){
            System.out.println("This word is a Polindrome");
        }else{
            System.out.println("This word is not a Polindrome");
        }

    }
    public static void main(String[] args) {
        /*String str1="Madam";
        str1=str1.toLowerCase();
        StringBuilder str=new StringBuilder("madam");
        String str2=str.reverse().toString().toLowerCase();
        if(str1.equals(str2)){
            System.out.println("This word is a Polindrome");
        }else{
            System.out.println("This word is not a Polindrome");
        }*/
        Task2.isPalindrome("Madam");
        Task2.isPalindrome("PortROp");
        Task2.isPalindrome("Javak");

    }


}
