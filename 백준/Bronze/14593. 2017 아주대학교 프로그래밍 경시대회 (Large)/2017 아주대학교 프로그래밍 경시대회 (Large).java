import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int maxScore = 0;
		int recordC = 0;
		int recordL = 0;
		int winner = 0;
		
		for(int i = 0; i < N; i++) {
	
			st = new StringTokenizer(br.readLine());
			
			int S = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
			if(S > maxScore) {
				
				maxScore = S;
				recordC = C;
				recordL = L;
				winner = i + 1;
				
			} else if(S == maxScore) {
				
				if(C < recordC) {
					
					recordC = C;
					recordL = L;
					winner = i + 1;
					
				} else if(C == recordC) {
					
					if(L < recordL) {
						recordL = L;
						winner = i + 1;
					}
					
				}
			}
		}
		
		System.out.println(winner);
	}
}
