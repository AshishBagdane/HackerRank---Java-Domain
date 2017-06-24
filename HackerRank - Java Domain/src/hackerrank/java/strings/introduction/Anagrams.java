package hackerrank.java.strings.introduction;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagrams {
   
	static boolean isAnagram(String A, String B) {
		if (A.length() == B.length()) {
			List<Character> firstChars = A.toLowerCase().chars().mapToObj(e -> (char) e).collect(Collectors.toList());
			Collections.sort(firstChars);
			List<Character> secondChars = B.toLowerCase().chars().mapToObj(e -> (char) e).collect(Collectors.toList());
			Collections.sort(secondChars);
			secondChars.stream().forEach((ch) -> {
				firstChars.remove(ch);
			});
			return (firstChars.isEmpty()) ? true : false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		sc.close();
		
	}
}
