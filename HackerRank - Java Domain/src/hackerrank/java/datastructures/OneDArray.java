package hackerrank.java.datastructures;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			a[i] = val;
		}
		
		sc.close();
	}
}
