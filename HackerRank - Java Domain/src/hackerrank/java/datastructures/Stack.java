package hackerrank.java.datastructures;

import java.util.Scanner;

public class Stack {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalanced(input.toCharArray()));
		}
		
		sc.close();
	}

	static boolean isBalanced(char input[]) {
		java.util.Stack<Character> stack = new java.util.Stack<>();
		if (input.length % 2 == 0) {
			for (int i = 0; i < input.length; i++) {
				if (stack.empty())
					stack.push(input[i]);
				else if (((char) stack.peek() == '(' && input[i] == ')')
						|| ((char) stack.peek() == '[' && input[i] == ']')
						|| ((char) stack.peek() == '{' && input[i] == '}')) {
					stack.pop();
				} else {
					stack.push(input[i]);
				}
			}
			if (stack.empty())
				return true;
		}
		return false;
	}
}
