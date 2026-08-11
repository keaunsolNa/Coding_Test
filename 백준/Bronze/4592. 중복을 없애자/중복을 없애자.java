import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		while(true) {
			
			String input = br.readLine();
			if(input.equals("0")) break;
			
			st = new StringTokenizer(input);
			
			int N = Integer.parseInt(st.nextToken());
			
			int prev = Integer.parseInt(st.nextToken());
			sb.append(prev + " ");
			for(int i = 1; i < N; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				if(prev != temp) sb.append(temp + " ");
				prev = temp;
				
			}
			
			sb.append("$");
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
