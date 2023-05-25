package groupExercise2;

public class Task5 {
    /*
    Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.
     */
    public static void main(String[] args) {
        String given="abracadabra";
        boolean isNonRep=true;
        for (int i = 0; i < given.length(); i++) {
            if(given.indexOf(given.charAt(i))==given.lastIndexOf(given.charAt(i))){
                System.out.println("The first non-repeating character is "+given.charAt(i));
                isNonRep=false;
                break;
            }
        }
        if(isNonRep){
            System.out.println("There is not non-repeating character");
        }
        }

    }



