import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] length = new long[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) length[i] = Integer.parseInt(st.nextToken());
			
		long[] pay = new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) pay[i] = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		long minPay = pay[0];
		
		for(int i = 0; i < N - 1; i++) {
			
			if(pay[i] < minPay) minPay = pay[i];
			
			sum += (minPay * length[i]);
		}
		
		System.out.println(sum);
	}
}
