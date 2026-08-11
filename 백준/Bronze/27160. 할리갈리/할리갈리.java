import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			String fruit = input[0];
			int number = Integer.parseInt(input[1]);
			
			map.put(fruit, map.getOrDefault(fruit, 0) + number);
			
		}
		
		for(String key : map.keySet()) {
			
			if(map.get(key) == 5) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
	}
}
