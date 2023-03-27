package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Implement52 {
    
	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 27889번 - 특별한 학교 이름
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		switch(br.readLine()) {
		
			case "NLCS" : System.out.println("North London Collegiate School"); break;
			case "BHA" : System.out.println("Branksome Hall Asia"); break;
			case "KIS" : System.out.println("Korea International School"); break;
			case "SJA" : System.out.println("St. Johnsbury Academy"); break;
		
		}
        
	}
	
	// 27918번 - 탁구 경기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int D = 0;
		int P = 0;
		while(N --> 0) {
			
			char temp = br.readLine().charAt(0);
			
			if(temp == 'D') D++;
			else P++;
			
			if(Math.abs(D - P) >= 2) break;
			
		}
		
		System.out.println(D + ":" + P);
	}
	
	// 18228번 - 펭귄추락대책위원회
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		List<Integer> prevList = new ArrayList<>();
		List<Integer> nextList = new ArrayList<>();

		boolean isPrev = true;
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp == -1) {
				isPrev = false;
				continue;
			}
			
			if(isPrev) prevList.add(temp);
			else nextList.add(temp);
			
		}
		
		Collections.sort(prevList);
		Collections.sort(nextList);

		System.out.println(prevList.get(0) + nextList.get(0));
	}
	
	// 5343번 - Parity Bit
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			String input = br.readLine();
			int ans = 0;
			
			int len = input.length();
			int count = 0;

			for(int j = 0; j < len / 8; j++) {
				
				for(int i = 0; i < 8; i++) {
					
					if(i != 7) {
						if(input.charAt(j * 8 + i) == '1') count++;
					}
					
					else if(i == 7) { 
						
						if(count % 2 == 0 && input.charAt(j * 8 + i) == '1') ans++;
						else if(count % 2 == 1 && input.charAt(j * 8 + i) == '0') ans++;
						
						count = 0;
					}
					
				}
			}
			System.out.println(ans);
		}
	}
	
	// 1855번 - 암호
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int len = str.length();
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < len / k; j++) {
				sb.append(str.charAt(j % 2 == 0 ? j * k + i : j * k + k - 1 - i));
			}
		}
		
		System.out.println(sb);
	}
	
	// 16019번 - Are we there yet?
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int[] city = new int[5];
		
		city[0] = 0;
		city[1] = Integer.parseInt(st.nextToken());
		city[2] = Integer.parseInt(st.nextToken());
		city[3] = Integer.parseInt(st.nextToken());
		city[4] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 5; i++) {
			
			if(i != 0) {
				int temp = city[i];
				city[i] = city[i - 1];
				city[i - 1] = temp;
			}
			
			int middle = 0;
			for(int j = 0; j < 5; j++) {
				if(city[j] == 0) middle = j;
			}
			
			int[] ans = new int[5];
			for(int j = middle - 1; j >= 0; j--) {
				
				ans[j] += (city[j] + ans[j + 1]);
			}
			
			for(int j = middle + 1; j < 5; j++) {
				
				ans[j] += (city[j] + ans[j - 1]);
			}
			
			for (int j : ans) {
				System.out.print(j +" ");
			}
			
			System.out.println();
		}
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		
	}
	
	
}
