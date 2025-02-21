import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
 
public class Main {
	
	public static int N, M;
	public static int[][] map;
	public static String S, T;
	public static int result = -1;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	map = new int[N][M];
    	for(int i=0;i<N;i++) {
    		String s = br.readLine();
    		for(int j=0;j<M;j++) {
    			map[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));	
    		}
    	}
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			for(int di =-N; di<N;di++){ 
    				for(int dj = -M; dj<M;dj++) { 
    					
    					if(di == 0 && dj == 0) {
    						continue;
    					}
    					
    					int nI = i;
    					int nJ = j;
    					int now = 0;
    					while( nI >= 0 && nI < N && nJ >= 0 && nJ < M) {
    						now *= 10;
    						now += map[nI][nJ];
    						
    						int sqrt_check = (int) Math.sqrt( (double) now);
    						if( sqrt_check * sqrt_check == now) result = Math.max(result, now);
    						
    						nI += di;
    						nJ += dj;
    					}
    					
    				}
    			}
    		}
    	}
    	System.out.println(result);
    	
    	
    }
    
    
}