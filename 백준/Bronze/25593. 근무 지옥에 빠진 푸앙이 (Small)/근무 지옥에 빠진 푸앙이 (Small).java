import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Long> map = new HashMap<>();
		int time = 4;
		for(int i = 1; i < 4*N+1; i++) {
			if(i % 4 == 1) time = 4;
			if(i % 4 == 2) time = 6;
			if(i % 4 == 3) time = 4;
			if(i % 4 == 0) time = 10;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 7; j++) {
				String people = st.nextToken();
				if(people.equals("-")) continue;
				map.put(people, map.getOrDefault(people, (long) 0) + time);
			}
		}
		
		long min = 999999999;
		long max = 0;
		for (String name : map.keySet()) {
			if(map.get(name) > max) {
				max = map.get(name);
			}
			if(map.get(name) < min) {
				min = map.get(name);
			}
		}
		if(max - min > 12) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
