import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		Map<Integer, Integer> map = new HashMap<>();
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int id = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken().split("/")[1]);
			
			map.put(month, map.getOrDefault(month, 0) + 1);
		}
		
		for(int i = 1; i <= 12; i++) {
			
			System.out.print(i + " ");
			System.out.println(map.containsKey(i) ? map.get(i) : 0);
		}
		
	}
}
