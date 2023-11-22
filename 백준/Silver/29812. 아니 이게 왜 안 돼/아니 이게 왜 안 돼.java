import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int spend = 0;

		int SL = 0;
		int YL = 0;
		int UL = 0;
		for(int i = 0; i < N; i++) {
			
			if(S.charAt(i) == 'H' || S.charAt(i) == 'Y' || S.charAt(i) == 'U') {
				
				switch (S.charAt(i)) {
				
					case 'H' : SL++; break;
					case 'Y' : YL++; break;
					case 'U' : UL++; break;
				}
				
			}
				
			
			else {
				
				int term = 0;
				
				for(int j = i; j < N; j++) {
					
					if(S.charAt(j) == 'H' || S.charAt(j) == 'Y' || S.charAt(j) == 'U') break;
					term++;
					
				}
				
				spend += Math.min(term * D, M + D);
				i += term - 1;
			}
			
		}
		
		System.out.println(spend == 0 ? "Nalmeok" : spend);
		int min = Math.min(SL, Math.min(YL, UL));
		System.out.println(min == 0 ? "I love HanYang University" : min);
   }
}