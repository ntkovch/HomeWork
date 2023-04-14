package groupExercise;

public class HW5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a
        temporary variable?
         */
        int num1=50;
        int num2=10;

        System.out.println("Before swapping num1 = "+num1);
        System.out.println("Before swapping num2 = "+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println();
        System.out.println("After swapping num1 = "+num1);
        System.out.println("After swapping num2 = "+num2);


    }
}
