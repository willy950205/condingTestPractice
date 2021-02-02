package baekjoon;

import java.util.Scanner;

public class Baekjoon17471 {
	public static void main(String [] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		int [] population = new int [N];
		int [][] graph = new int [N][N]; 
		
		for(int i =0; i<N; i++) {
			population[i] = scn.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int a = scn.nextInt();
			for(int j=0; j<a; j++ ) {
				int b = scn.nextInt();
				
				graph[i][b-1] = 1;
			}
		}
		
		for(int i =0; i<N; i++) {
			System.out.println(population[i]+" ");
		}
		
	}
}
