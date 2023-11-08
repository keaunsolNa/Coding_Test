import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());

			for(int j = 0; j < N; j++) 
				arr[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
			
		}
		
		for(int i = 0; i < N; i++) 
			for(int j = 0; j < N; j++) 
				for(int k = 0; k < N; k++) 
					if(arr[j][i] && arr[i][k]) arr[j][k] = true;

		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) 
				sb.append(arr[i][j] ? 1 : 0).append(" ");
			
			sb.append("\n");
			
		}
		
		System.out.println(sb);
   }
}