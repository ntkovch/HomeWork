package groupExercise2;

public class Task3 {
    /*
    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
     */
    public static void main(String[] args) {
        String sent="Hello, world!";
        int number=0;
        String[] sen=sent.split("[,.!?]");
        for (int i = 0; i <sen.length ; i++) {
            number++;
        }
        System.out.println(number);
    }
}
