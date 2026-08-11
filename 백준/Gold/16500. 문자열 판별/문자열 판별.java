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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();
		int[] dp = new int[101];
		for(int i = 0; i < N; i++) set.add(br.readLine());
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			for(int j = i + 1; j < str.length(); j++) {
				
				if(dp[j] == 1) if(set.contains(str.substring(i, j))) dp[i] = 1;
			}
			
			if(set.contains(str.substring(i))) dp[i] = 1;
		}
		
		System.out.println(dp[0]);
	}
}
