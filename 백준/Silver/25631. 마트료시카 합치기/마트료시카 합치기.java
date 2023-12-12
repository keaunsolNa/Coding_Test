import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			map.put(temp, map.getOrDefault(temp, 0) + 1);
			
		}
		
		int ans = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) ans = Math.max(ans, entry.getValue());
			
		System.out.println(ans);
   }
}