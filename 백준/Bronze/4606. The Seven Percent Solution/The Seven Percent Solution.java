import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		while(!(input = br.readLine()).equals("#")) {
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < input.length(); i++) {
				
				if(input.charAt(i) == ' ') sb.append("%20"); 
				else if(input.charAt(i) == '!') sb.append("%21"); 
				else if(input.charAt(i) == '$') sb.append("%24"); 
				else if(input.charAt(i) == '%') sb.append("%25"); 
				else if(input.charAt(i) == '(') sb.append("%28"); 
				else if(input.charAt(i) == ')') sb.append("%29"); 
				else if(input.charAt(i) == '*') sb.append("%2a"); 
				else sb.append(input.charAt(i));
				
			}
			
			System.out.println(sb);
		}
	}
}
