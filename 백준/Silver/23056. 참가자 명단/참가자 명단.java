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
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Participant> listOdd = new PriorityQueue<>();
		PriorityQueue<Participant> listEven = new PriorityQueue<>();
		
		Map<Integer, Integer> list = new HashMap<>();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int cls = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			 
			if(cls == 0 && name.equals("0")) break;
			
			if(!list.containsKey(cls)) list.put(cls, 1);
			else if(list.get(cls) < M) list.put(cls, list.get(cls) + 1);
			else continue;
			
			if(cls%2 == 0) listEven.add(new Participant(cls, name));
			else listOdd.add(new Participant(cls, name));
		}
	
		while(!listOdd.isEmpty()) {
			
			int cls = listOdd.peek().cls;
			String name = listOdd.poll().name;
			
			System.out.println(cls + " " + name);
		
		}
		
		while(!listEven.isEmpty()) {
			
			int cls = listEven.peek().cls;
			String name = listEven.poll().name;
			
			System.out.println(cls + " " + name);
			
		}
	}

	private static class Participant implements Comparable<Participant> {

		int cls;
		String name;
		
		Participant(int cls, String name) {
			this.cls = cls;
			this.name = name;
		}
		
		@Override
		public int compareTo(Participant o) {
			
			if(this.cls == o.cls) {
				if(this.name.length() == o.name.length()) return this.name.compareTo(o.name);
				else return this.name.length() - o.name.length();
			}
			return this.cls - o.cls;
		}
		
	}
}
