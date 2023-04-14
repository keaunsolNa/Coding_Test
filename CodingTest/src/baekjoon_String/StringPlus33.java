package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class StringPlus33 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// 5103번 - DVDs
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		while(true) {
			
			String video = br.readLine();
			if(video.equals("#")) break;
			
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			
			int T = Integer.parseInt(br.readLine());
			
			while(T --> 0) {
				
				st = new StringTokenizer(br.readLine());
				
				char order = st.nextToken().charAt(0);
				int value = Integer.parseInt(st.nextToken());
				
				switch(order) {
					
					case 'S' : S = Math.max(0, S - value); break;
					case 'R' : S = Math.min(M, S + value); break;
					
				}
			}
			
			sb.append(video + " " + S + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 5603번 - 問題2
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(br.readLine());
		StringBuilder tempStr = new StringBuilder();
		
		while(T --> 0) {
			char[] temp = sb.toString().toCharArray();
			
			int cnt = 1;
			char target = temp[0];
			for(int i = 1; i < temp.length; i++) {
				if(target == temp[i]) {
					cnt++;
				}
				else {
					tempStr.append(cnt).append(target);
					target = temp[i];
					cnt = 1;
				}
			}
			
			tempStr.append(cnt).append(target);
			sb.setLength(0);
			sb.append(tempStr);
			tempStr.setLength(0);
		}
		
		System.out.println(sb);
		
	}
	
	// 20114번 - 미아 노트
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		char[] arr = new char[N];
		Arrays.fill(arr, '?');
		
		for(int i = 0; i < H; i++) {
			String input = br.readLine();
			
			for(int j = 0; j < N * W; j++) {
				char temp = input.charAt(j);
				
				if (temp == '?') continue;
				else arr[j / W] = temp;
			}
		}
		
		for (char c : arr) {
			System.out.print(c);
		}

	}
	
	// 21966번 - (중략)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		if(N <= 25) {
			System.out.println(input);
			System.exit(0);
		}
		
		String sub = input.substring(12, N - 12);

		if(!sub.contains(".")) 
			System.out.println(input.substring(0, 11) + "..." + input.substring(N - 11, N));
		else 
			System.out.println(input.substring(0, 9) + "......" + input.substring(N - 10));
		
	}

	// 9081번 - 단어 맞추기
	public static void test05() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	
            char [] word = br.readLine().toCharArray();
            int index= - 1; 
            int index2 = 0;
            char temp;
        
            for(int j = word.length - 1; j > 0; j--) {
                if(word[j - 1] < word[j]) {
                	index = j - 1; 
                	break;
                }
            }
            
            if(index == -1) {
            	for(int j = 0; j < word.length; j++) sb.append(word[j]);
            	sb.append("\n");
            }
            
            else {
            	
                for(int j = word.length - 1; j >= 0; j--) {
                    if(word[index] < word[j]) {
                        index2 = j; 
                        break;
                    }
                }
                
                temp = word[index];
                word[index] = word[index2];
                word[index2] = temp;
                
                Arrays.sort(word, index+1, word.length);
                
                for(int j = 0; j < word.length; j++) sb.append(word[j]);
                
                sb.append("\n");
            }
            
        }
        System.out.print(sb);
	}
	
	// 1283번 - 단축키 지정
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] isUse = new boolean[26];
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			String str = br.readLine();
			boolean flag = true;
			boolean use = false;
			for(int i = 0; i < str.length(); i++) {
				
				if(i == 0 || str.charAt(i - 1) == 32) {
					
					int temp = str.charAt(i);
					if(temp >= 97) temp -= 32;
					
					if(!isUse[temp - 'A']) {
						
						isUse[temp - 'A'] = true;
						flag = false;
						use = true;
						
						for(int j = 0; j < str.length(); j++) {
							if(j != i) sb.append(str.charAt(j));
							else sb.append("["+str.charAt(j)+"]");
						}
						
						break;
						
					}
				}
			}
			
			if(flag) {
				
				for(int i = 0; i < str.length(); i++) {
					
					if(str.charAt(i) == 32) continue;
					int temp = str.charAt(i);
					if(temp >= 97) temp -= 32;
					
					if(!isUse[temp - 'A']) {
						
						isUse[temp - 'A'] = true;
						flag = false;
						use = true;
						
						for(int j = 0; j < str.length(); j++) {
							if(j != i) sb.append(str.charAt(j));
							else sb.append("["+str.charAt(j)+"]");
						}
						break;
						
					}
				}
			}
			
			if(!use) sb.append(str);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 27930 - 당신은 운명을 믿나요? 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
        String ans1 = "KOREA";
        String ans2 = "YONSEI";
		int idx1 = 0;
		int idx2 = 0;
		
        for (char ch : input.toCharArray()) {
            if (ch == ans1.charAt(idx1)) ++idx1;
            if (ch == ans2.charAt(idx2)) ++idx2;
           
            if (idx1 == ans1.length()) {
            	
                System.out.print(ans1);
                return;
                
            } else if (idx2 == ans2.length()) {
            	
                System.out.print(ans2);
                return;
                
            }
        }
		
	}
	
	// 2596번 - 비밀편지
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int idx = 0;
		char[][] arr = new char[T][6];
		for(int i = 0; i < T; i++) {
			
			for(int j = 0; j < 6; j++) {
				arr[i][j] = input.charAt(idx++);
			}
		}
		
		idx = 1;
		String A = "000000";
		String B = "001111";
		String C = "010011";
		String D = "011100";
		String E = "100110";
		String F = "101001";
		String G = "110101";
		String H = "111010";
		
		for (char[] cs : arr) {
			
			StringBuilder temp = new StringBuilder();
			for(int i = 0; i < 6; i++) temp.append(cs[i]);
			
			
			if(check(temp.toString(), A)) answer.append("A");
			else if(check(temp.toString(), B)) answer.append("B");
			else if(check(temp.toString(), C)) answer.append("C");
			else if(check(temp.toString(), D)) answer.append("D");
			else if(check(temp.toString(), E)) answer.append("E");
			else if(check(temp.toString(), F)) answer.append("F");
			else if(check(temp.toString(), G)) answer.append("G");
			else if(check(temp.toString(), H)) answer.append("H");
			
			else {
				
				boolean flag = true;
				for(int i = 0; i < 6; i++) {
					
					temp.replace(i, i+1, temp.charAt(i) == '0' ? "1" : "0");
					
					if(check(temp.toString(), A)) { answer.append("A"); flag = false; break; }
					else if(check(temp.toString(), B)) { answer.append("B"); flag = false; break; }
					else if(check(temp.toString(), C)) { answer.append("C"); flag = false; break; }
					else if(check(temp.toString(), D)) { answer.append("D"); flag = false; break; }
					else if(check(temp.toString(), E)) { answer.append("E"); flag = false; break; }
					else if(check(temp.toString(), F)) { answer.append("F"); flag = false; break; }
					else if(check(temp.toString(), G)) { answer.append("G"); flag = false; break; }
					else if(check(temp.toString(), H)) { answer.append("H"); flag = false; break; }
					
					else temp.replace(i, i+1, temp.charAt(i) == '0' ? "1" : "0") ;
				}
				
				if(flag) { System.out.println(idx); System.exit(0); }
					
			}
			idx++;
		}
		
		System.out.println(answer);
	}
	
	private static boolean check(String target, String check) {
		
		return target.equals(check) ? true : false;
	}
	
	// 27885번 - 가희와 열리지 않는 건널목
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[] totalTime = new boolean[86400];
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			int time = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
			
			for(int t = time; t < time + 40; t++) totalTime[t] = true;
			
		}
		
		for(int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			int time = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
			
			for(int t = time; t < time + 40; t++) totalTime[t] = true;
			
		}
		
		int ans = 86400;
		for(int i = 0; i < 86400; i++) if(totalTime[i]) ans--;
		
		System.out.println(ans);
	}
	
	// 1755qjs - 숫자놀이
	public static void test10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<Word> list = new ArrayList<Word>();
        
        for(int i = M; i <= N; i++) {
        	
        	StringBuilder sb = new StringBuilder();
        	char[] temp = Integer.toString(i).toCharArray();
        	for(int j = 0; j < temp.length; j++) sb.append(word[temp[j] - '0']+ " ");
        	list.add(new Word(sb.toString(),i));
        }
        
        Collections.sort(list);
        
        int n = 0;
        for(Word words : list) {
        	
        	System.out.print(words.num+" ");
        	n++;
        	if(n%10==0) System.out.println();;
        }
		
	}
	
	private static class Word implements Comparable<Word>{
		int num;
		String str;
		
		Word(String str, int num){
			this.num = num;
			this.str = str;
		}
		
		@Override
		public int compareTo(Word o) {
			return this.str.compareTo(o.str);
		}
		
	}
	
}
