package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Implement29 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	// Speed Limit 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int input = -2;
		
		while((input = Integer.parseInt(br.readLine())) != -1) {
			
			st = new StringTokenizer(br.readLine());
			int speed = Integer.parseInt(st.nextToken());
			int prevMile = Integer.parseInt(st.nextToken());
			long total = speed * prevMile;
			
			for(int i = 1; i < input; i++) {
				
				st = new StringTokenizer(br.readLine());
				speed = Integer.parseInt(st.nextToken());
				int mile = Integer.parseInt(st.nextToken());
				
				total += ((mile - prevMile) * speed);
				prevMile = mile;
			}
			
			sb.append(total + " miles" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	// Монетки 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int front = 0;
		int back = 0;
		while(T --> 0) {
			int coin = Integer.parseInt(br.readLine());
			
			front += (coin == 1) ? 1 : 0;
			back += (coin == 0) ? 1 : 0;
			
		}
		
		System.out.println(Math.min(front, back));
	}
	
	
}
