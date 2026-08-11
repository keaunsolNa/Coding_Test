package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus20 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	
	// 해밍 거리
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String A = br.readLine();
			String B = br.readLine();
			String answer = "Hamming distance is ";
			int chk = 0;
			for(int i = 0; i < A.length(); i++) {
				
				if(A.charAt(i) != B.charAt(i)) chk++;
			}
			
			answer += chk + ".";
			
			System.out.println(answer);
		}
		
	}
	

    // Ресторан
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++) {
        	
        	switch(input.charAt(i)) {
        		case 'B' : sb.append("v"); break;
        		case 'E' : sb.append("ye"); break;
        		case 'H' : sb.append("n"); break;
        		case 'P' : sb.append("r"); break;
        		case 'C' : sb.append("s"); break;
        		case 'Y' : sb.append("u"); break;
        		case 'X' : sb.append("h"); break;
        		default : sb.append((char)(input.charAt(i)+32));
        	}
        }
        
        System.out.print(sb);
        
	}
	
	
}
