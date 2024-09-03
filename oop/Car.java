public class Car {

    // instance variables
    String color;
    int seats;
    int doors;
    
    public static void main(String[] args){

        Car car1 = new Car();//creating object of Car class
        Car car2 = new Car();//creating object of Car class

        //setting values to the object
        car1.color = "red";
        car1.seats=2;
        car1.doors=2;

        car2.color="black";

        System.out.println("car1 colour is "+car1.color+". It has "+car1.seats+" seats and "+car1.doors+" doors.");

    }

}