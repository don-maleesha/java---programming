public class Bus extends Vehicle{
    
    public Bus(){
        super(6, 40, "KA 01 1234");
    }

    @Override
    void park(){
        System.out.println("Bus is parked");
    }

    @Override
    void drive(){
        System.out.println("Bus is being driven");
    }
    
}
