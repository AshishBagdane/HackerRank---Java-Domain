package hackerrank.java.strings.introduction;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- != 0) {
			try {
				Pattern.compile(sc.nextLine());
				System.out.println("Valid");
			} catch (PatternSyntaxException ex) {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}
