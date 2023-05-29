package class26;

import java.util.ArrayList;

public class Sum {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(87);
        arr.add(19);
        arr.add(27);
        arr.add(94);
        arr.add(55);
        arr.add(19);
        int sum=0;
        for (Integer i : arr) {
            sum+=i;
        }
        System.out.println("Sum of all integers is "+sum);
    }
}
