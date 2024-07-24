import java.security.Permission;
import java.util.Scanner;

public class JavaIntToString {
    
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();


        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }

    }

    class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 /**
 * 
 */
@SuppressWarnings("removal")
public static void forbidExit() {
  @SuppressWarnings("removal")
final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}

}
