import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<point> list = new PriorityQueue<>();
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			list.add(new point(x, y, z, name));
		}
		
		while(!list.isEmpty()) System.out.println(list.poll().name);
		
	}

	private static class point implements Comparable<point> {
		
		int x;
		int y; 
		int z;
		String name;
		
		point(int x, int y, int z, String name) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.name = name;
		}

		@Override
		public int compareTo(point o) {
			
			if(this.x != o.x) 
				return o.x - this.x;
			
			else if(this.y != o.y) 
				return this.y - o.y;
			
			else if(this.z != o.z) 
				return o.z - this.z;
			
			else 
				return this.name.compareTo(o.name);
				
		}
		
	}
}
