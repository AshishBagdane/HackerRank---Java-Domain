package hackerrank.java.strings.introduction;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int offset = sc.nextInt();
		if (str.length() <= 1000) {
			String min, max;
			min = max = str.substring(0, offset);
			for (int i = 0; i <= str.length() - offset; i++) {
				String curr = new String(str.substring(i, i + offset));
				if (max.compareTo(curr) < 0)
					max = curr;
				else if (min.compareTo(curr) > 0)
					min = curr;
			}
			System.out.println(min);
			System.out.println(max);
		}
		sc.close();
	}
}
