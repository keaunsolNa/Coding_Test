import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][N + 1];
		final int INF = 987654321;
		
		for (int i = 1; i <= N; i++) {
	    
			for (int j = 1; j <= N; j++) {
	        
				arr[i][j] = INF;
				if (i == j) arr[i][j] = 0;
				
			}
		}
		
        for (int i = 0; i < M; i++) {
        	
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
 
            arr[x][y] = arr[y][x] = 1;
            
        }
     
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (arr[i][j] > arr[i][k] + arr[k][j]) 
                    	arr[i][j] = arr[i][k] + arr[k][j];
                }
            }
        }
 
        int res = INF;
        int idx = -1;
     
        for (int i = 1; i <= N; i++) {
        	
            int total = 0;
            for (int j = 1; j <= N; j++)  total += arr[i][j];
            
 
            if (res > total) {
                res = total;
                idx = i;
            }
        }
        
        System.out.println(idx);
   }
}