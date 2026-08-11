import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[] time = new int[101];
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int j = start; j < end; j++) {
				time[j]++;
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			
			if(time[i] == 1) sum += time[i] * A;
			else if(time[i] == 2) sum += time[i] * B;
			else if(time[i] == 3) sum += time[i] * C;
		}
		
		System.out.println(sum);
		
	}
}
