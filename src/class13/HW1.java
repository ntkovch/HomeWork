package class13;

public class HW1 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

        String sentence="This is sentence i want to reverse";
        String [] senArr=sentence.split("[ ]");
        for (int j = 0; j < senArr.length; j++) {
            for (int i = senArr[j].length()-1; i >=0 ; i--) {
                System.out.print(senArr[j].charAt(i)+"");
            }
            System.out.print(" ");
        }
    }
}
