package hackerrank.java.strings.introduction;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().trim();
		String[] words = line.trim().split("[ !,?.\\_'@]+");
		if (line.length() <= 400000 && line.length() > 0) {
			System.out.println(words.length);
			for (String str : words)
				System.out.println(str);
		} else if (line.length() == 0) {
			System.out.println("0");
		}
		sc.close();
	}
}
