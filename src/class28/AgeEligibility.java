package class28;

public class AgeEligibility {
         /*
        Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
        */
    public static void ageElig (int age){
        if (age<16){
            throw new RuntimeException("Age is less than 16");
        }else {
            System.out.println("Person is eligible");
        }
    }
    public static void main(String[] args) {
        try{
            ageElig(22);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
}
