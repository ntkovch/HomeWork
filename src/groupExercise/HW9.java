package groupExercise;

public class HW9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest
        number in the array?
         */
        int[] numbers = {2, 59, 12, -2, 17, 22, 74, 36, 48};
        int larg = numbers[0];
        int secLarg = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > larg) {
                secLarg=larg;
                larg = numbers[i];
            }else if (numbers[i] > secLarg) {
                secLarg = numbers[i];
            }

        }
        System.out.println("The second largest number in the array is "+secLarg);
    }
}
