import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			int pigeon = N > 32 ? 33 : N;
			String[] people = new String[pigeon];
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < pigeon; i++) people[i] = st.nextToken();
			
			System.out.println(loop(pigeon, people));
		}
	}
	
	public static int loop(int N, String[] people) {
		int min = 12;
		for(int a = 0; a < N; a++) {
			
			for(int b = a + 1; b < N; b++) {
				
				for(int c = b + 1; c < N; c++) {
					int dis = getDistance(people[a], people[b]) + getDistance(people[b], people[c]) + getDistance(people[a], people[c]);
					min = Math.min(dis, min);
					
					if(min == 0) return 0;
				}
			}
		}
		
		return min;
	}

	public static int getDistance(String A, String B) {
		
		int distance = 0;
		for(int i = 0; i < 4; i++) 
			distance += A.charAt(i) != B.charAt(i) ? 1 : 0;
		
		return distance;
	}
}