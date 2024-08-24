public class Person {

    
        protected String name;
        private String address;
        private String phoneNumber;

    public Person(String nameIn, String addressIn, String phoneNumberIn) {

        this.name = nameIn;
        this.address= addressIn;
        this.phoneNumber = phoneNumberIn;
    }

   public void introduce() {
    System.out.println("Hello, my name is " + name);

   }

   public String getAddress() {
         return this.address;
   }

   public void setAddress(String address) {

        this.address = address;

    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

}