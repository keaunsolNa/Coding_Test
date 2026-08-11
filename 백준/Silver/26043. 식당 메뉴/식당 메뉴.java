import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		PriorityQueue<Integer> studentA = new PriorityQueue<>();
		PriorityQueue<Integer> studentB = new PriorityQueue<>();
		Queue<int[]> studentC = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			switch(order) {
				
				case 1 :
					
					studentC.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
					break;
					
				case 2 : 
					
					int menu = Integer.parseInt(st.nextToken());
					int[] student = studentC.poll();
					
					if(student[1] == menu) studentA.add(student[0]);
					else studentB.add(student[0]);
					
			}
					
		}
		
		System.out.println(returner(studentA).toString());
		System.out.println(returner(studentB).toString());
		
		if(studentC.isEmpty()) System.out.println("None");
		
		else {
			
			StringBuilder sb = new StringBuilder();
			while(!studentC.isEmpty()) sb.append(studentC.poll()[0]).append(" ");
			
			System.out.print(sb.deleteCharAt(sb.length() - 1));
		}
		
	}

	private static StringBuilder returner(PriorityQueue<Integer> que) {
		
		StringBuilder answer = new StringBuilder();
		
		if(que.isEmpty()) answer.append("None");
		
		else {
			
			while(!que.isEmpty()) answer.append(que.poll()).append(" ");
			
			answer.deleteCharAt(answer.length() - 1);
		}
			
		return answer;
	}
}
