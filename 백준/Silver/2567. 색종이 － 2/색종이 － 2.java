import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        int[] dx = new int[] { -1, 1, 0, 0 };
        int[] dy = new int[] { 0, 0, 1, -1 };
        for (int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	
        	
        	for (int j = x; j < x + 10; j++) 
        		for (int k = y; k < y + 10; k++) arr[j][k] = 1;
        }
       
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
        	
        	for (int j = 0; j < arr[1].length; j++) {
        		
        		if (arr[i][j] == 1) {
        			
        			for(int k = 0; k < 4; k++) {
        				
        				int nx = i + dx[k];
        				int ny = j + dy[k];
        				
        				if (arr[nx][ny] == 0 || nx < 0 || ny > 100 || ny < 0 || ny > 100) cnt++;
        			}
        		}
        	}
        }
      
        System.out.println(cnt);
        
    }

}