package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus23 {
	
	public static void main(String[] args) throws IOException {
		test07();
	}

	
	public static long countChar(String str, char ch) {
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}

	
	// 문자 인식
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	String input = "";
        	
        	double length = 0;
        	double miss = 0;
        	double R = 0;
        	while(!(input = br.readLine()).equals("")) {
        		
        		length += input.length();
        		miss += countChar(input, '#');
        		R = length - miss;
        		
        	}
        	
        	System.out.print("Efficiency ratio is ");
        	double percent = R / length * 100;
        	double A = Math.round(percent*10) / 10.0;
        	int B = (int)A;
        	
        	if(A == B) System.out.print(B);
        	else System.out.print(A);
        	System.out.println("%.");
        }
        
	}
	
	
}
