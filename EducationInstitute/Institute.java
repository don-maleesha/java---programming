import java.util.ArrayList;
import java.util.Scanner;

public class Institute {

    public static Course addCourse(int courseCode) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter course name: ");
        String courseName = input.nextLine();

        Course course = new Course(courseName, courseCode);

        return course;
    }

    public static Student addStudent(int studentID) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String studentName = input.nextLine();

        Student student = new Student(studentName, studentID);

        return student;
    }

    public static Payment addPayment(int paymentID) {
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter amount: ");
        double amount = input.nextDouble();
    
        Payment payment = new Payment(paymentID, amount);

        return payment;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();

        Scanner input = new Scanner(System.in);
        int choice = 0;

        int courseCode = 1;
        int studentID = 1;
        int paymentID = 1;
        String studentName = "";

        Student student = new Student(studentName, studentID);

        while (choice !=7){
            System.out.println("1. Add course");
            System.out.println("2. Add student");
            System.out.println("3. Add payment");
            System.out.println("4. Display courses");
            System.out.println("5. Display students");
            System.out.println("6. Display payments");
            System.out.println("7. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    courseList.add(addCourse(courseCode));
                    courseCode++;
                    break;
                case 2:
                    studentList.add(addStudent(studentID));
                    studentID++;
                    break;
                case 3:
                    student.paymentList.add(addPayment(paymentID));
                    paymentID++;
                    break;
                case 4:
                    for (Course course : courseList) {
                        System.out.println("Course name: " + course.getCourseName());
                        System.out.println("Course code: " + course.getCourseCode());
                    }
                    break;
                case 5:  
                    for (Student stud : studentList) {
                        System.out.println("Student name: " + stud.getStudentName());
                        System.out.println("Student ID: " + stud.getStudentID());
                    }
                    break;
                case 6:
                    for (Payment pay : student.paymentList) {
                        System.out.println("Payment ID: " + pay.getPaymentId());
                        System.out.println("Amount: " + pay.getAmount());
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
