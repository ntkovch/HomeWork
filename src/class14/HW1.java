package class14;

import java.util.Scanner;

public class HW1 {
    /*
    Create a method that will say Hello in different
    language based on the country that will passed when method is executed.
     */

    void hello(String country){
        switch (country.toLowerCase()){
            case "ukraine":
                System.out.println("Привіт");
                break;
            case "spain":
                System.out.println("Hola");
                break;
            case "germany":
                System.out.println("Hallo");
                break;
            case "poland":
                System.out.println("Cześć");
                break;
            case "england":
                System.out.println("Hello");
                break;
            case "usa":
                System.out.println("Hello");
                break;
            case "china":
                System.out.println("你好");
                break;
            default:
                System.out.println("Unavailable country");
                break;
        }
    }

    public static void main(String[] args) {
        HW1 obj=new HW1();
        Scanner scan=new Scanner(System.in);
        System.out.println("In___");
        String country= scan.next();
        obj.hello(country);
    }
}
