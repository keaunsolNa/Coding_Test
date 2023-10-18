import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[] buildTime;
	private static boolean[][] matrix;
	private static int[] link;
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			buildTime = new int[N + 1];
			matrix = new boolean[N + 1][N + 1];
			link = new int[N + 1];
			
			st = new StringTokenizer(br.readLine());
			for(int time = 1; time < N + 1; time++) 
				buildTime[time] = Integer.parseInt(st.nextToken());

			
			for(int order = 0; order < K; order++) {
				
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());

				matrix[x][y] = true;
				link[y]++;
				
			}
			
			int W = Integer.parseInt(br.readLine());
			int returnValue = solove()[W];
			System.out.println(returnValue);
		}

   }
    
    public static int[] solove() {
		
		Queue<Integer> qu = new LinkedList<>();
		int[] result = new int[link.length];
		
		for(int i = 1; i  < link.length; i++) {
			
			if(link[i] == 0) {
				result[i] = buildTime[i];
				qu.add(i);
			}
		}
		
		while(!qu.isEmpty()) {
			
			int prev = qu.poll();
			
			for(int i = 1; i < link.length; i++) {
				
				if(matrix[prev][i]) {
					
					result[i] = Math.max(result[i], result[prev] + buildTime[i]);
					--link[i];
					
					if(link[i] == 0) qu.add(i);
				}
			} 
		}
		
		return result;
	}
}