import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 1; i <= N; i++) arr[i - 1] = i;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < R; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			arr[temp - 1] = 0;
		}
		
		for(int i = 0; i < N; i++) {
			
			if(arr[i] != 0) sb.append(arr[i] +" ");
		}
		
		if(sb.length() == 0) System.out.println("*");
		else System.out.println(sb);
	}
}
