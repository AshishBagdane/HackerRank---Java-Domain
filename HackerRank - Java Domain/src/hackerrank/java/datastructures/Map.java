package hackerrank.java.datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n >= 1 && n <= 100000) {
			in.nextLine();
			java.util.Map<String, Integer> phbook = new HashMap<>();
			for (int i = 0; i < n; i++) {
				String name = in.nextLine();
				int phone = in.nextInt();
				if (phone >= 10000000 && phone <= 99999999) {
					phbook.put(name, phone);
				}
				in.nextLine();
			}
			while (in.hasNext()) {
				String s = in.nextLine();
				Integer phone = (Integer) phbook.get(s);
				if (phone != null)
					System.out.println(s + "=" + phbook.get(s));
				else
					System.out.println("Not found");
			}
		}
		in.close();
	}
}
