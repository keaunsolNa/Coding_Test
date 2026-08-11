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

	private static int[][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int t = Integer.parseInt(br.readLine());
			
			Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
			while(t --> 0) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				int number = Integer.parseInt(st.nextToken());
				
				map.put(number, name);
			}
			
			Iterator<Integer> iter = map.keySet().iterator();
			
			while(iter.hasNext()) {
				
				String name = map.get(iter.next());
				if(iter.hasNext()) sb.append(name +", ");
				
				else sb.append(name +"\n");
			}
		}
		
		System.out.println(sb);
		
	}
}
