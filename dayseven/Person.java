public class Person {
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        person1.displayDetails();
        person2.displayDetails();
    }
}
