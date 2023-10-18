import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[1002][1002];
		int temp = 1;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j = x1; j < x1 + x2; j++) 
				for(int k = y1; k < y1 + y2; k++) 
					map[j][k] = temp;
			
			temp++;
		}
	
		
		Map<Integer, Integer> answerMap = new HashMap<>();
		for (int[] is : map) 
			for(int is2 : is) 
				answerMap.put(is2, answerMap.getOrDefault(is2, 0) + 1);
		
		for(int i = 1; i <= N; i++) 
			System.out.println(answerMap.get(i) == null ? 0 : answerMap.get(i));
   }
}