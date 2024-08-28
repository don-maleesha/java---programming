public class Student extends Person {

    private String studentId; // Declare the studentId variable

    public static void main(String[] args) {
        // You don't need to redeclare studentId here, it's already declared as a class variable.
    }   

    // Constructor for the Student class
    public Student(String nameIn, String addressIn, String phoneNumberIn, String studentIdIn) {
        // Call the constructor of the superclass (Person) to set name, address, and phone number
        super(nameIn, addressIn, phoneNumberIn);
        // Set the studentId for the Student class
        this.studentId = studentIdIn;
    }

    // Method to print the address by calling the superclass method
    public void printAddress() {
        /*
        The following line prints the address by calling the getAddress() method from the superclass (the class that this class extends).
        The 'super' keyword is used to refer to the superclass's version of the method.
        */
        System.out.println(super.getAddress());
    }

    @Override
    public void introduce() {
        // Fixed typo and improved sentence structure
        System.out.println("Hello my name is " + getName());
    }
}
