import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int cnt = 8 - N;
		int score = 0;
		int[] X = new int[10];
		int[] Y = new int[10];
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			X[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}
		
		if(B >= 130 && A >= 66) System.out.println("Nice");

		else {
			
			for(int i = 0; i < cnt; i++) {
				A += X[i] * 3;
				B += X[i] * 3;
				score = 6 - X[i];
				
				if(score < Y[i]) B += score * 3;
				else B += Y[i] * 3;
				
			}
			
			if(B >= 130 && A >= 66) System.out.println("Nice");
			else System.out.println("Nae ga wae");
		}
	}
}
