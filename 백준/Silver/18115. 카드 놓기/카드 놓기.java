import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> skill = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) skill.add(Integer.parseInt(st.nextToken()));
		
		Collections.reverse(skill);
		
		Deque<Integer> dq = new LinkedList<>();
		int num = 1;
		
		for(int i = 0; i < N; i++) {
			
			switch(skill.get(i)){
				case 1 : dq.addFirst(num); break;
				case 2 : {
					int temp = dq.remove();
					dq.addFirst(num);
					dq.addFirst(temp);
					break;
				}
				case 3 : dq.addLast(num);
					
			}
			num++;
		}
		
		while(!dq.isEmpty()) sb.append(dq.poll() + " ");
		
		System.out.println(sb);
	}
}
