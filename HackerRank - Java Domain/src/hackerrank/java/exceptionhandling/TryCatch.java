package hackerrank.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try {
            System.out.println(sc.nextInt()/sc.nextInt());
        }catch(InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        sc.close();
	}
}
