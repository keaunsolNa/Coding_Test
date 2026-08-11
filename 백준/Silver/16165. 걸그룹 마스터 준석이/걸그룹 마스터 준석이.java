import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, List<String>> girlGroup = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			List<String> memberName = new ArrayList<>();
			String teamName = br.readLine();
			int groupPeople = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < groupPeople; j++) {
				String member = br.readLine();
				memberName.add(member);
			}
			
			Collections.sort(memberName);
			girlGroup.put(teamName, memberName);
		}
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
			int quiz = Integer.parseInt(br.readLine());
			
			if(quiz == 0) {
				for (String member : girlGroup.get(name)) {
					System.out.println(member);
				}
			} else {
				for(String team : girlGroup.keySet()) {
					if(girlGroup.get(team).contains(name)) {
						System.out.println(team);
					}
				}
			}
		}
		
	}
}
