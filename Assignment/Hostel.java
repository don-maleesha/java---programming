import java.util.ArrayList;
import java.util.Scanner;

public class Hostel {

    public static Tenant addTenant(int tenantID,  ArrayList<Room> roomList){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter tenant name: ");
        String name = input.nextLine();

        
        System.out.print("Enter room number: ");
        int roomNumber = input.nextInt();

        
        Tenant tenant = new Tenant(tenantID, name, roomNumber);
        return tenant;
    }

    public static Payment addPayment() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month: ");
        String month = input.nextLine();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        Payment payment = new Payment(month, amount);
        return payment;
    }

    public static void main(String[] args) {

        int i = 1;
        Scanner input = new Scanner(System.in);
        ArrayList<Room> roomList = new ArrayList<>();
        ArrayList<Tenant> tenantList = new ArrayList<>();

        for(int j=0 ; j<50 ; j++){
            Room r = new Room( i);
            roomList.add(r);
            i++;
        }

        int choice = 0;
        int tenantID = 1;

        while (choice != 10) {
            System.out.println("Hostel Management System");

            System.out.println("*************************");

            System.out.println("1. Add Tenant");
            System.out.println("2. Remove Tenant");
            System.out.println("3. List All Tenants");
            System.out.println("4. Check Room Availability");
            System.out.println("5. Record Monthly Payments");
            System.out.println("6. Display Payment History of a Tenant");
            System.out.println("7. Calculate Total Payment for a Room");
            System.out.println("8. Check Payment Status of a Tenant");
            System.out.println("9. Identify Tenants with Missing Payments");
            System.out.println("10. Exit");

            System.out.println("*************************");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter tenant details");
                    Tenant tenant = addTenant(tenantID, roomList);
                    tenantList.add(tenant);
                    tenantID++;
                break;   
                case 2:
                    System.out.println("Enter tenant ID to remove: ");
                    int tenantIDToRemove = input.nextInt();
                    input.nextLine();
                    boolean tenantRemoved = false;
                    for (int x = 0; x < tenantList.size(); x++) {
                        if (tenantList.get(x).getTenantID() == tenantIDToRemove) {
                            int roomNumberToVacate = tenantList.get(x).getRoomNumber();
                            tenantList.remove(x);
                            for (int j = 0; j < roomList.size(); j++) {
                                if (roomList.get(j).getRoomNumber() == roomNumberToVacate) {
                                    roomList.remove(j);
                                    break;
                                }
                            }
                            System.out.println("Tenant removed successfully");
                            tenantRemoved = true;
                            break;
                        }
                    }
                    if (!tenantRemoved) {
                        System.out.println("Tenant not found");
                    }
                    break;
                case 3:
                    for(int j = 0; j < tenantList.size(); j++){
                        System.out.println("Tenant ID: " + tenantList.get(j).getTenantID());
                        System.out.println("Tenant Name: " + tenantList.get(j).getName());
                       // System.out.println("Room Number: " + tenantList.get(j).getRoomNumber());
                    }
                    break;
                case 4:
                    System.out.println("Enter room number to check availability: ");
                    int roomNumber = input.nextInt();
                    boolean isRoomAvailable = true;
                    for (Room room : roomList) {
                        if (room.getRoomNumber() == roomNumber) {
                            isRoomAvailable = false;
                            break;
                        }
                    }
                    if (isRoomAvailable) {
                        System.out.println("Room is vacant");
                    } else {
                        System.out.println("Room is occupied");
                    }
                    break;
                case 5:
                    System.out.println("Enter tenant ID to record payment: ");
                    int tenantIDToRecordPayment = input.nextInt();
                    input.nextLine();
                    boolean paymentRecorded = false;
                    for (Tenant t : tenantList) {
                        if (t.getTenantID() == tenantIDToRecordPayment) {
                            Payment payment = addPayment();
                            t.addPayment(payment);
                            System.out.println("Payment recorded successfully");
                            paymentRecorded = true;
                            break;
                        }
                    }
                    if (!paymentRecorded) {
                        System.out.println("Tenant not found");
                    }
                    break;
                case 6:
                    System.out.println("Enter tenant ID to display payment history: ");
                    int tenantIDToDisplayPaymentHistory = input.nextInt();
                    input.nextLine();
                    boolean tenantFoundForHistory = false;
                    for (Tenant t : tenantList) {
                        if (t.getTenantID() == tenantIDToDisplayPaymentHistory) {
                            t.displayPaymentHistory();
                            tenantFoundForHistory = true;
                            break;
                        }
                    }
                    if (!tenantFoundForHistory) {
                        System.out.println("Tenant not found");
                    }
                    break;
                case 7:
                    System.out.println("Enter tenant ID to calculate total payment: ");
                    int tenantIDToCalculateTotalPayment = input.nextInt();
                    input.nextLine();
                    boolean tenantFoundForPayment = false;
                    for (Tenant t : tenantList) {
                        if (t.getTenantID() == tenantIDToCalculateTotalPayment) {
                            double totalPayment = t.calculateTotalPayment();  
                            System.out.println("Total payment for Tenant ID " + tenantIDToCalculateTotalPayment + ": " + totalPayment);
                            tenantFoundForPayment = true;
                            break;
                        }
                    }
                    if (!tenantFoundForPayment) {
                        System.out.println("Tenant not found");
                    }
                    break;
                case 8:
                    System.out.println("Enter tenant ID to check payment status: ");
                    int tenantIDToCheckPaymentStatus = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter month to check payment status: ");
                    String monthToCheckPaymentStatus = input.nextLine();
                    
                    boolean tenantFoundForStatus = false;
                    for (Tenant t : tenantList) {
                        if (t.getTenantID() == tenantIDToCheckPaymentStatus) {
                            boolean isPaymentMade = t.hasPaidForMonth(monthToCheckPaymentStatus);  
                            if (isPaymentMade) {
                                System.out.println("Payment made for the month of " + monthToCheckPaymentStatus);
                            } else {
                                System.out.println("Payment not made for the month of " + monthToCheckPaymentStatus);
                            }
                            tenantFoundForStatus = true;
                            break;
                        }
                    }
                    if (!tenantFoundForStatus) {
                        System.out.println("Tenant not found");
                    }
                    break;
                case 9:
                    System.out.println("Enter month to identify tenants with missing payments: ");
                    String monthToIdentifyTenantsWithMissingPayments = input.nextLine();
                    
                    boolean anyTenantWithMissingPayments = false;
                    
                    for (Tenant t : tenantList) {
                        if (!t.hasPaidForMonth(monthToIdentifyTenantsWithMissingPayments)) {  
                            System.out.println("Tenant ID: " + t.getTenantID());
                            System.out.println("Tenant Name: " + t.getName());
                            anyTenantWithMissingPayments = true;
                        }
                    }
                    
                    if (!anyTenantWithMissingPayments) {
                        System.out.println("All tenants have made payments for the month of " + monthToIdentifyTenantsWithMissingPayments);
                    }
                    break;
            
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
