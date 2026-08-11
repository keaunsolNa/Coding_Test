import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		int idx = 0;
		while(N --> 0) {
			
			arr[idx] = Integer.parseInt(br.readLine());
			idx++;
			
		}
		
		int temp = 0;
		for(int i = 1; i < arr[idx - 1]; i++) {
			boolean flag = true;
			
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[j] == i) {
					flag = false;
					continue;
				}
				
			}
			
			if(flag) sb.append(i + "\n");
		}
		
		if(sb.length() == 0) System.out.print("good job");
		else {
			sb.deleteCharAt(sb.length() - 1);
			System.out.print(sb);
		}
	}
}
