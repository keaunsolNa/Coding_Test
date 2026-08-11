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
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int L = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		boolean[] cake = new boolean[L + 1];
		
		int max = 0;
		int peopleIdx = 0;
		int maxGet = 0;
		int peopleGet = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int term = k - p ;
			
			if(term > max) {
				max = term;
				peopleIdx = i + 1;
			} else if(term == max) {
				
				if(peopleIdx > i + 1) peopleIdx = i + 1;
			}
			
			int get = 0;
			for(int j = p; j <= k; j++) {
				
				if(!cake[j]) {
					cake[j] = true;
					get++;
				}
			}
			
			if(maxGet < get) {
				maxGet = get;
				peopleGet = i + 1;
			}
			
			else if(maxGet == get) {
				
				if(peopleGet > i + 1) peopleGet = i + 1;
			}
		}
		
		System.out.println(peopleIdx);
		System.out.println(peopleGet);
	}
}
