package class18;

public class PianoTeacher extends Teacher{
    String name="Sandy";
    void music() {
        System.out.println(name + " performs at concerts");

    }

    public static void main(String[] args) {
        PianoTeacher name3=new PianoTeacher();
        name3.name="Tommy";
        name3.experYears=10;

        name3.music();
    }
}
