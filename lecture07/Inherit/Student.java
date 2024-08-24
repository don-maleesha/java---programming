public class Student extends Person {

    public static void main(String[] args) {
        
        String studentId;
    }   

    public void changeValues() {

        phoneNumber = "0712345678";
        name = "Samam";
        // address = "Kandy";  this will give an error because address is a private variable

        super.setAddress("Kandy"); // super: refers to the parent class

        
    }
}