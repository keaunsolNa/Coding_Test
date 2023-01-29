package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class Implement40 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 24803번 - Provinces and Gold
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int gold = Integer.parseInt(st.nextToken());
		int silver = Integer.parseInt(st.nextToken());
		int bronze = Integer.parseInt(st.nextToken());
		
		int cost = (gold * 6) + (silver * 3);
		int bp = (gold * 3) + (silver * 2) + bronze;
		
		
		if(bp >= 8) sb.append("Province or Gold");
		else if(bp >= 6) sb.append("Duchy or Gold");
		else if(bp >= 5) sb.append("Duchy or Silver");
		else if(bp >= 3) sb.append("Estate or Silver");
		else if(bp >= 2) sb.append("Estate or Copper");
		else sb.append("Copper");
			
		
		System.out.println(sb);
		
	}
	
	// 27326번 - 二人三脚 (Three-Legged Race) 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[T];
		
		for(int i = 0; i < 2 * T - 1; i++) {
			int a = Integer.parseInt(st.nextToken()) - 1;
			
			if(arr[a]) arr[a] = false;
			else arr[a] = true;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == true) {
				System.out.println(i + 1);
				break;
			}
		}
		
	}
	
	// 27329번 - 繰り返し文字列 (Repeating String) 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		
		int start = 0;
		int last = input.length();
		int mid = 0;
		
		if(T % 2 == 0) mid = (start + last) / 2;
		else mid = (start + last) / 2;
		
			
		if(input.substring(start, mid).equals(input.substring(last - mid, last))) {
			System.out.println("Yes");
			return;
		}
	
		System.out.println("No");
	}
	
	// 27334번 - マラソン大会 (Marathon Race) 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[T];
		for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int[] clone = arr.clone();
		
		Arrays.sort(clone);
		
		for(int i = 0; i < T; i++) {
			
			for(int j = 0; j < T; j++) {
				if(arr[i] == clone[j]) {
					System.out.println(j + 1);
					break;
				}
				
			}
		}
	}
	
	// 27331번 - 2 桁の整数 (Two-digit Integer) 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		String B = br.readLine();
		
		System.out.println(A+B);
	}
	
	// 27333번 - JOI エディタ (JOI Editor) 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		input = input.replaceAll("jj", "JJ");
		input = input.replaceAll("oo", "OO");
		input = input.replaceAll("ii", "II");
		
		
		System.out.println(input);
	}
	
	// 22123번 - Экзамен
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			String F = st.nextToken();
			
			int K = Integer.parseInt(st.nextToken());
			
			try {
				
				Date date1 = sdf.parse(S);
				Date date2 = sdf.parse(F);
				
	    		long timeMil1 = date1.getTime();
	    		long timeMil2 = date2.getTime();

	    		long diff = timeMil2 - timeMil1;
	    		
	    		long diffSec = diff / 1000;
	    		
	    		if(diffSec <= 0) diffSec += 86400;
	    		K *= 60;
	    		
	    		if(diffSec >= K) System.out.println("Perfect");
	    		else if(diffSec + 3600 >= K) System.out.println("Test");
	    		else System.out.println("Fail");
	    		
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 25830번 - Microwave Mishap
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String[] input = br.readLine().split(":");
		
		int M = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		
		int S1 = (M * 3600) + (S * 60);
		int S2 = S + (M * 60);
		
		int T = S1 - S2;
		
		int min = T / 60;
		int hour = min / 60;
		int sec = T  % 60;
		min = min % 60;
		
		String ans = "";
		if(hour < 10) ans += ("0" + hour);
		else ans += hour + "";
		
		if(min < 10) ans += (":0" + min);
		else ans += ":" + min;
		
		if(sec < 10) ans += (":0" + sec);
		else ans += ":" + sec;
		
		System.out.println(ans);
	}
	
	// 27330번 - 点数 (Score)
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[M];
		for(int i = 0; i < M; i++) arr2[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			
			sum += arr[i];
			
			for(int j = 0; j < M; j++) {
				
				if(sum == arr2[j]) {
					sum = 0;
					break;
				}
			}
		}
		
		System.out.println(sum);
	}
	
	// 15179번 - Golf Croquet 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String team1 = br.readLine();
		String team2 = br.readLine();
		
		int S = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		int team1S = 0;
		int team2S = 0;

		for(int i = 0; i < S; i++) {
			
			char temp = input.charAt(i);
			
			if(i % 2 == 0) {
				
				team1S += (temp == 'H') ? 1 : 0;
				team1S += (temp == 'D') ? (team1S == 6) ? 1 : 2 : 0;
				team2S += (temp == 'O') ? 1 : 0;
			}
			
			else {
				
				team2S += (temp == 'H') ? 1 : 0;
				team2S += (temp == 'D') ? (team2S == 6) ? 1 : 2 : 0;
				team1S += (temp == 'O') ? 1 : 0;
				
			}
			
			if(team1S >= 7 || team2S >= 7) break;
			
		}
		
		
		System.out.print(team1 + " " + team1S + " " + team2 + " " + team2S + ". ");
		if(team1S >= 7) System.out.println(team1 + " has won.");
		else if(team2S >= 7) System.out.println(team2 + " has won.");
		else if(team1S > team2S) System.out.print(team1 + " is winning.");
		else if(team1S < team2S) System.out.println(team2 + " is winning.");
		else System.out.println("All square.");
	}
	
	
}
