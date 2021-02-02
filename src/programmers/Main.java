package programmers;

public class Main {
    public static void main(String [] args){
        
    	int [][] tri = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}	;
    	
    	IntegerTriangle a = new IntegerTriangle();
    	System.out.println(a.solution(tri));
    	
    }
}
