package hackerrank.java.datastructures;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        long subSum = 0, cnt = 0;
        for(int i=0;i<n;i++)
            num[i] = sc.nextInt();
        for(int i=0;i<n;i++) {
            subSum=0;
            for(int j=i;j<n;j++) {
                subSum += num[j];
                if(subSum<0)
                    cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
	}
}
