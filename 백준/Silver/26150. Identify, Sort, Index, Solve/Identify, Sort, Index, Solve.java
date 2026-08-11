import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Character> map = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int index = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken()) - 1;
			
			char value = ((int)name.charAt(D) > 90) ? (char)((int)name.charAt(D) - 32) : name.charAt(D);
			map.put(index, value);
		}
		
		for (Integer key : map.keySet()) System.out.print(map.get(key));
			
		
	}
}
