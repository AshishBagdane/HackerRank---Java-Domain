package hackerrank.java.bignumber;

import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		java.math.BigInteger n = in.nextBigInteger();
		in.close();
		if (n.isProbablePrime(100))
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
