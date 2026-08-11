package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement26 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	
	// Koncert 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			double r = 0;
			double g = 0;
			double b = 0;
			for(int j = 0; j < 10; j++) {
				
				st = new StringTokenizer(br.readLine());
				r += Integer.parseInt(st.nextToken());
				g += Integer.parseInt(st.nextToken());
				b += Integer.parseInt(st.nextToken());
				
			}
			
			System.out.println(Math.round(r / 10) + " " + Math.round(g / 10) + " " + Math.round(b / 10));
			
		}

	}
	
	
	// 改元
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			st = new StringTokenizer(input);
			
			String heisei = st.nextToken();
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			
			if(year == 31) {
				if(month >= 5) {
					heisei = "?";
					year -= 30;
				}
			} else if(year > 31) {
				heisei = "?";
				year -= 30;
			}
			
			sb.append(heisei + " " + year + " " + month + " " + day + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	// Divisors
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	int number = Integer.parseInt(br.readLine());

        	int sum = 0;
        	for(int i = 1; i <= number; i++) {
        		if(number % i == 0) sum++;
        	}
        	
        	sb.append(number +" " + sum + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
	
}
