package programmers;

public class Network {
	
	boolean [] visited ;
	
	public int solution(int n, int[][] computers) {
        int answer = 0;
        
        visited = new boolean[n];
        
        System.out.print(visited[0]);
        
        for(int node =0; node<n; node++) {
        
        	if(!visited[node]) {
        		answer++;
        		dfs(n,node,computers,visited);
        	}
        	
        }
        
        return answer;
    }
	
	
	public void dfs(int n, int node, int[][] computers, boolean [] visited) {
		visited[node]=true;
		
		for(int i=0; i<n; i++) {
			if(computers[node][i]==1&&i!=node&&!visited[i]) {
				dfs(n,i,computers,visited);
			}
		}
	}
}
