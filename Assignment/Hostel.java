import java.util.ArrayList;
import java.util.Scanner;

public class Hostel {

    public static Tenant addTenant(int tenantID){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter tenant name: ");
        String name = input.nextLine();

        System.out.print("Enter room number: ");
        int roomNumber = input.nextInt();
        
        Tenant tenant = new Tenant(tenantID, name, roomNumber);
        return tenant;
    }

    public static Room addRoom(int roomNumber){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter tenent ID: ");
        int tenantID = input.nextInt();

        Room room = new Room(roomNumber, tenantID);
        return room;

    }

    public static Payment addPayment(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month: ");
        String month = input.nextLine();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        Payment payment = new Payment(month, amount);
        return payment;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Room> roomList = new ArrayList<Room>();
        ArrayList<Tenant> tenantList = new ArrayList<Tenant>();


        int choice = 0;
        int tenantID = 1;
        

        while(choice != 10){
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

            switch(choice){
                case 1:
                    System.out.println("Enter tenant details");
                    Tenant tenant = addTenant(tenantID);
                    tenantList.add(tenant);
                    tenantID++;
                    break;
                case 2:
                    System.out.println("Enter tenant ID to remove: ");
                    int tenantIDToRemove = input.nextInt();
                    for(int i = 0; i < tenantList.size(); i++){
                        if(tenantList.get(i).getTenantID() == tenantIDToRemove){
                            tenantList.remove(i);
                            System.out.println("Tenant removed successfully");
                            break;
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i < tenantList.size(); i++){
                        System.out.println("Tenant ID: " + tenantList.get(i).getTenantID());
                        System.out.println("Tenant Name: " + tenantList.get(i).getName());
                        System.out.println("Room Number: " + tenantList.get(i).getRoomNumber());
                    }
                    break;
                case 4:
                    System.out.println("Enter room number to check availability: ");
                    int roomNumber = input.nextInt();
                    boolean isRoomAvailable = true;
                    for(int i = 0; i < roomList.size(); i++){
                        if(roomList.get(i).getRoomNumber() == roomNumber && roomList.get(i).getTenantID() == 0){
                            isRoomAvailable = true;
                            break;
                        } else {
                            isRoomAvailable = false;
                        }
                    }
                    if(isRoomAvailable){
                        System.out.println("Room is vacant");
                    }else{
                        System.out.println("Room is occupied");
                    }
                    break;
                case 5:
                    System.out.println("Enter tenant ID to record payment: ");
                    int tenantIDToRecordPayment = input.nextInt();
                    for(int i = 0; i < tenantList.size(); i++){
                        if(tenantList.get(i).getTenantID() == tenantIDToRecordPayment){
                            Payment payment = addPayment();
                            tenantList.get(i).paymentList.add(payment);
                            System.out.println("Payment recorded successfully");
                            break;
                        }
                    }
                    break;  
                case 6:
                    System.out.println("Enter tenant ID to display payment history: ");
                    int tenantIDToDisplayPaymentHistory = input.nextInt();
                    for(int i = 0; i < tenantList.size(); i++){
                        if(tenantList.get(i).getTenantID() == tenantIDToDisplayPaymentHistory){
                            for(int j = 0; j < tenantList.get(i).paymentList.size(); j++){
                                System.out.println("Month: " + tenantList.get(i).paymentList.get(j).getMonth());
                                System.out.println("Amount: " + tenantList.get(i).paymentList.get(j).getAmount());
                            }
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter tenant ID to calculate total payment: ");
                    int tenantIDToCalculateTotalPayment = input.nextInt();
                    double totalPayment = 0;
                    for(int i = 0; i < tenantList.size(); i++){
                        if(tenantList.get(i).getTenantID() == tenantIDToCalculateTotalPayment){
                            for(int j = 0; j < tenantList.get(i).paymentList.size(); j++){
                                totalPayment += tenantList.get(i).paymentList.get(j).getAmount();
                            }
                            System.out.println("Total payment: " + totalPayment);
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Enter tenant ID to check payment status: ");
                    int tenantIDToCheckPaymentStatus = input.nextInt();
                    System.out.println("Enter month to check payment status: ");
                    String monthToCheckPaymentStatus = input.nextLine();
                    boolean isPaymentMade = false;
                    for(int i = 0; i < tenantList.size(); i++){
                        if(tenantList.get(i).getTenantID() == tenantIDToCheckPaymentStatus){
                            for(int j = 0; j < tenantList.get(i).paymentList.size(); j++){
                                if(tenantList.get(i).paymentList.get(j).getMonth().equals(monthToCheckPaymentStatus)){
                                    isPaymentMade = true;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    if(isPaymentMade){
                        System.out.println("Payment made for the month");
                    }else{
                        System.out.println("Payment not made for the month");
                    }
                    break;
                case 9:
                    System.out.println("Enter month to identify tenants with missing payments: ");
                    String monthToIdentifyTenantsWithMissingPayments = input.nextLine();
                    for(int i = 0; i < tenantList.size(); i++){
                        boolean isPaymentMadeForMonth = false;
                        for(int j = 0; j < tenantList.get(i).paymentList.size(); j++){
                            if(tenantList.get(i).paymentList.get(j).getMonth().equals(monthToIdentifyTenantsWithMissingPayments)){
                                isPaymentMadeForMonth = true;
                                break;
                            }
                        }
                        if(!isPaymentMadeForMonth){
                            System.out.println("Tenant ID: " + tenantList.get(i).getTenantID());
                            System.out.println("Tenant Name: " + tenantList.get(i).getName());
                        }
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
