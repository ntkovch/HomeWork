package groupExercise2;

public class Task8 {
    /*
    Create a Class Car that would have the following fields: carPrice and
    color and method calculateSalePrice() which should be returning a
    price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has a field
    as weight and has its own implementation of calculateSalePrice()
    method in which returned price is calculated as following: if
    weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does it is own
    implementation of calculateSalePrice(): if length of sedan is >20 feet
    then returned car price should include 5% discount, otherwise 10%
    discount
     */
    public static void main(String[] args) {
        Sedan a=new Sedan(8000,"White",18);
        System.out.println("This Sedan color "+ a.color+" and price is "+a.calculateSalePrice());
        Truck b=new Truck(12000,"Black",2800);
        System.out.println("This Truck color "+ b.color+" and price is "+b.calculateSalePrice());
    }
}

class Car {
    double carPrice;
    String color;
    Car (double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    public double calculateSalePrice(){return carPrice;}
}
class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice - (carPrice * 0.05);
        }else{
            return carPrice - (carPrice * 0.1);
        }
    }
}
class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * 0.1);
        } else {
            return carPrice - (carPrice * 0.2);
        }
    }
}