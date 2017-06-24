package hackerrank.java.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Dequeue {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = -1;
        java.util.HashSet<Integer> countSet = new java.util.HashSet<>();
        boolean isFirstSubArray = true;
        int lastFirst = 0;

        //the key is to only iterate thru deque once to initialize set
        //Then just worry about removing the first number
        //and adding next number for all subsequent subarrays
        for (int i = 0; i < n; i++) {
            deque.addLast(in.nextInt());

            if(deque.size() == m){
                //isFirstSubArray used to determine if we iterate 
                //through entire deque to populate the hashSet.
                //We only want to do this once, 
                //or we will slow performance
                //thus failing cases 9 & 10

                if(isFirstSubArray){
                    //Create iterator to loop through all nums in deque
                    Iterator<Integer> it = deque.iterator();

                    //Add to set to ignore duplicates
                    while(it.hasNext()){
                        countSet.add(it.next());
                    }

                    max = getUniqueMax(max, countSet.size());

                    //Ensure this code never runs again with boolean
                    isFirstSubArray = false;
                }else{
                    //check if removed item still exists in the deque
                    //if not, remove it from set
                    if(!deque.contains(lastFirst)){
                        countSet.remove(lastFirst);
                    }

                    //check if new item in deque exists in the set
                    //if it doesn't, add it to the set
                    if(!countSet.contains(deque.getLast())){
                        countSet.add((int)deque.getLast());
                    }

                    max = getUniqueMax(max, countSet.size());
                }
                //Get & remove first value in deque with pollFirst()!
                lastFirst = (int)deque.pollFirst();
            }
        }
        
        //print max of unique numbers
        System.out.println(max);
        in.close();
    }

    public static int getUniqueMax(int max, int setSize){
        if(max < 0){
            //initialize max variable to set size
            return setSize;
        }

        if(setSize > max){
            //change max to set size if it's greater than previous max
            return setSize;
        }

        //leave max unchanged if above cases fail
        return max;
    }
}
