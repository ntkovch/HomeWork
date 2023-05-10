package class19;

public class StatMethods {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    static void print(){
        System.out.println("This is printing method");
    }
    static void print(String str){
        System.out.println("This is "+str+" method");
    }
    static void print(String str, int num){
        System.out.println("This is "+str+" method with number "+num);
    }
}
class StatMethodsTest{
    public static void main(String[] args) {
        StatMethods.print();
        StatMethods.print("Java");
        StatMethods.print("Java", 897);

    }
}
