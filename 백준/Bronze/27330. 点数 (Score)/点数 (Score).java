import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for(int i = 0; i < M; i++) arr2[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			
			sum += arr[i];
			
			for(int j = 0; j < M; j++) {
				
				if(sum == arr2[j]) {
					sum = 0;
					break;
				}
			}
		}
		
		System.out.println(sum);
	}
}
