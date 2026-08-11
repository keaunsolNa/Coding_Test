import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt  = 0;
		
		Map<Character, List<String>> map = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			char key = temp.charAt(0);
			
			if(map.containsKey(key)) {
				map.get(key).add(temp);
			} else {
				
				List<String> arr = new ArrayList<>();
				arr.add(temp);
				map.put(key, arr);
				
			}
		};
		
		System.out.println(map);
		for(int i = 0; i < M; i++) {
			
			String temp = br.readLine();
			Character start = temp.charAt(0);
			
			if(!map.containsKey(start)) continue;
			for(int j = 0; j < map.get(start).size(); j++) {
				
				if(map.get(start).get(j).startsWith(temp)) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
