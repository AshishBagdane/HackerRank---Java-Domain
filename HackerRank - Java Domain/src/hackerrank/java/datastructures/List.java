package hackerrank.java.datastructures;

import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        java.util.List<Integer> list = new java.util.ArrayList<>(N);
        for(int i=0;i<N;i++)
            list.add(sc.nextInt());
        int Q = sc.nextInt();
        sc.nextLine();
        while(Q--!=0) {
            String query = sc.next();
            if(query.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            }else if(query.equals("Delete")) {
                list.remove(sc.nextInt());
            }
        }
        for(Integer num : list) {
            System.out.print(num + " ");
        }
        sc.close();
	}
}
