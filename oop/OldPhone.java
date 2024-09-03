public class OldPhone {
    
    String brand;
    String model;
    int year;
    double price;

    public OldPhone(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void call(){
        System.out.println("Calling from " + brand + " " + model);
    }

}
