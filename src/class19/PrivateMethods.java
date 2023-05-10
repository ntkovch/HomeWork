package class19;

public class PrivateMethods {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void print(){
        System.out.println("This is printing method");
    }
    private void print(String str){
        System.out.println("This is "+str+" method");
    }
    private void print(String str, int num){
        System.out.println("This is "+str+" method with number "+num);
    }

    public static void main(String[] args) {
        PrivateMethods obj=new PrivateMethods();
        obj.print();
        obj.print("Java");
        obj.print("Java", 147);
    }
}


