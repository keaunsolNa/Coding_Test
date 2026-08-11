package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Implement19 {

	public static void main(String[] args) throws IOException {
		test03();
	}
	
	
	//  Baseball
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int y = 0;
			int k = 0;
			for(int i = 0; i < 9; i++) {
				
				String input = br.readLine();
				
				y += Integer.parseInt(input.split(" ")[0]);
				k += Integer.parseInt(input.split(" ")[1]);
			}
			
			if(y > k) {
				System.out.println("Yonsei");
			} else if(y < k) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
			
		}
	}
	
	// Big Number
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String zero = "0000 \n0  0 \n0  0 \n0  0 \n0000 \n";
		String one = "   1 \n   1 \n   1 \n   1 \n   1 \n";
		String two = "2222 \n   2 \n2222 \n2    \n2222 \n";
		String three = "3333 \n   3 \n3333 \n   3 \n3333 \n";
		String four ="4  4 \n4  4 \n4444 \n   4 \n   4 \n";
		String five = "5555 \n5    \n5555 \n   5 \n5555 \n";
		String six = "6666 \n6    \n6666 \n6  6 \n6666 \n";
		String seven = "7777 \n   7 \n   7 \n   7 \n   7 \n";
		String eight = "8888 \n8  8 \n8888 \n8  8 \n8888 \n";
		String nine = "9999 \n9  9 \n9999 \n   9 \n   9 \n";
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
			
				case '0' : sb.append(zero); break;
				case '1' : sb.append(one); break;
				case '2' : sb.append(two); break;
				case '3' : sb.append(three); break;
				case '4' : sb.append(four); break;
				case '5' : sb.append(five); break;
				case '6' : sb.append(six); break;
				case '7' : sb.append(seven); break;
				case '8' : sb.append(eight); break;
				case '9' : sb.append(nine); break;
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
		
	}
	
	
}
