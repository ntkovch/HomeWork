package class18;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
     */
    String name;
    int age;
    int experYears;
    String university;

    void ownEdmat() {
        System.out.println(name + " has his own education materials");
    }

    void age(int age) {
        if (age > 25) {
            System.out.println(name + " is an experienced teacher");
        } else {
            System.out.println(name + " needs more practical hours");
        }
    }
    void add() {
        System.out.println(name + " conducts additional lessons");
    }
}


