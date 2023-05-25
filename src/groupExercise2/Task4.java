package groupExercise2;

import java.util.Arrays;

public class Task4 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String str1="Listen";
        String str2="silent";
        boolean isAnagrame=false;
        char [] a=str1.toLowerCase().toCharArray();
        Arrays.sort(a);
        char [] b=str2.toLowerCase().toCharArray();
        Arrays.sort(b);
       if(a.length==b.length){
           for (int i = 0; i < a.length; i++) {
               if(a[i]==b[i]){
                   isAnagrame=true;
               } else {
                   isAnagrame=false;
                   break;
               }
           }
       }
        if(isAnagrame){
            System.out.println("These words are anagrams");
        }else{
            System.out.println("These words are not anagrams");
        }
    }
}
