package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus24 {
	
	public static void main(String[] args) throws IOException {
		test02();
	}

	
	// Words
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	String[] inputArr = input.split(" ");
        	for(int i = 0; i < inputArr.length; i++) {
        		sb.append(new StringBuilder(inputArr[i]).reverse()).append(" ");
        	}
        	
        	sb.deleteCharAt(sb.length() - 1);
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
        
	}
	   

	// SciComLove (2022) 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int SN = N % 10;
		StringBuilder text = new StringBuilder("SciComLove");
		
		while(SN --> 0) {
			char temp = text.charAt(0);
			text.append(text.charAt(0));
			text.deleteCharAt(0);
		}
		
		System.out.println(text);
	}
	
	
    // Cypher
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		while(!(input = br.readLine()).equals("0 0 0")) {
			st = new StringTokenizer(input);
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			int cypher = sum % 25 + 1;
			
			String text = br.readLine();
			
			for(int i = 0; i < text.length(); i++) {
				int charInt = (int)text.charAt(i);
				if(charInt < 123 && charInt > 96) {	
					
					if(charInt - cypher < 123 && charInt - cypher > 96) {
						
						sb.append((char)(charInt - cypher));
						continue;
						
					} else {
						
						sb.append((char)(26 + charInt - cypher));
						continue;
					}
				}  else {
					sb.append(text.charAt(i));
				}
				
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
    }

	// Joke
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int cnt = 0;
        while((input = br.readLine()) != null) {
        	cnt += (input.length() - input.replaceAll("joke", "").length())/4;
        }
        
        System.out.println(cnt);
	}
	
	
}
