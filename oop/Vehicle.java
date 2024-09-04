abstract public class Vehicle {
    
    int wheels;
    int seats;
    String registrationNumber;

    public Vehicle(int wheels, int seats, String registrationNumber){
        this.wheels = wheels;
        this.seats = seats;
        this.registrationNumber = registrationNumber;

    }

    abstract void park();

    abstract void drive();

}
