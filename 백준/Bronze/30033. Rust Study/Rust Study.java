import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st2.nextToken());
			
			if(A <= B) answer++;
		}
		
		System.out.println(answer);
	}
}
