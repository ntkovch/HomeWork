package class19;

public class Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
     then the message "I love programming languages" should be printed. If some String is passed to it,
      then in place of "programming languages" the value variable should be printed. Example,
      if we pass "Java", then "I love Java" should be printed.
     */
 void print(){
     System.out.println("I love programming languages");
 }
    void print(String str){
        System.out.println("I love "+str);
    }
}
class ProgrammingTest{
    public static void main(String[] args) {
        Programming pro=new Programming();
        pro.print();
        pro.print("Java");
    }
}
