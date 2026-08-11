import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int idx = 1;
		while(true) {
			
			int T = Integer.parseInt(br.readLine());
			
			if(T == 0) break;
			
			String[] name = new String[T];
			for(int i = 0; i < T; i++) name[i] = br.readLine();
			
			int[] arr = new int[T];
			for(int i = 0; i < 2 * T - 1; i++) {
				
				st = new StringTokenizer(br.readLine());
				arr[Integer.parseInt(st.nextToken()) - 1] ++;
				
			}
			
			for(int i = 0; i < T; i++) 
				if(arr[i] != 2) sb.append(idx + " " + name[i] + "\n");
			
			idx++;
		}
		
		System.out.print(sb);
	}
}
