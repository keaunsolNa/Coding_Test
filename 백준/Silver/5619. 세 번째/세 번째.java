import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		
		if(list.size() != 3) {
			for(int i = 0; i < 4 ; i++) {
				int input = list.get(i);
				for(int j = 0; j < 4 ; j++) {
					if(j != i) {
						pq.add(Integer.parseInt(input + "" + list.get(j)));
					}
				}
			}
	
			for(int i = 0; i < 2; i++) {
				pq.poll();
			}
			
			System.out.println(pq.poll());
		} else {
			for(int i = 0; i < N ; i++) {
				int input = list.get(i);
				for(int j = 0; j < N ; j++) {
					if(j != i) {
						pq.add(Integer.parseInt(input + "" + list.get(j)));
					}
				}
			}
	
			for(int i = 0; i < 2; i++) {
				pq.poll();
			}
			
			System.out.println(pq.poll());
		}
	}
}
