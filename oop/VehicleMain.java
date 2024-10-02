public class VehicleMain {
    
    public static void main(String[] args) {
        
        Vehicle vehicle = new Van();  // Create a Van object
        vehicle.park();  // Call the park method of Van

        Vehicle vehicle1 = new Bus(); // Create a Bus object
        vehicle1.drive();  // Call the drive method of Bus

        Van van = new Van();  // Create a Van object
        van.carryGoods();  // Call the carryGoods method of Van
    }
}