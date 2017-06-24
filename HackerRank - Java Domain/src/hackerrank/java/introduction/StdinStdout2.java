package hackerrank.java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinStdout2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		double y = Double.parseDouble(br.readLine());
		String s = br.readLine();
		// Complete this code

		System.out.println("String: " + s);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);
	}
}
