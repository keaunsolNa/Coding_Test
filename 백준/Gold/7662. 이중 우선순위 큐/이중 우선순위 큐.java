import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> que = new TreeMap<>();
			
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				String oper = st.nextToken();
				int value = Integer.parseInt(st.nextToken());
				
				switch(oper) {
					case "I" :
						que.put(value, que.getOrDefault(value, 0) + 1);
						break;
					case "D" :
						
						if(que.size() < 1) continue;
						
	                    int target = value == 1 ? que.lastKey() : que.firstKey();
	                    if (que.put(target, que.get(target) - 1) == 1)
	                        que.remove(target);
				}
			}
			
			if(que.isEmpty()) sb.append("EMPTY").append("\n");
			else sb.append(que.lastKey() + " " + que.firstKey()).append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
