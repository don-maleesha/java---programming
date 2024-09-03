// Purpose: This file contains the Toyota class which is used to create Toyota objects.
public class Toyota {

    // instance variables
    String model;
    int year;
    double price;

    // constructor

    /*
    Object Initialization: Constructors allow us to set the initial state of an object by assigning values to its instance variables.
    In the example, the constructor sets the model, year, and price of the Toyota object.

    Encapsulation: Constructors can enforce encapsulation by ensuring that the object is properly initialized before it is used.
    This helps in maintaining the integrity and consistency of the object's state.

    Overloading: Constructors can be overloaded, which means we can have multiple constructors with different parameter lists.
    This allows us to create objects with different initializations based on the arguments passed to the constructor. 
    For example, we could have another constructor that takes only the model and year parameters, and sets the price to a default value.

    Here's an example of how the Toyota constructor can be used:

    Toyota car1 = new Toyota("Camry", 2022, 25000.0);
    Toyota car2 = new Toyota("Corolla", 2021, 20000.0); 
     */

    public Toyota(String model, int year, double price){
        this.model = model; // this keyword is used to refer to the current object instance
        this.year = year;
        this.price = price;
    }

    // methods
    public void drive(){
        System.out.println("Driving the " + model);
    }

    // Method Overloading: Method overloading allows us to define multiple methods with the same name but different parameter lists.
    public void sell(){
        System.out.println("Toyota " + model + " has sold for $ " + price);
    }

    // Method Overloading: Method overloading allows us to define multiple methods with the same name but different parameter lists.
    public void sell(String country){
        System.out.println("Toyota " + model + " has sold in " + country + " for $ " + price);
    }

}

