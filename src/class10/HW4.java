package class10;

public class HW4 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
         */
        int [][] numbers={
                {10, 35, 87},
                {-5, 22, 41},
                {19, 58, -24},
        };
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
