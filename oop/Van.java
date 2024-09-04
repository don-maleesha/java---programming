public class Van extends Vehicle{
    
    public Van(){
        super(4, 5, "KA 01 1234");
    }

    @Override
    void park(){
        System.out.println("Van is parked");
    }

    @Override
    void drive(){
        System.out.println("Van is being driven");
    }
}