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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0; i < N - 1; i++) {
			
			int people = Integer.parseInt(st.nextToken());
			int idx = i + 2;
			
			map.put(people, idx);
		}
		
		System.out.print("1 ");
		for (int key : map.keySet()) {
			System.out.print(map.get(key) + " ");
		}
	}
}
