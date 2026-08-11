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

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map1 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			String key = br.readLine();
			map1.put(key, map1.getOrDefault(key, 0) + 1);
			
		}
		
		Map<String, Integer> map2 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			String key = br.readLine();
			map2.put(key, map2.getOrDefault(key, 0) + 1);
			
		}
		
		int ans = 0;
		
		for (String key : map1.keySet()) {
			
			int a = map1.containsKey(key) ? map1.get(key) : 0;
			int b = map2.containsKey(key) ? map2.get(key) : 0;
			
			ans += Math.min(a, b);
		}
			
		
		System.out.println(ans);
	}
}
