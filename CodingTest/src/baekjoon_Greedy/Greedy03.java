package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Greedy03 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Pen Pineapple Apple Pen
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String input = br.readLine().replaceAll("pPAp", "");
		
		System.out.println((T - input.length()) / 4);
	}
	
	// 반복
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int cnt = 1;
		char cur = input.charAt(0);
		
		for (int i = 1; i < input.length(); i++) {
			char next = input.charAt(i);
			if(next - 'a' <= cur - 'a') cnt++;
			cur = next;
		}
		
		System.out.println(cnt);
	}
	
	//  가위 바위 보
	private static int totalWin;
	private static int roundWin;
	private static int maxWin;
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		String sangen = br.readLine();
		
		int N = Integer.parseInt(br.readLine());
		String[] friend = new String[N];
		for(int i = 0; i < N; i++) friend[i] = br.readLine();
		
		totalWin = 0;
		maxWin = 0;
		
		for(int i = 0; i < R; i++) {
			
			char rsp = sangen.charAt(i);
			int r = 0;
			int s = 0;
			int p = 0;
			for(int j = 0; j < N; j++) {
				
				char frsp = friend[j].charAt(i);
				totalWin += rcp(rsp, frsp);
				r += rcp('R', frsp);
				s += rcp('S', frsp);
				p += rcp('P', frsp);
			}
			
			maxWin += Math.max(Math.max(r, s), p);
		}
			
		System.out.println(totalWin);
		System.out.println(maxWin);
	}

	private static int rcp(char sangen, char friend) {
		roundWin = 0;
		switch(friend) {
		
			case 'S' : roundWin += sangen == 'S' ? 1 : sangen == 'R' ? 2 : 0; break; 
				
			case 'R' : roundWin += sangen == 'R' ? 1 : sangen == 'P' ? 2 : 0; break; 
				
			case 'P' : roundWin += sangen == 'P' ? 1 : sangen == 'S' ? 2 : 0; break; 
		}
		
		return roundWin;
	}
	
	// 카약과 강풍
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		boolean[] broken = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < S; i++) 
			broken[Integer.parseInt(st.nextToken()) - 1] = true;

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < R; i++) {
			
			int target = Integer.parseInt(st.nextToken()) - 1;
			
			if(broken[target]) broken[target] = false;
			else {
				if(target != 0 && target != N - 1) {
					if(broken[target - 1]) broken[target - 1] = false;
					else broken[target + 1] = false;
				}
				else if(target == 0) broken[target + 1] = false;
				else if(target == N- 1) broken[target - 1] = false;
			}
		}
		
		int cnt = 0;
		for (boolean b : broken) 
			if(b) cnt++;
		
		System.out.println(cnt);
	}
    
	// Meditation
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] point = new int[n];
		for(int i = 0; i < n; i++)
			point[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(point);
		
		int sum = 0;
		for(int i = point.length - 1; i > point.length - k - 1; i--) 
			sum += point[i];
		
		System.out.println(sum);
	}
	
	// 등수 매기기
	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] grade = new int[N];
		
		for(int i = 0; i < N; i++) grade[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(grade);
		
		long sum = 0;
		for(int i = 0; i < N; i++) 
			sum += Math.abs(grade[i] - (i+1));

		System.out.println(sum);

	}

	// 수리공 항승
	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		if(L == 1) {
			System.out.println(N);
			return;
		}
		
		int[] needPix = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) needPix[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(needPix);
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			
			int start = needPix[i];
			while(true) {
				if(i+1 == N) break;
				
				if(needPix[i+1] - start + 1 <= L) {
					i++;
				} else break;
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
	}

	// Yonsei TOTO
	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] need = new int[n];
        for(int i = 0; i < n; i++) {

        	st = new StringTokenizer(br.readLine());
        	int P = Integer.parseInt(st.nextToken());
        	int L = Integer.parseInt(st.nextToken());
        	
        	Integer[] find = new Integer[P];
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < P; j++) find[j] = Integer.parseInt(st.nextToken());
        	
        	Arrays.sort(find, Collections.reverseOrder());
        	
        	if(P >= L) need[i] = find[L - 1];
        	else if(P < L) need[i] = 1;
        }
        
        Arrays.sort(need);
        
        int ans = 0;
        for(int i = 0; i < need.length; i++) {
        	if(m - need[i] >= 0) {
        		ans++;
        		m -= need[i];
        	}
        }
        
        System.out.println(ans);
	}

	// 1 빼기
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int ans = 0;
		
		while(N != "0") {
			
			if(N.contains("1")) {
				if(N.equals("1")) {
					ans++;
					break;
				}
				else 
					N = Integer.parseInt(N.replaceFirst("1", "")) + "";
				
					if(N.equals("0")) {
						ans++; break;
					}
			} else 
				N = (Integer.parseInt(N) - 1) + "";
			
			ans++;
		}
		
		System.out.println(ans);
	}
	
	// 호 안에 수류탄이야!!
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dot = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) dot[i] = Integer.parseInt(st.nextToken());
		
		if(N == 1) {
			System.out.print("권병장님, 중대장님이 찾으십니다");
			return;
		}
		int[] range = new int[N-1];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) range[i] = Integer.parseInt(st.nextToken());
		
		long maxRange = 0;
		
		for(int i = 0; i < N - 1; i++) {
			
			maxRange = Math.max(maxRange, dot[i] + range[i]);
			
			if(maxRange >= dot[i + 1]) continue;
			else {
				System.out.print("엄마 나 전역 늦어질 것 같아"); return;
			}
		}
		
		System.out.print("권병장님, 중대장님이 찾으십니다");
	}
	
	
}