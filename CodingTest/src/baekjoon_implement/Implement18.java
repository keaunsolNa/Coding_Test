package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Implement18 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Who is in the middle? 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
	}
	
	// Pyramids 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = 0;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			
			input++;
			int pyramids = 0;
			while(input --> 0) {
				pyramids += input;
			}
			
			System.out.println(pyramids);
		}
	}
	
	// Copier
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int a = Integer.parseInt(br.readLine());
			System.out.println(a + " " + a);
		}
		
	}
	
	// Gum Gum for Jay Jay
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cnt = 0;
		while((input = br.readLine()) != null) cnt++;
		System.out.println(cnt);
	}
	
	// Mathematics 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int total = 0;
		while(T --> 0) total += Integer.parseInt(br.readLine());
		
		System.out.println(total);
	}
	
	
	// Hook 
	public static void test06() throws IOException {
		System.out.print("#  # #### #### #  #\n"
				+ "#### #  # #  # # #\n"
				+ "#### #  # #  # # #\n"
				+ "#  # #### #### #  #");
	}

	// Fill the Rowboats! 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			if(i%6 == 0) {
				sb.append(i).append(" Go! ");
			} else if(i == N) {
				sb.append(i);
				sb.append(" Go!");
			} else {
				sb.append(i).append(" ");
			}
			
			if(i == N) {
			}
		}
		System.out.println(sb);
	}
	
	// Reverse 
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	String input = br.readLine();
        	String text = input.split(" ")[0];
        	int start = Integer.parseInt(input.split(" ")[1]);
        	int end = Integer.parseInt(input.split(" ")[2]);
        	
        	text = text.substring(0, start) + text.substring(end, text.length());
        	System.out.println(text);
        }
        
	}
	
	// Simple Sum
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[2]);
        int c = Integer.parseInt(input.split(" ")[4]);
        
        if(a + b == c) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
	}
	
	// Dedupe
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			StringBuilder sb = new StringBuilder();
			List<Character> list = new ArrayList<>();
			list.add(input.charAt(0));
			for(int i = 1; i < input.length(); i++) {
				if(input.charAt(i) != list.get(list.size()-1)) {
					list.add(input.charAt(i));
				}
			}
			
			for (Character character : list) System.out.print(character);
			
			System.out.println();
		}
	}
	
	
}
