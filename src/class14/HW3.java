package class14;

public class HW3 {
    /*
    Write a method to return whether given number is prime or not?
     */
    boolean isPrime(int number){
        boolean isPr=true;
        if(number<2){
            isPr=false;
        }

        for (int i = 2; i < number; i++) {
            if(number%i==0){
                isPr=false;
                break;
            }
        }
        return  isPr;
    }

    public static void main(String[] args) {
        HW3 obj=new HW3();
        System.out.println(obj.isPrime(88));
    }
}
