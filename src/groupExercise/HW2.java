package groupExercise;

public class HW2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is
        created, calculate the sum of all stored elements in
        that array.
         */

        int [] numbers={2, 15, 33, 86, 21, 19, 74, 5};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println("The sum of all elements is "+sum);
    }
}
