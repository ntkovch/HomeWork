package class28;

public class CheckUserName {
    /*
       Create a method checkUserName that will throw a runtime exception.
       Method should throw an exception when entered username is less than 5 characters.
        */
    public static void checkUserName (String name) {
        if (name.length() < 5) {
            throw new RuntimeException("Entered username is less than 5 characters");
        } else {
            System.out.println("Entered username is "+name);
        }
    }
    public static void main(String[] args) {
        try{
            checkUserName("Jony");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }



    }
}
