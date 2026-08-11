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

	private static int[][] A;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> normal = new HashMap<String, Integer>();
		for(int i = 0; i < A; i++) {
			
			st = new StringTokenizer(br.readLine());
			normal.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			
		}
		
		Map<String, Integer> unique = new HashMap<String, Integer>();
		for(int i = 0; i < B; i++) {
			st = new StringTokenizer(br.readLine());
			unique.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		List<String> special = new ArrayList<>();
		for(int i = 0; i < C; i++) special.add(br.readLine());
		
		int order = Integer.parseInt(br.readLine());
		
		long normalOrder = 0;
		long uniqueOrder = 0;
		int specialOrderCount = 0;
		
		for(int i = 0; i < order; i++) {

			String menu = br.readLine();
			
			if(normal.containsKey(menu)) normalOrder += normal.get(menu);
			else if(unique.containsKey(menu)) uniqueOrder += unique.get(menu);
			else specialOrderCount++;
		}
		
		 if((normalOrder < 20000 && uniqueOrder > 0) || (normalOrder + uniqueOrder < 50000 && specialOrderCount > 0) || specialOrderCount > 1)
	            System.out.println("No");
	        else
	            System.out.println("Okay");
		 
	}
}
