package hackerrank.java.datastructures;

import java.util.Scanner;

public class OneDArray2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] num = new int[n];
            for(int i=0;i<n;i++)
                num[i] = sc.nextInt();
            System.out.println((isPossible(num, m, 0)) ? "YES" : "NO");
        }
        sc.close();
    }
    
    private static boolean isPossible(int[] arr, int m, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isPossible(arr, m, i + 1) || isPossible(arr, m, i - 1) || isPossible(arr, m, i + m);
    }
}
