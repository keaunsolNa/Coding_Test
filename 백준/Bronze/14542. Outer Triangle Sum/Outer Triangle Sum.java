import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static String T;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			
			int T = Integer.parseInt(input);
			int TC = 1;
			List<List<Long>> arr = new ArrayList<>();
			
			for(int i = 0; i < T; i++) {
			
				arr.add(new ArrayList<Long>());
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) 
					arr.get(i).add(Long.parseLong(st.nextToken()));
			}

			long sum = 0;
			for(int i = 0; i < T; i++) sum += arr.get(i).get(0);
			
			for(int i = 1; i < T; i++) {
				
				if(i == T - 1) for(int j = 1; j < T; j++) sum += arr.get(i).get(j);
				
				else if(i > 0 && i < T - 1) {
					sum += arr.get(i).get(arr.get(i).size() - 1);
				}
				
			}
			
			sb.append("Case #" + TC + ":" + sum + "\n");
			TC++;
		}
		
		System.out.print(sb);
	}
}
