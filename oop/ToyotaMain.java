public class ToyotaMain {

    public static void main(String[] args){

        // Creating Toyota objects
        Toyota car1 = new Toyota("corolla", 2020, 25000);
        Toyota car2 = new Toyota("camry", 2021, 30000);

        System.out.println("Car 1: " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.model + " " + car2.year);

        // Calling methods on Toyota objects
        car1.drive();
        car2.drive();

        // Method Overloading
        car1.sell();
        car2.sell();

        // Method Overloading
        car1.sell("Sri Lanka");
    }
}
    




