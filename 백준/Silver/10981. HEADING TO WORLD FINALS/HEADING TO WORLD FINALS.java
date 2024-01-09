import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static class Team implements Comparable<Team> {
		
		String universityName;
		String teamName;
		int solve;
		int penalty;
		
		Team(String universityName, String teamName, int solve, int penalty) {
			this.universityName = universityName;
			this.teamName = teamName;
			this.solve = solve;
			this.penalty = penalty;
		}
		
		@Override
		public int compareTo(Team o) {
			
			if(this.solve == o.solve) return this.penalty - o.penalty;
			else return o.solve - this.solve;
		}
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		PriorityQueue<Team> pq = new PriorityQueue<>();
		
		while(n --> 0) {
			
			st = new StringTokenizer(br.readLine());
			String universityName = st.nextToken();
			String teamName = st.nextToken();
			int solve = Integer.parseInt(st.nextToken());
			int penalty = Integer.parseInt(st.nextToken());

			pq.add(new Team(universityName, teamName, solve, penalty));
		}
		
		Map<String, String> map = new HashMap<>();
		
		while(map.size() != k) {
			
			Team team = pq.poll();
			if(!map.containsKey(team.universityName)) {
				map.put(team.universityName, team.teamName);
				sb.append(map.get(team.universityName)).append("\n");
			}
		}
		
		System.out.print(sb.deleteCharAt(sb.length() - 1));
		
	}
	

}