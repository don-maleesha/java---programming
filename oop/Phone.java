public class Phone {

    String brand;
    String model;
    int year;
    double price;

    public Phone(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    //method overriding
    public void call(){

        System.out.println("Whatsapp call from " + brand + " " + model);
    }
}
