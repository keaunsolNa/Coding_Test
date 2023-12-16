import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] A = new long[3];
		for(int i = 0; i < 3; i++) A[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		long[] B = new long[3];
		for(int i = 0; i < 3; i++) B[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.println((A[0] * B[0]) + (A[1] * B[1]) + (A[2] * B[2]));
	}
}
