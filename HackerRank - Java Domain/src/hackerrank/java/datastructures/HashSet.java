package hackerrank.java.datastructures;

import java.util.Scanner;

public class HashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        if(T>=1 && T<=100000) {
            java.util.HashSet<String> pairs = new java.util.HashSet<>();
            while(T--!=0) {
                String pair = sc.nextLine();
                pairs.add(pair);
                System.out.println(pairs.size());
            }
        }
        sc.close();
	}
}
