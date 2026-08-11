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
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, BigInteger> map = new HashMap<>();
		BigInteger value = new BigInteger("0");
		String time = "4";
		for(int i = 1; i < 4*N+1; i++) {
			if(i % 4 == 1) time = "4";
			if(i % 4 == 2) time = "6";
			if(i % 4 == 3) time = "4";
			if(i % 4 == 0) time = "10";
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 7; j++) {
				String people = st.nextToken();
				if(people.equals("-")) continue;
				map.put(people, map.getOrDefault(people, value).add(new BigInteger(time)));
			}
		}
		BigInteger min = new BigInteger("9999999999999999999999999999");
		BigInteger max = new BigInteger("0");
		for (String name : map.keySet()) {
			if(map.get(name).compareTo(max) == 1) {
				max = map.get(name);
			}
			if(map.get(name).compareTo(min) == -1) {
				min = map.get(name);
			}
		}
		if(max.compareTo(min.add(new BigInteger("12"))) == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
