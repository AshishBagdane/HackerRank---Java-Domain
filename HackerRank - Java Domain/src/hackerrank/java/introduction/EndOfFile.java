package hackerrank.java.introduction;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		int lineNo = 1;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			System.out.println(lineNo++ + " " + line);
		}
		sc.close();
	}
}
