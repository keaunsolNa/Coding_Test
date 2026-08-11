package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringPlus18 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	
	// 팬그램  
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("*")) {
			Set<Character> set = new HashSet<>();
			input = input.replaceAll(" ", "");
			for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
			
			if(set.size() == 26) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}
	
	// Decoder 
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					case 'y' : sb.append('a'); break; 
					case 'Y' : sb.append('A'); break; 
					case 'a' : sb.append('e'); break;
					case 'A' : sb.append('E'); break;
					case 'e' : sb.append('i'); break;
					case 'E' : sb.append('I'); break;
					case 'i' : sb.append('o'); break;
					case 'I' : sb.append('O'); break;
					case 'o' : sb.append('u'); break;
					case 'O' : sb.append('U'); break;
					case 'u' : sb.append('y'); break;
					case 'U' : sb.append('Y'); break;
					default : sb.append(input.charAt(i)); 
				}
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	
    // 타노스
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = new char[s.length()];
        int cnt0 = 0;
        int cnt1 = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
            if (arr[i] == '0') cnt0++;
            else cnt1++;
            
        }
        
        cnt0/=2;
        cnt1/=2;

        for (int i = 0; i < s.length() && cnt1!=0; i++) 
            if (arr[i] == '1') {
            	cnt1--;
                arr[i] = 0;
            }

        for (int i = s.length()-1; i >= 0 && cnt0!=0; i--) 
        	if (arr[i] == '0') {
                cnt0--;
                arr[i] = 0;
            }
        	

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++)  if (arr[i] != 0) answer.append(arr[i]);
        
        System.out.println(answer);
	}
	
	
}
