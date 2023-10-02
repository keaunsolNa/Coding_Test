import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int answer = 0;
		for(int i = 0; i < N; i++) {
			

			st = new StringTokenizer(br.readLine());			
			int len = Integer.parseInt(st.nextToken());
			
			switch (len) {
				case 136 : answer += 1000; break;
				case 142 : answer += 5000; break;
				case 148 : answer += 10000; break;
				case 154 : answer += 50000; break;
			}
		}
        
        System.out.println(answer);
	}
}
