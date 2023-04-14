package groupExercise;

public class HW4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
         */

        int [][] numbers={
                {54,11,83,-8,43,14},
                {12,62,-3,26,19,-75},
                {0,124,-55,33,18,88}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven+=numbers[i][j];
                }else{
                    sumOdd+=numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+sumEven);
        System.out.println("The sum of odd numbers is "+sumOdd);

    }
}
