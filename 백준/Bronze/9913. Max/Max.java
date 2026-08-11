import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		while(N --> 0) {
			
			int seq = Integer.parseInt(br.readLine());
			map.put(seq, map.getOrDefault(seq, 0) + 1);
		}
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		
		System.out.println(entryList.get(map.size() - 1).getValue());
	}
}
