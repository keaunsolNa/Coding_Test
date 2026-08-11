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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int idx = 1;
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			String[] input = new String[n];
			for(int i = 0; i < n; i++) input[i] = br.readLine();
			
			Arrays.sort(input);
			
			sb.append(idx + "\n");
			for(int i = 0; i < n; i++) sb.append(input[i] + "\n");
			idx++;
		}
		
		System.out.println(sb);
	}
}
