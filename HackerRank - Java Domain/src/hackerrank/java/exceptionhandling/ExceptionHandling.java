package hackerrank.java.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		in.close();
	}
	
	static class MyCalculator {
	    int power(int n, int p)throws Exception {
	        if(n<0 || p<0)
	            throw new Exception("n and p should be non-negative");
	        return (int) Math.pow(n, p);
	    }
	}
}
