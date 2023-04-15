package groupExercise;

public class HW8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
         */

        int [] numbers={12, 0, 54, -10, 99, -3, 15, 87,-22, 4, 71};

        int minNumber=numbers[0];
        int maxNumber=numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<minNumber){
                minNumber=numbers[i];
            }if(numbers[i]>maxNumber){
                maxNumber=numbers[i];
            }
        }
        System.out.println("Maximum number in the array is "+maxNumber);
        System.out.println("Minimum number in the array is "+minNumber);
    }
}
