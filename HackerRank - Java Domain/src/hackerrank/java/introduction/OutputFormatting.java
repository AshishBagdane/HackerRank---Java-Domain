package hackerrank.java.introduction;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			if (s1.length() > 0 && s1.length() <= 10 && (x >= 0 && x <= 999)) {
				String num = "";
				if (x < 10)
					num = "00" + x;
				else if (x < 100)
					num = "0" + x;
				else
					num = "" + x;
				System.out.printf("%-15s%s\n", s1, num);
			}
		}
		System.out.println("================================");
		sc.close();
	}
}
