package hackerrank.java.strings.introduction;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		char[] str1 = A.toCharArray();
		str1[0] = Character.toUpperCase(str1[0]);
		A = new String(str1);
		str1 = B.toCharArray();
		str1[0] = Character.toUpperCase(str1[0]);
		B = new String(str1);
		System.out.println(A + " " + B);
		sc.close();
	}
}
