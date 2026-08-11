import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		ArrayList<STELLA> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int clear = Integer.parseInt(st.nextToken());
			int penalty = Integer.parseInt(st.nextToken());
			list.add(new STELLA(clear, penalty));
		}

		Collections.sort(list);
		STELLA fifth = list.get(4);
        int answer = 0;
        
		for(int i = 5; i < list.size(); i++	) {
			
			STELLA now = list.get(i);
            
            if (fifth.clear == now.clear)
                answer++;
            else break;
		}
		
		System.out.println(answer);
	}

	static class STELLA implements Comparable<STELLA>{
		int clear, penalty;
		
		public STELLA(int clear, int penalty) {
			this.clear = clear;
			this.penalty = penalty;
		}
		
        @Override
        public int compareTo(STELLA p) {
            return this.clear == p.clear ? this.penalty - p.penalty : p.clear - this.clear;
        }
		
	}
}
