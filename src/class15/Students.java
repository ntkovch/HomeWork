package class15;

public class Students {
    /*
        Create a Class called Students
        Create three  variables  Name , ID  and  numberOfStudents
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students
     */
    String name;
    String ID;
    static int numOfStudents;

    public static void main(String[] args) {
        Students obj1=new Students();
        obj1.ID="457JJ";
        obj1.name="Nataliia";
        Students.numOfStudents++;

        Students obj2=new Students();
        obj2.ID="784GD";
        obj2.name="Jony";
        Students.numOfStudents++;

        Students obj3=new Students();
        obj3.ID="152FE";
        obj3.name="Tonny";
        Students.numOfStudents++;

        System.out.println(Students.numOfStudents);
    }

}
