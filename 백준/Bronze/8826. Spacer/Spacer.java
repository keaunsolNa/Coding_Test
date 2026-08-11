import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static String input;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int t = Integer.parseInt(br.readLine());
			char[] input = br.readLine().toCharArray();
			
			Map<Character, Integer> map = new HashMap<>();
			
			map.put('N', 0);
			map.put('S', 0);
			map.put('E', 0);
			map.put('W', 0);
			
			for(int j = 0;j < t; j++) map.put(input[j], map.get(input[j]) + 1);
			
			System.out.println(Math.abs(map.get('N') - map.get('S')) + Math.abs(map.get('E') - map.get('W')));
		}
		
	}
}
