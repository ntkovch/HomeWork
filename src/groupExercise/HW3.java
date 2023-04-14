package groupExercise;

public class HW3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store
        odd and even numbers. Develop a program which will
        identify/print the even numbers only.
         */

        int [][] numbers={
                {10, 15, 94, 61},
                {11, 28, -9, 74},
                {37, 86, 44, -18}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
    }
}
