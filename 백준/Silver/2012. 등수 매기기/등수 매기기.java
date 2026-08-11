import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] grade = new int[N];
		
		for(int i = 0; i < N; i++) grade[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(grade);
		
		long sum = 0;
		for(int i = 0; i < N; i++) 
			sum += Math.abs(grade[i] - (i+1));

		System.out.println(sum);

	}
}
