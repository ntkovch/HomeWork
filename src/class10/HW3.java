package class10;

public class HW3 {
    public static void main(String[] args) {
        /*
        Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
         */
        String [][] grocery={
                {"potato", "onion", "broccoli "},
                {"apples", "oranges", "bananas"},
                {"cheese", "butter", "milk"},
                {"cookies", "candies", "cakes"}
        };

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        for (String[] rows : grocery) {
            for (String cols : rows) {
                System.out.print(cols+" ");

            }

        }

    }
}
