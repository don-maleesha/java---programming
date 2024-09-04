public class EmployeeDetails {
    
    int empId;
    String empName;
    String designation;
    int age;
    int contact;
    float salary;

    // Constructor with default salary
    public EmployeeDetails(int empId, String empName, String designation, int age, int contact) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.age = age;
        this.contact = contact;
        this.salary = 40000.0f;
    }

    // Constructor with specified salary
    public EmployeeDetails(int empId, String empName, String designation, int age, int contact, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.age = age;
        this.contact = contact;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        
        EmployeeDetails emp1 = new EmployeeDetails(1, "John Doe", "Manager", 30, 1234567890);
        emp1.display();

        EmployeeDetails emp2 = new EmployeeDetails(2, "Jane Doe", "Assistant Manager", 25, 1234567891, 30000.0f);
        emp2.display();
    }
}