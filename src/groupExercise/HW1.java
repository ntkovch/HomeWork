package groupExercise;

public class HW1 {
    public static void main(String[] args) {
        /*
         Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.
         */

        int [] weekTem={0, -3, 15, 2, -8, 18, 25};
        int highTem=weekTem[0];
        int lowTem=weekTem[1];

        for (int i = 0; i < weekTem.length; i++) {
            if(weekTem[i]>highTem){
                highTem=weekTem[i];

            }if(weekTem[i]<lowTem){
                lowTem=weekTem[i];
            }
        }
        System.out.println("The highest temperature for the week is "+highTem+"°C");
        System.out.println("The lowest temperature for the week is "+lowTem+"°C");
    }
}
