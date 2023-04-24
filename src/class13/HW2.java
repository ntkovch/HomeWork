package class13;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word to check if it is polindrom");
        String word=scan.next();
        word=word.toLowerCase();
        boolean palindrome=true;
        String word1="";
        for (int i = word.length()-1; i >=0 ; i--) {
            word1=word1+word.charAt(i);
        }
        if (word.equals(word1)){
            System.out.println(palindrome);
        }else {System.out.println(!palindrome);}
        }
    }
