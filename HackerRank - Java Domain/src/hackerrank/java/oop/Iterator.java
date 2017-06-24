package hackerrank.java.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Iterator {

	static java.util.Iterator<Object> func(ArrayList<Object> mylist) {
		java.util.Iterator<Object> it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String)// Hints: use instanceof operator
				break;
		}
		return it;
	}

	public static void main(String[] argh) {
		ArrayList<Object> mylist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}
		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		java.util.Iterator<Object> it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
		sc.close();
	}
}
