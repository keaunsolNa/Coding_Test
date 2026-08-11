import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int room = Integer.parseInt(st.nextToken());
		double pay = Double.parseDouble(st.nextToken());
		
		Map<String, Double> map = new HashMap<>();
		for(int i = 0; i < room; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double flat = Integer.parseInt(st.nextToken());
			String roomValue = st.nextToken();
			
			map.put(roomValue, map.getOrDefault(roomValue, 0.0) + flat);
			
		}
		
		double total = 0;
		double bed = 0;
		double bal = 0;
		for (String rv : map.keySet()) {
			total += map.get(rv);
			if(rv.equals("bedroom")) bed += map.get(rv);
			if(rv.equals("balcony")) bal += map.get(rv);
		}
		
		
		System.out.println((int)total);
		System.out.println((int)bed);
		System.out.println(((total - bal + (bal/2)) * pay));
		
    }
}
