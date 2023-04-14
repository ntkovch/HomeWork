package class10;

public class HW1 {
    public static void main(String[] args) {


    /*
    Create a 2D array(shorter way) in which first array will consist
    of 4 names and second array will contain grades.
    Then your program should print name of the students that has A and B grade
     */

        String [][] namesGrades={
                {"John", "Nancy", "Bob", "Alli"},
                {"A", "D", "A", "B"}
        };
        System.out.println(namesGrades[0][0]+" has "+namesGrades[1][0]+" grade");
        System.out.println(namesGrades[0][2]+" has "+namesGrades[1][2]+" grade");
        System.out.println(namesGrades[0][3]+" has "+namesGrades[1][3]+" grade");
    }
}
