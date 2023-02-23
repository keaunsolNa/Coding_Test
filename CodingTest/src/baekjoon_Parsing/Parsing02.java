package baekjoon_Parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Parsing02 {

	public static void main(String[] args) throws IOException {
		test07();
	}
	
	// 5177번 - 출력 형식이 잘못되었습니다 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			String A = br.readLine().toLowerCase();
			A = A.replaceAll("\\(|\\{", "[");
			A = A.replaceAll("\\)|\\}" , "]");
			A = A.replaceAll(",", ";");
			A = trim(A);
			A = trim2(A);
			
			String B = br.readLine().toLowerCase();

			B = B.replaceAll("\\(|\\{", "[");
			B = B.replaceAll("\\)|\\}" , "]");
			B = B.replaceAll(",", ";");
			B = trim(B);
			B = trim2(B);
			
			answer.append("Data Set " + (i + 1) + ": ");
			if(A.equals(B)) answer.append("equal");
			else answer.append("not equal");
			
			answer.append("\n");
			answer.append("\n");
			
		}
	
		answer.deleteCharAt(answer.length() - 1);
		answer.deleteCharAt(answer.length() - 1);
		System.out.print(answer);
	}
	
	private static String trim(String str){
	
		StringBuilder sb = new StringBuilder();
		int i;
		int n = str.length();
		char ch;
		
		for(i = 0; i < n;) {
			
			sb.append(ch = str.charAt(i++));
			if(ch==' ') while(i < n && str.charAt(i)==' ') i++; 
			
		}
		
		return sb.toString();
	}
	
	private static String trim2(String str){
		
		StringBuilder sb = new StringBuilder(str);
		int i;
		int idx;
		int n = sb.length();
		char ch;
		
		for(i = 0; i < n; i++) {
			
			ch = sb.charAt(i);
			if(ch == '[' || ch == ']' || ch == ';' || ch == '.' || ch == ':') {

				idx = i - 1;
				
				if((0 <= idx && idx < n) && str.charAt(idx) == ' ') sb.replace(idx, idx + 1, "*");
				
				idx = i + 1;
				
				if((0 <= idx && idx < n) && str.charAt(idx) == ' ') sb.replace(idx, idx + 1, "*");
				
			}
		}
		
		return sb.toString().replaceAll("\\*", ""); 
	}
	
	// 7656번 - 만능 오라클
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        Pattern pattern = Pattern.compile("What");
        
        String[] questions = pattern.split(input);
        
        for (String question : questions) {
        	
            if (question.contains("?")) {
            	
                int endIndex = question.indexOf("?");
                String questionText = question.substring(0, endIndex);
                System.out.println("Forty-two" + questionText + ".");
                
            }
        }
	}
	
	// 3005번 - 크로스워드 퍼즐 쳐다보기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[R][C];
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < R; i++) {
			
			String input = br.readLine();
			String str = "";
			for(int j = 0; j < C; j++) {
				
				char temp = input.charAt(j);
				map[i][j] = temp;
				if(temp != '#') str += temp;
				else {
					
					if(str.length() > 1) strList.add(str);
					str = "";
				}
				
			}
			
			if(str.length() > 1) strList.add(str);
		}

		
		for(int i = 0; i < C; i++) {
			
			String str = "";
			for(int j = 0; j < R; j++) {
				
				if(map[j][i] != '#') str += map[j][i];
				else {
					
					if(str.length() > 1) strList.add(str);
					str = "";
				}
				
			}
		
			if(str.length() > 1) strList.add(str);
		}
		
		Collections.sort(strList);
		
		System.out.println(strList.get(0));
	}
	
	// 1706번 - 크로스워드
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[R][C];
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < R; i++) {
			
			String input = br.readLine();
			String str = "";
			for(int j = 0; j < C; j++) {
				
				char temp = input.charAt(j);
				map[i][j] = temp;
				if(temp != '#') str += temp;
				else {
					
					if(str.length() > 1) strList.add(str);
					str = "";
				}
				
			}
			
			if(str.length() > 1) strList.add(str);
		}

		
		for(int i = 0; i < C; i++) {
			
			String str = "";
			for(int j = 0; j < R; j++) {
				
				if(map[j][i] != '#') str += map[j][i];
				else {
					
					if(str.length() > 1) strList.add(str);
					str = "";
				}
				
			}
		
			if(str.length() > 1) strList.add(str);
		}
		
		Collections.sort(strList);
		
		System.out.println(strList.get(0));
	}
	
	// 15482번 - 한글 LCS
	private static Integer[][] dp;
	private static char[] word;
	private static char[] word2;
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine().toCharArray();
		word2 = br.readLine().toCharArray();
		
		dp = new Integer[word.length][word2.length];

		System.out.println(lcs(word.length - 1, word2.length - 1));
		
	}
	
	private static int lcs(int x, int y) {
		if(x == -1 || y == -1) return 0;
 
		if(dp[x][y] == null) {
			dp[x][y] = 0;
 
			if(word[x] == word2[y]) dp[x][y] = lcs(x - 1, y - 1) + 1;
 
			else dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
		}
		
		return dp[x][y];
	}
	
	// 11145번 - Is it a Number?
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			
			while(input.startsWith(" ")) input = input.substring(1, input.length());
			while(input.endsWith(" ")) input = input.substring(0, input.length() - 1);
			
			if(input.length() == 0) sb.append("invalid input");
			else if(input.matches("^[0-9]*$")) sb.append(new BigInteger(input));
			else sb.append("invalid input");
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 4836번 - 춤
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while((input = br.readLine()) != null) {
			
			String[] dance = input.split(" ");
			boolean[] fault = new boolean[5];
			List<String> danceList = new LinkedList<>();
			
			if(dance[0].equals("jiggle")) fault[3] = true;
			danceList.add(dance[0]);
			
			for(int i = 1; i < dance.length; i++) {
				
				
				if(dance[i].equals("dip")) {
					
					if(i > 0 && !danceList.get(i - 1).equals("jiggle")) {
						dance[i] = "DIP";
						fault[0] = true;
					}
					
					if(i > 1 && !danceList.get(i - 2).equals("jiggle")) {
						dance[i] = "DIP";
						fault[0] = true;
					}
					
				}
				
				if(dance[i].equals("twirl")) 
					if(!danceList.contains("hop")) 
						fault[2] = true;
					else fault[2] = false;
				
				if(dance[i].equals("hop")) 
					if(!danceList.contains("twirl")) 
						fault[2] = true;
					else fault[2] = false;
				
				danceList.add(dance[i]);
			}
			
			if(fault[0]) 
				if(danceList.contains("twirl")) 
					fault[0] = false;
			
				else 
					for(int i = 0; i < dance.length; i++) if(dance[i].equals("dip")) dance[i] = "DIP";
			
			if(!danceList.contains("dip")) fault[4] = true;
			
			if(dance.length < 3 || !(danceList.get(dance.length - 1).equals("clap") 
								&& danceList.get(dance.length - 2).equals("stomp") 
								&& danceList.get(dance.length - 3).equals("clap")))
				fault[1] = true;

			
			List<Integer> faultList = new ArrayList<>();
			for(int i = 0 ; i < 5; i ++) if(fault[i]) faultList.add(i + 1);
			
			if(faultList.size() == 0) sb.append("form ok: " + input + "\n");

			else if(faultList.size() == 1) {
				
				sb.append("form error 1: ");
				for(int i = 0; i < dance.length; i++) sb.append(dance[i] + " ");
				sb.append("\n");
			}
			else {
				
				sb.append("form errors ");
				
				for(int i = 0; i < faultList.size() - 1; i++)  sb.append(faultList.get(i) + " and ");
				sb.append(faultList.get(faultList.size() - 1) + ": ");
				
				for(int i = 0; i < dance.length; i++) sb.append(dance[i] + " ");
				sb.append("\n");
				
			}
		} 
		
		System.out.println(sb);
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
	}

	
}
