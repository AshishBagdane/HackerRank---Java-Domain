package hackerrank.java.datastructures;

import java.util.Scanner;

public class BitSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        java.util.BitSet bitSet1 = new java.util.BitSet(N);
        java.util.BitSet bitSet2 = new java.util.BitSet(N);
        int M = sc.nextInt();
        sc.nextLine();
        while(M--!=0) {
            String operation = sc.next().toUpperCase();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(operation.equals("AND")) {
                if(x==1) {
                    bitSet1.and(bitSet2);
                }else if(x==2) {
                    bitSet2.and(bitSet1);
                }
            }else if(operation.equals("OR")) {
                if(x==1) {
                    bitSet1.or(bitSet2);
                }else if(x==2) {
                    bitSet2.or(bitSet1);
                }
            }else if(operation.equals("XOR")) {
                if(x==1) {
                    bitSet1.xor(bitSet2);
                }else if(x==2) {
                    bitSet2.xor(bitSet1);
                }
            }else if(operation.equals("FLIP")) {
                if(x==1) {
                    bitSet1.flip(y);
                }else if(x==2) {
                    bitSet2.flip(y);
                }
            }else if(operation.equals("SET")) {
                if(x==1) {
                    bitSet1.set(y);
                }else if(x==2) {
                    bitSet2.set(y);
                }
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
        sc.close();
	}
}
