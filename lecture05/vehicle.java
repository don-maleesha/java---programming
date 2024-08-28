class vehicle{
    private String model;
    public String name;
    public int num;
    public void set(String model){
        this.model=model;
    }
    public void drive(String road){
        System.out.println(road + " is driving");


    }
    public int add(int a, int b){
        return a+b;
    }
    public static int sub(int c, int d){
       return c-d;
    }
}