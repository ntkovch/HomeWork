package class17;

public class StudentTest {
    public static void main(String[] args) {
        Students name1=new Students("Sara", 80, 95,54);
        System.out.println(name1.name+" has average mark "+name1.calcGrade());

        Students name2=new Students("Tom", 87,90,88);
        System.out.println(name2.name+" has average mark "+name2.calcGrade());

        Students name3=new Students("Lizzy", 67,85,99);
        System.out.println(name3.name+" has average mark "+name3.calcGrade());

        Students name4=new Students("Naty", 89,98,99);
        System.out.println(name4.name+" has average mark "+name4.calcGrade());

        Students name5=new Students("Jonny", 58, 69, 75);
        System.out.println(name5.name+" has average mark "+name5.calcGrade());

    }
}
