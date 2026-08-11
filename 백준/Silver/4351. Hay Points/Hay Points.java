import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	private static int N, M, K;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hayPoint = new HashMap<>();
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			hayPoint.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		long total = 0;
		while(true) {
			
			String input = br.readLine();
			if(input.equals(".")) {
				K--; 
				System.out.println(total);
				total = 0;
			}

			st = new StringTokenizer(input);
			while(st.hasMoreTokens()) {
				
				String key = st.nextToken();
				if(hayPoint.containsKey(key)) total += hayPoint.get(key);
				
			}
			
			if(K == 0) break;
			
		}
		
	}
}
