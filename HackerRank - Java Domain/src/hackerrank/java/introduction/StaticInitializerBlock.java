package hackerrank.java.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
	static int B,H;
    static boolean flag = false;
    static Scanner sc=new Scanner(System.in);
    
    static {
        try {
            B = sc.nextInt();
            H = sc.nextInt();
            if((B>=-100 && B<=100) && (H>=-100 && H<=100)){
                if(B<=0 || H<=0)
                    throw new Exception("java.lang.Exception: Breadth and height must be positive");
                else
                    flag = true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
		
	}
}
