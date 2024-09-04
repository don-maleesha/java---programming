public class Zookeeper extends Animal {
    
    private int employeeId;
    private String species;

    public Zookeeper(String name, String species, int employeeId) {
        super(name, species);
        this.employeeId = employeeId;
        this.species = species;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getSpecies() {
        return species;
    }

    public static void main(String[] args) {
        
        Zookeeper zookeeper = new Zookeeper("John", "Gorilla", 12345);
        System.out.println(zookeeper.getName());
        System.out.println(zookeeper.getSpecies());
        System.out.println(zookeeper.getEmployeeId());
    }
    
}
