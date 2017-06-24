package hackerrank.java.bignumber;

import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		java.math.BigDecimal[] s = new java.math.BigDecimal[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextBigDecimal();
		}

		// Write your code here
		Arrays.sort(s);

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

		sc.close();
	}
}
