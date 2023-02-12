package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement45 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 15784번 - 질투진서
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()) - 1;
		int b = Integer.parseInt(st.nextToken()) - 1;
		
		int[][] seat = new int[N][N];
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) seat[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int jinsea = seat[a][b];
		boolean isAngry = false;
		for(int i = 0; i < N; i++) {
			if(seat[a][i] > jinsea) isAngry = true;
			if(seat[i][b] > jinsea) isAngry = true;
		}
		
		if(isAngry) System.out.println("ANGRY");
		else System.out.println("HAPPY");
		
	}
	
	// 16675번 - 두 개의 손
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int ml;
        int mr;
        int tl;
        int tr;
        
        String[] inputs = br.readLine().split(" ");
        
        ml = "SPR".indexOf(inputs[0]);
        mr = "SPR".indexOf(inputs[1]);
        tl = "SPR".indexOf(inputs[2]);
        tr = "SPR".indexOf(inputs[3]);
        
        if (ml == mr && ((ml + 2) % 3 == tl || (ml + 2) % 3 == tr)) {
        	
            System.out.println("TK");
            
        } else if (tl == tr && ((tl + 2) % 3 == ml || (tl + 2) % 3 == mr)) {
        	
            System.out.println("MS");
            
        } else {
        	
            System.out.println("?");
            
        }
	}
	
	// 1362번 - 펫
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = 1;
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			double o = Integer.parseInt(st.nextToken());
			double w = Integer.parseInt(st.nextToken());
			String emotion = "";
			
			if(o == 0 && w == 0) break;
			
			while(true) {
				
				st = new StringTokenizer(br.readLine());
				
				char order = st.nextToken().charAt(0);
				int input = Integer.parseInt(st.nextToken());
				
				if(order == '#' && input == 0) break;
				
				if(w > 0) {
					if(order == 'E') w -= input;
					else if(order =='F') w += input;
				}
				
			}
			
			if(w < (o * 2) && w > (o * 0.5)) emotion = " :-)";
			else if (w <= 0) emotion =" RIP";
			else emotion = " :-(";
			
			
			sb.append(t + emotion + "\n");
			t++;
		}
		
		System.out.println(sb);
		
	}
	
	// 23292번 - 코딩 바이오리듬
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String time = br.readLine();
		
		int T = Integer.parseInt(br.readLine());
		
		int max = 0;
		String answer = "";
		while(T --> 0) {
			
			String input = br.readLine();
			
			int a = 0;
			int b = 0; 
			int c = 0;
			
			for(int i = 0; i < 4; i++) a += mul(time.charAt(i) - input.charAt(i));
			for(int i = 4; i < 6; i++) b += mul(time.charAt(i) - input.charAt(i));
			for(int i = 6; i < 8; i++) c += mul(time.charAt(i) - input.charAt(i));
			
			int sum = a * b * c;
			
			if(sum > max) {
				max = sum;
				answer = input;
			}
			
			else if(sum == max) 
				if(answer.compareTo(input) > 0) answer = input;
		
		}
	
		System.out.println(answer);
	}
	
	private static int mul(int num) {
		return (int) Math.pow(num, 2);
	}
	
	// 25576번 - 찾았다 악질
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] origin = new int[M];
		
		for(int i = 0; i < M; i++) origin[i] = Integer.parseInt(st.nextToken());
				
				
		int bad = 0;
		for(int j = 0; j < N-1; j++) {
			st = new StringTokenizer(br.readLine());

			int total = 0;
			for(int i = 0; i < M; i++) total += Math.abs(origin[i] - Integer.parseInt(st.nextToken()));
			
			if(total > 2000) bad++;
			
		}
		
		if(bad >= N/2) System.out.println("YES");
		else System.out.println("NO");
		
	}
	
	// 9783번 -Easy Encryption
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			int temp = (int)input.charAt(i);
			
			if(temp >= 65 && temp <= 90) {
				
				sb.append(temp - 38);
				
			}
			else if(temp >= 97 && temp <= 122) {
				
				if(temp - 96 < 10) sb.append("0" + (temp - 96));
				else sb.append(temp - 96);
				
			} else if(temp >= 48 && temp <= 57) {
				
				sb.append("#" + (char)temp);
				
			} else {
				
				sb.append((char)temp);
				
			}
		}
		
		System.out.println(sb);
	}
	
	// 27481번 - Hotelier 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		boolean[] hotel = new boolean[10];
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'L') {
				
				for(int j = 0; j < 10; j++) {
					
					if(hotel[j] == false) {
						hotel[j] = true;
						break;
					}
				}
				
			} else if(input.charAt(i) == 'R') {
				
				for(int j = 9; j >= 0; j--) {
					
					if(hotel[j] == false) {
						hotel[j] = true;
						break;
					}
				}
			} else {
				hotel[Character.getNumericValue(input.charAt(i))] = false;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(hotel[i] == true) System.out.print(1);
			else System.out.print(0);
		}
	}
	
	// 9771번 - Word Searching 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int wordLength = word.length();
		
		String input = "";
		
		int count = 0;
		while((input = br.readLine()) != null) {
			
			if(input.contains(word)) {
				
				int inputLength = input.length();
				input = input.replaceAll(word, "");
				count += (inputLength - input.length()) / wordLength;
				
			} else continue;
		}
		
		System.out.println(count);
	}
	
	// 16676번 - 근우의 다이어리 꾸미기
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		if(n >= 0 && n <= 10) System.out.println(1);
	    
		else {

			int k = 2;
	        
			for(int i = 11; ; i = i * 10 + 1) {
	        
				if(n >= i && n <= i * 10) {
					System.out.println(k);
					break;
				}
				
				k++;
	            
			}
		}
	
	}
	
	// 7572번 - 간지(干支)
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int gan[] = new int[10];
		char zi[] = new char[12];
		
		for(int i = 0; i < 10; i++) gan[i] = i;
		for(int i = 0; i < 12; i++) zi[i] = (char)(i + 65);
		

		System.out.print(zi[(N + 8) % 12]);
		System.out.print(gan[(N + 6) % 10]);
		
	}
}
