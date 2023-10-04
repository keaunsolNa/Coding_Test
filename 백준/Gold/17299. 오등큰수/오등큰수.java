import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int[] sq = new int[N];
		
		st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			
			int key = Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
			sq[i] = key;
			
		}
		
		for(int i = 0; i < N; i++) {
			
			while(!stack.isEmpty() && map.get(sq[stack.peek()]) < map.get(sq[i]))
				sq[stack.pop()] = sq[i];
			stack.push(i);
		}

		while(!stack.isEmpty()) sq[stack.pop()] = -1;
		
		for(int i = 0; i < N; i++) sb.append(sq[i] + " ");
		
		System.out.println(sb);
   }
}