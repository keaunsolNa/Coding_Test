import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<Integer, int[]> map = new HashMap<>();
		
		for(int i = 1; i <= N; i++) map.put(i, new int[] {2, 2});
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			char b = st.nextToken().charAt(0);
			int c = Integer.parseInt(st.nextToken());

			map.get(a)[b == 'P' ? 0 : 1] = c;
		}

		int min = 0;
		for (int key : map.keySet()) {
			
			int[] temp = map.get(key);
			if(temp[1] == 1 || temp[0] == 0) { N--; continue; }
			
			if(temp[0] == 1 && temp[1] == 0) min++;
		}
		
		System.out.println(min + " " + N);
   }
}