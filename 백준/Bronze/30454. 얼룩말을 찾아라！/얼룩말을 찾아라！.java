import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] answer = new int[2];
		int max = 0;
		for(int i = 0; i < N; i++) {
			
			String horse = br.readLine();
			boolean prev = horse.charAt(0) == '1' ? true : false;
			
			int beauty = 0;
			for(int j = 1; j < L; j++) {
				
				boolean now = horse.charAt(j) == '1' ? true : false;
				
				if(!now && prev) beauty++;
				prev = now;
			}
			
			if(prev) beauty++;

			if(max < beauty) {
				
				max = beauty;
				answer[0] = max;
				answer[1] = 1;
				
			} else if(max == beauty) answer[1]++;
			
		}
		
		System.out.print(answer[0] + " " + answer[1]);
   }
}