import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        String exampleOfPattern = "";
        int numberOfCases = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < numberOfCases; i++) {
            try {
                exampleOfPattern = scan.nextLine();
                Pattern.compile(exampleOfPattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        
		}
	}
}

