import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        String servername="jdbc:mysql://localhost:3306/intellij";
        String username="root";
        String password="";

        //Connection connectionString = DriverManager.getConnection(connectionString,username,password);
        try {
            Connection connection = DriverManager.getConnection(servername, username, password);
            String sqlStatement = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlStatement);

            while(resultSet.next()){
                System.out.println("Student Id: "+resultSet.getString("student_id"));
                System.out.println("Student Name: "+resultSet.getString("name"));
                System.out.println("Address: "+resultSet.getString("address"));
                System.out.println("Contact number: " +resultSet.getInt("contact_number"));
                System.out.println();
            }

            System.out.println("Inserting a new record into the databases");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student id: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student address: ");
            String address = scanner.nextLine();
            System.out.print("Enter student contact number: ");
            int contact_number = scanner.nextInt();

            String insertQuerry = "INSERT INTO student(student_id, name, address, contact_number) VALUES (?,?,?,?) ";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuerry);
            preparedStatement.setString(1,studentId);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            preparedStatement.setInt(4,contact_number);
            preparedStatement.executeUpdate();

        } catch(Exception e) {
            System.out.println("Error occured");
        }

        }
    }
