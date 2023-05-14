package class20;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
    double balance;
    double interest;

    void interest(int bal) {
        balance=bal;
        if (balance > 2000) {
            interest = 2;
        } else {
            interest = 3;
        }
        System.out.println("Your interest is " + interest);
    }
}
    class Visa extends CreditCard{}
    class AX extends CreditCard{
         @Override
        void interest(int bal){
             balance=bal;
            if(balance>2000){
                interest=5;
            }else{
                interest=10;
            }
             System.out.println("Your interest in AX is "+interest);
        }
    }
    class CreditCardTest {
        public static void main(String[] args) {
            CreditCard obj1=new CreditCard();
            obj1.interest(8000);
            Visa obj2=new Visa();
            obj2.interest(1000);
            AX obj3=new AX();
            obj3.interest(1500);
        }
    }


