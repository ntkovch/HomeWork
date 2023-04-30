package class14;

public class HW2 {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail)
    → johnsnow@gmail.com
     */
    String createEmail(String firstName, String lastName, String emailType){
        String emailAddress=firstName+lastName+"@"+emailType+".com";
        return emailAddress.toLowerCase();
    }

    public static void main(String[] args) {
        HW2 obj=new HW2();
        String email=obj.createEmail("John", "Snow", "gmail");
        System.out.println(email);
    }
}
