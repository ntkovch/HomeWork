package class17;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
    students with different marks. Your program should print an average mark of each students name.
     */
    String name;
    int gradeMath;
    int gradeEng;
    int gradeHist;
    Students(String name, int gradeMath, int gradeEng, int gradeHist){
        this.name=name;
        this.gradeMath=gradeMath;
        this.gradeEng=gradeEng;
        this.gradeHist=gradeHist;
        }
    int calcGrade(){
        int avarageGrade=(gradeMath+gradeEng+gradeHist)/3;
        return avarageGrade;
    }


}
