package programmers;

public class Main {
    public static void main(String [] args){
        
    	boolean [] a = new boolean [3];
    	
    	a[0]=true;
    	
    	for(int i=0; i<3; i++) {
    		System.out.println(a[i]);
    	}
    	System.out.println();
    	boolean [] b = a.clone();
    	b[1] = true;
    	for(int i=0; i<3; i++) {
    		System.out.println(b[i]);
    	}
    	System.out.println();
    	System.out.println(a==b);
    	
    }
}
