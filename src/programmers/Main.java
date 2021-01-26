package programmers;

import java.util.PriorityQueue;

public class Main {
    public static void main(String [] args){
        
//    	ProRanking a = new ProRanking();
//    	int results [][] = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
//    	a.solution(5, results);
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    	
    	pq.add(10);
    	pq.add(5);
    	pq.add(100);
    	pq.add(1);
    	pq.add(13);
    	
     
    	while(!pq.isEmpty()) {
    		System.out.println(pq.poll());
    	}
    	
    }
}
