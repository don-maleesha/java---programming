public class Class {
    String make;
    String model;
    int year;

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        
        Class car = new Class();
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2015;
        car.display();
    }


}
