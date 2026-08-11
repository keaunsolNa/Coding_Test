import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
			
			List<String> list = new ArrayList<>();
			Set<String> set = new HashSet<>();
			
			st = new StringTokenizer(br.readLine());
			
			Map<String, Integer> map = new HashMap<>();
			while(n --> 0) {
				
				String input = st.nextToken();
				map.put(input.substring(input.length() - F, input.length()), map.getOrDefault(input.substring(input.length() - F, input.length()), 0) + 1);
			}

			int ans = 0;
			for (String string : map.keySet()) ans += map.get(string) / 2;
		
			System.out.println(ans);
		}
		
	}
}
