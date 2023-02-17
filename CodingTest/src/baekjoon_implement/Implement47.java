package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Implement47 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 2139번 - 나는 너가 살아온 날을 알고 있다
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			if(day == 0 && month == 0 && year == 0) break;
			
			if(month > 2) {
				
				
				switch(month) {
				
					case 3 : ans += 59; break;
					case 4 : ans += 90; break;
					case 5 : ans += 120; break;
					case 6 : ans += 151; break;
					case 7 : ans += 181; break;
					case 8 : ans += 212; break;
					case 9 : ans += 243; break;
					case 10 : ans += 273; break;
					case 11 : ans += 304; break;
					case 12 : ans += 334; break;
					
				}
				
				if(isLeapYear(year)) ans++;
				
			} else if(month == 2) ans += 31;
			
			ans += day;
			
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}
	
	private static boolean isLeapYear(int year) {
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
		
		return false;
	}
	
	// 1173번 - 운동
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int totalTime = -1;
        if (M - m >= T) {
        	
        	totalTime = 0;
            int pulse = m;
            for (int cnt = 0; cnt < N; ) {
            	
                totalTime++;
                
                if (pulse + T <= M) {
                	
                	pulse += T;
                    cnt++;
                    
                } else {
                	
                	pulse -= R;
                    if (pulse < m) pulse = m;
                    
                }
            }
        }

        System.out.print(totalTime);
	}
	
	// 16497번 - 대출 요청
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		int[] date = new int[32];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for(int idx = start; idx < end; idx++) answer = Math.max(++date[idx], answer);
		}
		
		int K = Integer.parseInt(br.readLine());
		
		if(answer <= K) System.out.println(1);
		else System.out.println(0);
	}
	
	// 17478번 - 재귀함수가 뭔가요?
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		String underbar = "";
		sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다." + "\n");
		recur(N, underbar, sb);
		
		System.out.println(sb);
		
	}
	
	private static void recur(int N, String underbar, StringBuilder sb) {
	
		String line = underbar;
		
		if(N == 0) {
			
			sb.append(line + "\"재귀함수가 뭔가요?\"" + "\n");
			sb.append(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"" + "\n");
			sb.append(line + "라고 답변하였지." +"\n");
			return;
			
		}
		
		sb.append(line + "\"재귀함수가 뭔가요?\"" + "\n");
		sb.append(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." + "\n");
		sb.append(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지." + "\n");
		sb.append(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"" + "\n");
		
		underbar += "____";
		
		recur(N - 1, underbar, sb);
		
		sb.append(line + "라고 답변하였지." + "\n");
	}
	
	// 1681번 - 줄 세우기
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int temp = Integer.parseInt(st.nextToken());
		char L = (temp + "").charAt(0);
		
		int idx = 1;
		while(N != 0) {
			
			String str = idx+"";
			boolean chk = true;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == L) chk = false;
			}
			
			if(chk) N--;
			idx++;
		}
		
		System.out.println(idx - 1);
	}
	
	// 25558번 - 내비게이션 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		long N = Long.parseLong(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		long startX = Long.parseLong(st.nextToken());
		long startY = Long.parseLong(st.nextToken());
		long endX = Long.parseLong(st.nextToken());
		long endY = Long.parseLong(st.nextToken());
		
		long min = Integer.MAX_VALUE;
		long ans = 0;
		
		for(int i = 1; i <= N; i++) {
			
			long M = Long.parseLong(br.readLine());
			long dis = 0;
			
			long firstX = startX;
			long firstY = startY;
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				
				long x = Long.parseLong(st.nextToken());
				long y = Long.parseLong(st.nextToken());
				
				dis += Math.abs(x - firstX) + Math.abs(y - firstY);
				firstX = x;
				firstY = y;
				
			}
			
			dis += Math.abs(endX - firstX) + Math.abs(endY - firstY);
			
			if(min > dis) {
				min = dis;
				ans = i;
			}
		}
		
		System.out.println(ans);
		
	}
	
	// 10551번 - STROJOPIS
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Character[] one = new Character[] {'1', 'Q', 'A', 'Z'};
		Character[] two = new Character[] {'2', 'W', 'S', 'X'};
		Character[] three = new Character[] {'3', 'E', 'D', 'C'};
		Character[] four = new Character[] {'4', '5', 'R', 'T', 'F', 'G', 'V', 'B'};
		Character[] five = new Character[] {'6', '7', 'Y', 'U', 'H' , 'J', 'N', 'M'};
		Character[] six = new Character[] {'8', 'I', 'K', ','};
		Character[] eight = new Character[] {'9', 'O', 'L', '.'};
		
		int[] arr = new int[8];
		for(int i = 0; i < input.length(); i++) {
			
			if(Arrays.asList(one).contains(input.charAt(i))) arr[0]++;
			else if(Arrays.asList(two).contains(input.charAt(i))) arr[1]++;
			else if(Arrays.asList(three).contains(input.charAt(i))) arr[2]++;
			else if(Arrays.asList(four).contains(input.charAt(i))) arr[3]++;
			else if(Arrays.asList(five).contains(input.charAt(i))) arr[4]++;
			else if(Arrays.asList(six).contains(input.charAt(i))) arr[5]++;
			else if(Arrays.asList(eight).contains(input.charAt(i))) arr[6]++;
			else arr[7]++;
		}
		
		for (int i : arr) System.out.println(i);
	}
	
	// 9296번 - Grading Exams
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++	) {
			
			int pro = Integer.parseInt(br.readLine());
			
			String input = br.readLine();
			String answer = br.readLine();
			
			int miss = 0;
			for(int j = 0; j < pro; j++) if(input.charAt(j) != answer.charAt(j)) miss++;
			
			
			sb.append("Case " + i + ": " + miss + "\n");
		}
		
		System.out.print(sb);
	}
	
	// 11531번 - ACM 대회 채점
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Integer> wrongAnswer = new HashMap<>();
		long total = 0;
		int cnt = 0;
		while(true) {
			
			String input = br.readLine();
			if(input.equals("-1")) break;
			
			int t = Integer.parseInt(input.split(" ")[0]);
			String q = input.split(" ")[1];
			boolean answer = (input.split(" ")[2].equals("right")) ? true : false;
			
			if(!answer) wrongAnswer.put(q, wrongAnswer.getOrDefault(q, 0) + 1);
			else {
				if(wrongAnswer.containsKey(q)) total += (t + wrongAnswer.get(q) * 20);
				else total += t;
				
				cnt++;
			}
		}
		
		System.out.print(cnt + " " + total);
	}
	
	// 4539번 - 반올림 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		while(N --> 0) {
			
			String number = br.readLine();
			long num = Long.parseLong(number);
			
			int digit = 1;
			double rnd = 1.0;
			while(number.length() >= digit) {
				
				num = (long) (Math.round(num / rnd) * rnd);
				rnd *= 10;
				digit++;
			}
			
		
			System.out.println(num);
		}
	}
	
}
