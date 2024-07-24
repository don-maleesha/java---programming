import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile(new MyRegex().pattern);

        while (input.hasNext()) {
            String IP = input.next();
            Matcher matcher = pattern.matcher(IP);
            System.out.println(matcher.matches());
        }
    }
}

class MyRegex {
    // Correct regex pattern for IP address
    String reg = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    public String pattern = "^" + reg + "\\." + reg + "\\." + reg + "\\." + reg + "$";
}
