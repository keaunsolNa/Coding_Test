import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		char[] arr = new char[N];
		Arrays.fill(arr, '?');
		
		for(int i = 0; i < H; i++) {
			String input = br.readLine();
			
			for(int j = 0; j < N * W; j++) {
				char temp = input.charAt(j);
				
				if (temp == '?') continue;
				else arr[j / W] = temp;
			}
		}
		
		for (char c : arr) {
			System.out.print(c);
		}

	}
}
