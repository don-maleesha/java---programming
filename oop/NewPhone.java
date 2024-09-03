public class NewPhone extends OldPhone{

    public NewPhone(String brand, String model, int year, double price){
        super(brand, model, year, price);
    }

    //method overriding

    public void call(){
        System.out.println("Calling from " + brand + " " + model + " with 5G");
    }
    
    public void videoCall(){
        System.out.println("Video calling from " + brand + " " + model + " with 5G");
    }

    public void useMaps(){
        System.out.println("Using maps from " + brand + " " + model + " with 5G");
    }


}