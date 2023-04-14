package class10;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */
        int [][] numbers={
                {74, -12, 3, 10},
                {-22, 45, 21, -100},
                {17, 37, -24, 15},
        };
        for (int[] num : numbers) {
            for (int i : num) {
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
