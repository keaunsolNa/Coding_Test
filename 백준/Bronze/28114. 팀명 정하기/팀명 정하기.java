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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] yearArr = new int[3];
		Map<Integer, Character> map = new TreeMap<>(Comparator.reverseOrder());
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int solve = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken()) % 100;
			char name = st.nextToken().charAt(0);
			
			yearArr[i] = year;
			map.put(solve, name);
		}
		
		Arrays.sort(yearArr);
		for (int i : yearArr) System.out.print(i);
		
		System.out.println();
		
		for (int key : map.keySet()) System.out.print(map.get(key));
		
	}
}
