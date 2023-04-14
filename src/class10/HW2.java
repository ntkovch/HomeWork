package class10;

import javax.sound.midi.Soundbank;

public class HW2 {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops
         */
        String [][] cars={
                {"Chevrolet", "Tesla", "Jeep"},
                {"Audi", "BMW", "Volkswagen"},
                {"Hyundai", "Kia", "SsangYong"},
                {"Maserati", "Fiat", "Ferrari"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        int i=0;
        while (i< cars.length){
            int j=0;
            while (j<cars[i].length){
                System.out.print(cars[i][j]+" ");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
