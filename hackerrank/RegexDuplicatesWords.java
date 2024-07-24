import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicatesWords {
    
    public static void main(String[] args) {
        
        String regex = "\\b(\\w+)(\\w+\\1\\b)+";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner input = new Scanner(System.in);
        int numSentences = Integer.parseInt(input.nextLine());

        while (numSentences-- > 0) {
            String sentence = input.nextLine();
        
            Matcher matcher = pattern.matcher(sentence);
        
            while (matcher.find()) {
                sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
            }
        
            System.out.println(sentence);
        }
        
        input.close();
    }


}
