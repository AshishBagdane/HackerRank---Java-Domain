package hackerrank.java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t--!=0){
            String[] ip = br.readLine().split(" ");
            int a = Integer.parseInt(ip[0]);
            int b = Integer.parseInt(ip[1]);
            int n = Integer.parseInt(ip[2]);
            if((a>=0 && a<=50) && (b>=0 && b<=50) && (n>=1 && n<=15)){
                int ans = a, cnt = 0;
                while(n--!=0){
                    ans+= (((int)Math.pow(2, cnt++)) * b);
                    System.out.print(ans + " ");
                }
                System.out.println();
            }
        }
	}
}
