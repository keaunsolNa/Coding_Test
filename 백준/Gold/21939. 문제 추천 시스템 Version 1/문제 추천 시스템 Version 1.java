import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	private static int P;
	private static Map<Long, Long> map = new HashMap<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Problem> ts = new TreeSet<>();
        Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
            ts.add(new Problem(P, L));
            map.put(P,L);
		}
		
		int m = Integer.parseInt(br.readLine());
		
        for (int i = 0; i < m; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	String command = st.nextToken();
        	
            if (command.equals("add")) {
            	
                int P = Integer.parseInt(st.nextToken());
                int L = Integer.parseInt(st.nextToken());
                
                ts.add(new Problem(P, L));
                map.put(P,L);
                
            } else {
            	
                if (command.equals("recommend")) {
                	
                    if (Integer.parseInt(st.nextToken()) == 1) sb.append(ts.last().idx + "\n");
                    else sb.append(ts.first().idx + "\n");
                    
                } else {
                	
                    int L = Integer.parseInt(st.nextToken());
                    ts.remove(new Problem(L,map.get(L)));
                    map.remove(L);
                    
                }
            }
        }
	
        System.out.println(sb);
	}

    public static class Problem implements Comparable<Problem> {
        int idx;
        int level;

        public Problem(int idx, int level) {
            this.idx = idx;
            this.level = level;
        }

        public int compareTo(Problem o) {

            if (level - o.level == 0) return idx - o.idx;
            return level - o.level;
        }

    }
}
