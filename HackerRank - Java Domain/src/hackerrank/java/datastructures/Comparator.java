package hackerrank.java.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class Comparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
        
        scan.close();
	}
	
	static class Checker implements java.util.Comparator<Object> {

	    @Override
	    public int compare(Object o1, Object o2) {
	        Player one = (Player) o1;
	        Player two = (Player) o2;
	        if(one.score<two.score) {
	            return 1;
	        }else if(one.score>two.score) {
	            return -1;
	        }else {
	            return one.name.compareTo(two.name);
	        }
	    }    
	}
	
	static class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}
}
