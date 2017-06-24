package hackerrank.java.strings.introduction;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(checkPalindrome(sc.next().toCharArray()));
		sc.close();
	}

	static String checkPalindrome(char[] string) {
		for (int i = 0; i < string.length; i++) {
			if (string[i] != string[string.length - (i + 1)]) {
				return "No";
			}
		}
		return "Yes";
	}
}
