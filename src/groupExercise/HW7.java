package groupExercise;

public class HW7 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of
        Fibonacci series.
         */
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+", "+n2+", ");

        for (int i = 0; i < 8; i++) {
            n3=n1+n2;
            System.out.print(n3+", ");
            n1=n2;
            n2=n3;


        }

        }

    }

