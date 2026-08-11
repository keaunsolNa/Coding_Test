package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus25 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	
	// Palindromes 
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;

        for(int i = 0; i < N; i++) {
        	int temp = Integer.parseInt(st.nextToken());
    		int reverse = 0;
    		int n = temp;
    		while (n != 0) {
    			int r = n % 10;
    			reverse = reverse * 10 + r;
    			n = n / 10;
    		}
        	
        	if(temp == reverse) sum += temp;
        }
        
        System.out.println(sum);
	}
	   
	
    // Palindromes 
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	
        	boolean chk = true;
        	for(int i = 0; i < input.length(); i++) {
        		
        		String text = new StringBuilder(input).deleteCharAt(i).toString();
        		String reverse = new StringBuilder(text).reverse().toString();

        		if(text.equals(reverse)) {
        			sb.append(reverse);
        			chk = false;
        			break;
        		}
        		
        	}
        	
        	if(chk)sb.append("not possible");
        	sb.append("\n");
        	
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
	
}
