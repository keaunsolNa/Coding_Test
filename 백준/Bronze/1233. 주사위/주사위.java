import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S1 = Integer.parseInt(st.nextToken());
		int S2 = Integer.parseInt(st.nextToken());
		int S3 = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int s1 = 1; s1 <= S1; s1++) {
			
			for(int s2 = 1; s2 <= S2; s2++) {
				
				for(int s3 = 1; s3 <= S3; s3++) {
					int sum = s1 + s2 + s3;
					map.put(sum, map.getOrDefault(sum, 0) + 1);
				}
			}
		}
		
		int max = 0;
		int ans = 0;
		for(Integer key : map.keySet()) {
			
			if(max < map.get(key)) {
				max = map.get(key);
				ans = key;
			}
		}
		
		System.out.println(ans);
	}
}
