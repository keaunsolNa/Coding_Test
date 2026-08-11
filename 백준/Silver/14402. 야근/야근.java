import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String oper = st.nextToken();
			map.put(name, map.getOrDefault(name, "") + (","+oper));
		}
		
		int answer = 0;
		for (String name : map.keySet()) {
			StringTokenizer st = new StringTokenizer(map.get(name), ",");
			String before = st.nextToken();
			while(st.hasMoreTokens()) {
				String now = st.nextToken();
				if(before.equals("+")) {
					if(now.equals("-")) {
						before = now;
						continue;
					}
				}
				
				answer++;
				before = now;
			}
		}
		
		System.out.println(answer);
	}
}
