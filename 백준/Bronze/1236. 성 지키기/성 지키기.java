import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
              
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int col = 0;
        int row = 0;
       
        boolean[][] arr = new boolean[N][M];

        for(int i = 0; i < N; i++) {
        	
            String str = br.readLine();
            
            for(int j = 0; j < M; j++) {
           
                if(str.charAt(j) == '.') arr[i][j] = false;
                else arr[i][j] = true;
                
            }
        }
       
        for(int i = 0; i < M; i++) {

        	int count = 0;

            for(int k = 0; k < N; k++) 
                if(arr[k][i] == false) count ++;

            if(count == N) col++;
            
        }

        for(int i = 0; i < N; i++) {
        	
            int count = 0;
            
            for(int k = 0; k < M; k++) 
                if(arr[i][k] == false) count ++;

            if(count == M) row++;
            
        }

        if(row >= col) System.out.println(row);
        else System.out.println(col);
        
	}
}
