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
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			String extension = br.readLine().split("[.]")[1];
			map.put(extension, map.getOrDefault(extension, 0)+1);
		}
		
		Map<String, Integer> sortedMap = new TreeMap<>(map);
		
		for (String key : sortedMap.keySet()) {
			System.out.println(key + " " + sortedMap.get(key));
		}
		
	}
}
