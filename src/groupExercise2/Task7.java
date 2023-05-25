package groupExercise2;

public class Task7 {
    /*
    We have to calculate the average of marks obtained in three subjects
    by student A and by student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning the average percentage
    of marks. Provide implementation of abstract method in classes 'A'
    and 'B'. The constructor of student A takes the marks in three
    subjects as its parameters and the marks in four subjects as its
    parameters for student B. Test your code
     */
    public static void main(String[] args) {
        A a=new A(80,30,90);
        B b=new B(90,78,86,89);
        System.out.println("The average of marks of student A : "+a.getPercentage());
        System.out.println("The average of marks of student B : "+b.getPercentage());
    }

}
abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    int mathMark,engMark,artMark;
    A(int mathMark, int engMark, int artMark){
        this.mathMark=mathMark;
        this.engMark=engMark;
        this.artMark=artMark;
    }

    @Override
    double getPercentage() {
        return (mathMark+engMark+artMark)/3;
    }
}
class B extends Marks {
    int mathMark,engMark,artMark,hisMark;
    B(int mathMark, int engMark, int artMark, int histMark){
        this.mathMark=mathMark;
        this.engMark=engMark;
        this.artMark=artMark;
        this.hisMark=histMark;
    }
    @Override
    double getPercentage() {
        return (mathMark+engMark+artMark+hisMark)/4;
    }
}
