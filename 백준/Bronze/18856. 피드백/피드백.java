import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		sb.append(N + "\n");
		
		int[] arr = new int[N];
		arr[0] = 1;
		arr[1] = 2;
		arr[N - 1] = 997;
		
		for(int i = 1; i < N; i++) 
			if(arr[i] == 0) arr[i] = arr[i - 1] + 1;
		
		for (int i : arr) sb.append(i + " ");
		
		System.out.println(sb);
	}
}
