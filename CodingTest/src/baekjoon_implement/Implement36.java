package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Implement36 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 11262번 - Minions’ Master
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			
			double[] ap = new double[N];
			double sum = 0;
			
			for(int i = 0; i < N; i++) {
			
				ap[i] = Double.parseDouble(st.nextToken());
				sum += ap[i];
				
			}
			
			double avg = sum / N;
			Arrays.sort(ap);
			
			int p = 0;
			for(int i = N - 1; i >= 0; i--) {
				
				if(ap[i] > avg) p++;
				else break;
				
			}
			
			sb.append(String.format("%.3f", avg));
			sb.append(" ");
			sb.append(String.format("%.3f", (double) p / (double) N * 100.0) + "%");
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	// 21679번 - Клавиатура
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int[] can = new int[N];
		for(int i = 0; i < N; i++) can[i] = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int prese = Integer.parseInt(st.nextToken());
			
			can[prese - 1] -= 1;
		}

		for (int i : can) {
			if(i < 0) sb.append("yes" +"\n");
			else sb.append("no" + "\n");
		}
		
		System.out.println(sb);
	}
	
	// 9299번 - Math Tutoring 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		

		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			sb.append("Case " + i + ": ");
			sb.append(n - 1 + " ");
			
            for (int j = n; j >= 0; j--) {
            	
                int num = Integer.parseInt(st.nextToken());
                if (j == 0) continue;
                sb.append(j * num + " ");
                
            }
            
            sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 10935번 - BASE64 인코딩
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		byte[] testToByte = input.getBytes();
		Encoder encode = Base64.getEncoder();
		byte[] encodeByte = encode.encode(testToByte);
		
        System.out.println(new String(encodeByte));
	}
	
	// 10936번 - BASE64 디코딩
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		byte[] testToByte = input.getBytes();
		Decoder decode = Base64.getDecoder();
		byte[] encodeByte = decode.decode(testToByte);
		
        System.out.println(new String(encodeByte));
	}
	
	// 20017번 - Топот котов
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[][] apart = new int[N][M];
		for(int i = 0; i < N ; i++) {
			
			for(int j = 0; j < M; j++) 
				apart[i][j] = Integer.parseInt(st.nextToken());
		}
		
		long sum = 0;
		for(int i = 1; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				
				if(apart[i - 1][j] * 2 < apart[i][j]) sum+= a;
			}
		}

		System.out.println(sum);
	}
	
	// 6845번 - Federal Voting Age
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String[] birth = br.readLine().split(" ");
			
			int year = Integer.parseInt(birth[0]);
			int month = Integer.parseInt(birth[1]);
			int day = Integer.parseInt(birth[2]);
			
			boolean chk = true;
			if(year == 1989) {
				
				if(month <= 2) {
					
					if(day > 27) chk = false;
					
				} else chk = false;
				
			}  else if(year > 1989) chk = false;
			
			if(chk) sb.append("Yes");
			else sb.append("No");
			
			sb.append("\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 5235번 - Even Sum More Than Odd Sum
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			int even = 0;
			int odd = 0;
			
			for(int i = 0; i < K; i++) {
				int temp = Integer.parseInt(st.nextToken());
				if(temp % 2 == 0) even += temp;
				else odd += temp;
			}
			
			String ans = (even > odd) ? "EVEN" : even < odd ? "ODD" : "TIE";
			
			sb.append(ans + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
	
	// 26145번 - 출제비 재분배
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] pay = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) pay[i] = Integer.parseInt(st.nextToken());
        
        int[] result = new int[n + m];
        
        for (int i = 0; i < n; i++) result[i] = pay[i];
        
        for (int i = 0; i < m; i++) result[i + n] = 0;
        
        for (int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n + m; j++) {
            	
                int tmp = Integer.parseInt(st.nextToken());
                result[i] -= tmp;
                result[j] += tmp;
                
            }
        }
        
        for (int i = 0; i < n + m; i++) 
            System.out.print(result[i] + " ");
	}
	
	// 5292번 - Counting Swann’s Coins
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));

		
		for(int i = 1; i <= N; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) sb.append("DeadMan" + "\n");
			else if(i % 3 == 0) sb.append("Dead" + "\n");
			else if(i % 5 == 0) sb.append("Man" + "\n");
			else sb.append(i + " ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	
	
}
