import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int INF = 999999999;
    public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
        int[][] dist = new int[n + 1][n + 1];
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				
				if(i == j) dist[i][j] = 0;
				else dist[i][j] = INF;
				
			}
		}
		
		for(int i = 0; i < m; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			dist[a][b] = Math.min(dist[a][b], c);
		}
		
		for (int k = 1; k <= n; k++) {
			
            for (int i = 1; i <= n; i++) { 
            	
                for (int j = 1; j <= n; j++) {
                	
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                    	
                        dist[i][j] = dist[i][k] + dist[k][j];
                        
                    }
                }
            }
		}
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				
                if(dist[i][j] == INF) sb.append("0 ");
				else sb.append(dist[i][j] + " ");
                
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
        
    }
}