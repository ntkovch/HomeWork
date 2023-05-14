package class21;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        Define common behavior within and some fields in parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    String model;
    String color;
    int amountRAM;
    double weight;

    public Computer(String model, String color, int amountRAM, double weight) {
        this.model = model;
        this.color = color;
        this.amountRAM = amountRAM;
        this.weight = weight;
    }

    void start(){
        System.out.println("Computer is starting");
    }
    void reboot(){
        System.out.println("Computer reboots");
    }
    void stop(){
        System.out.println("Computer stops");
    }
}
class Apple extends Computer{


    public Apple(String model, String color, int amountRAM, double weight) {
        super(model, color, amountRAM, weight);
    }
    void start(){
        System.out.println("Computer Apple "+model+" is starting");
    }
    void reboot(){
        System.out.println("Computer Apple "+model+" "+weight+" reboots");
    }
    void update(){
        System.out.println("Computer Apple "+model+" "+color+" is being updated");
    }
    void stop(){
        System.out.println("Computer Apple "+model+" "+amountRAM+" stops");
    }
}
class Lenovo extends Computer{
    public Lenovo(String model, String color, int amountRAM, double weight) {
        super(model, color, amountRAM, weight);
    }
    void start(){
        System.out.println("Computer Lenovo "+model+" is starting");
    }
    void reboot(){
        System.out.println("Computer Lenovo "+model+" "+weight+" reboots");
    }

    void stop(){
        System.out.println("Computer Lenovo "+model+" "+color+" "+amountRAM+" stops");
    }
}
class HP extends Computer{
    public HP(String model, String color, int amountRAM, double weight) {
        super(model, color, amountRAM, weight);
    }
    void start(){
        System.out.println("Computer HP "+model+" is starting");
    }
    void reboot(){
        System.out.println("Computer HP "+model+" "+weight+" reboots");
    }
    void stop(){
        System.out.println("Computer HP "+model+" "+color+amountRAM+" stops");
    }
    void work(){
        System.out.println("Computer HP "+model+" "+color+" "+amountRAM+" does not work");
    }
}
class Dell extends Computer{
    public Dell(String model, String color, int amountRAM, double weight) {
        super(model, color, amountRAM, weight);
    }
    void start(){
        System.out.println("Computer Dell "+model+" is starting");
    }
    void reboot(){
        System.out.println("Computer Dell "+model+" "+weight+" reboots");
    }
    void stop(){
        System.out.println("Computer Dell "+model+" "+color+" "+amountRAM+" stops");
    }
}
class ComputerTest{
    public static void main(String[] args) {
        Computer [] comp={
                new Apple("Air 2020","Black", 8,1.29),
                new Lenovo("IdeaPad","White",8,2.25),
                new HP("15","Black",16,1.65),
                new Dell("Latitude","Silver",8,1.79)
        };
        for (int i = 0; i < comp.length; i++) {
            if(comp[i] instanceof Apple){
                ((Apple) comp[i]).update();
            } else if (comp[i] instanceof HP) {
                ((HP) comp[i]).work();
            }
            comp[i].start();
            comp[i].reboot();
            comp[i].stop();
            System.out.println("--------------------------------------------------");
        }
    }
}
