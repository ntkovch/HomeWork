package groupExercise2.Task6;

public class Task6 {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea
    and calculatePerimiter. Create 2 classes Circle & Square that
    implements functionality defined in the Shape Interface. Test your
    code.
     */
    public static void main(String[] args) {
        Circle a=new Circle();
        a.calculateArea(2);
        a.calculatePerimiter(2);
        Square b=new Square();
        b.calculateArea(4);
        b.calculatePerimiter(4);
    }

}
class Circle implements Shape {
    private final double PI=3.1415926;
    public void calculateArea(double a){
        System.out.println("Area of a circle is "+a*a*PI);
    }
    @Override
    public void calculatePerimiter(double b) {
        System.out.println("Perimiter of a circle is "+2*b*PI);
    }

}
class Square implements Shape {
    public void calculateArea(double a){
        System.out.println("Area of a square is "+a*a);
    }
    public void calculatePerimiter(double b){
        System.out.println("Perimiter of a square is "+4*b);
    }
}
