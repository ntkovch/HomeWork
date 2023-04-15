package groupExercise;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given
        number is prime or not?
         */
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter a number");
        int number= scan.nextInt();
        int calc =0;
        for (int i = 1; i <=number; i++) {
        if(number%i==0){
            calc++;
        }
        }
        if(calc>2||number<=1){
            System.out.println("A given number is not prime");
        }else if (calc<=2&&number>1){
            System.out.println("A given number is prime");
        }

        }


    }
