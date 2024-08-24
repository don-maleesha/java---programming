

public class Main {

    public static void main(String[] args) {
        
        Teacher sam = new Teacher("Sam Perera", "Colombo", "011234567", "SomeSubject"); // creating an object of the Teacher class with the required arguments
        sam.name = "Sam Perera"; // accessing the public variable
        sam.setAddress("Colombo"); // setters: set the value of the private variable
        sam.setPhoneNumber("011234567");

        sam.introduce();

        Student john = new Student("John Cena", "Kndy", "123456789", "SomeCourse"); // creating an object of the Student class with the required arguments
        john.name = "John Cena"; // accessing the public variable
        john.introduce();// calling the introduce method

        System.out.println(sam.getAddress()); //getters: get the value of the private variable



    }
}