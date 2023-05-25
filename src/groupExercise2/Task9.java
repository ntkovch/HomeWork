package groupExercise2;

public class Task9 {
    /*
    Create Registration Class in which you would have variables as
    email, userName and password that have an access scope only
    within its own class. After creating an object of the class user should
    be able to call methods and in each method separately pass values
    to set users email, username and password.
    Requirements:
    A. Valid email consider to be only yahoo
    B. Valid userName and password cannot be empty and should be of
    length larger than 6 characters. Also valid password cannot contain
    userName.
     */
    public static void main(String[] args) {
        Registration a=new Registration();
        a.setEmail("ntk@yahoo.com");
        a.setUserName("trenty");
        a.setPassword("trenty");
    }
}
class Registration {
   private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if(email.contains("yahoo")){
            System.out.println("Your email is verified");
            this.email=email;
        }else{
            System.out.println("Please enter email address of yahoo.com");
        }
    }
    public void setUserName (String userName) {
        if(userName.isEmpty()){
            System.out.println("Username field is empty");
        }else if(userName.length()<6){
            System.out.println("Please enter a username longer than 6 characters");
        }else{
            System.out.println("Your username is verified");
            this.userName=userName;
        }
    }
    public void setPassword (String password) {

        if(password.isEmpty()){
            System.out.println("Password field is empty");
        } else if (password.length()<6) {
            System.out.println("Please enter a password longer than 6 characters");
        } else if (password.equals(userName)) {
            System.out.println("Please enter password different from your username");
        } else{
            System.out.println("Your password is verified");
            this.password=password;
        }
    }
}
