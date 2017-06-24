package hackerrank.java.datastructures;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1 && n<=20000) {
            java.util.ArrayList<java.util.ArrayList<Integer>> rows = new java.util.ArrayList<>(n);
            while(n--!=0) {
                sc.nextLine();
                int d = sc.nextInt();
                if(d>=0 && d<=50000) {
                    java.util.ArrayList<Integer> integers = new java.util.ArrayList<>(d);
                    while(d--!=0)
                        integers.add(sc.nextInt());
                    rows.add(integers);
                }
            }
            sc.nextLine();
            int q = sc.nextInt();
            if(q>=1 && q<=1000) {
                while(q--!=0) {
                    sc.nextLine();
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    try {
                        System.out.println(rows.get(x-1).get(y-1));
                    }catch(IndexOutOfBoundsException ex) {
                        System.out.println("ERROR!");
                    }
                }
            }
        }
        sc.close();
	}
}
