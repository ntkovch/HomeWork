package class12;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter mom's first name");
        String momName=scanner.next();
        System.out.println("Please enter dad's first name");
        String dadName=scanner.next();
        System.out.println("Please enter boy or girl");
        String gender=scanner.next();


        if(gender.equals("boy")){
            System.out.println("Suggested baby name: "+dadName.substring(0,3).toUpperCase()+momName.substring(momName.length()-2).toUpperCase());
        } else if (gender.equals("girl")) {
            System.out.println("Suggested baby name: "+momName.substring(0,2).toUpperCase()+dadName.substring(dadName.length()-3).toUpperCase());
        }
    }
}
