package class17;

public class FourConstructors {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
    private FourConstructors(){
        System.out.println("private constructor"); // work only inside same class
    }
    public FourConstructors(String name){
        System.out.println("public constructor"); // work everywhere
    }
    FourConstructors(int age){
        System.out.println("default constructor"); // work inside same class and different class inside same package
    }
    protected FourConstructors(boolean isTrue){
        System.out.println("protected constructor"); // work inside same class and different class inside same package
    }

    public static void main(String[] args) {
        FourConstructors obj1=new FourConstructors();
        FourConstructors obj2=new FourConstructors("Nelly");
        FourConstructors obj3=new FourConstructors(34);
        FourConstructors obj4=new FourConstructors(true);
    }
}
