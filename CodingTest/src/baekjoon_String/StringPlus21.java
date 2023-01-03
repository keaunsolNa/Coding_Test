package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus21 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	//Always Follow the Rules in Zombieland 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String[] text = new String[T];
		
		for(int i = 0; i < T; i++) text[i] = br.readLine();
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int input = Integer.parseInt(br.readLine());
			
			sb.append("Rule ").append(input).append(": ");
			input--;
			try {
				if(!text[input].isBlank()) sb.append(text[input]);
			} catch(java.lang.ArrayIndexOutOfBoundsException e) {
				sb.append("No such rule");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	// Jumbled Words
	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	String[] text = input.split(" ");
        	
        	
        	for(int i = 0; i < text.length; i++) {
        		
        		if(text[i].length() > 2) {
        			
	        		sb.append(text[i].charAt(0));
	    			sb.append(new StringBuilder(String.valueOf(text[i].substring(1, text[i].length()-1))).reverse().toString());
	    			sb.append(text[i].charAt(text[i].length()-1));
	    			sb.append(" ");
        		} else {
        			sb.append(text[i]);
        			sb.append(" ");
        		}
        	}
        	sb.deleteCharAt(sb.length()-1);
        	sb.append("\n");
        }
     
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
	}

	// 수열의 변화
	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ",");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		while(K --> 0) {
			
			int[] arrtemp = new int[N--];
			for(int i = 0; i < N; i++) arrtemp[i] = arr[i+1] - arr[i];
			
			arr = arrtemp;
		}
		
		for(int i = 0; i < N; i++) {
			if(i != N - 1) System.out.print(arr[i] + ",");
			else System.out.print(arr[i]);
		}
		
	}
	
	// 피카츄
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = br.readLine();
		
		input = input.replaceAll("pi|ka|chu", "");
		
		if(input.length() == 0) System.out.println("YES");
		else System.out.println("NO");
	}
	
	// 3개만!
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int cnt = 0;
		for(int i = 0; i < input.length() - 2; i++) {
			if(Character.getNumericValue(input.charAt(i)) + 1 == Character.getNumericValue(input.charAt(++i))) {
				if(Character.getNumericValue(input.charAt(i)) + 1 == Character.getNumericValue(input.charAt(++i))) {
					cnt++;
					
					if(i != input.length() - 1)
					if(Character.getNumericValue(input.charAt(i)) + 1 == Character.getNumericValue(input.charAt(++i))) {
						cnt--;
					} else i--;
				} else i--;
			} else i--;
		}
		
		System.out.println(cnt);
	}
	
    // 데칼코마니
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			String reverse = new StringBuilder(input).reverse().toString();

			for(int k = 0; k < M; k++) {
				if(input.charAt(k) != '.') sb.append(input.charAt(k));
				else if (reverse.charAt(k) != '.') sb.append(reverse.charAt(k));
				else sb.append(".");
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
		
		
    }

	// DNA
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 
        int[][] alphabet = new int[m][26];
        StringBuilder sb = new StringBuilder();
        int hammingDistance = 0;
        String[] dnas = new String[n];
        
        for (int i = 0; i < n; i++) {
        	
            dnas[i] = br.readLine();
            for (int j = 0; j < m; j++)  alphabet[j][dnas[i].charAt(j) - 'A'] += 1;
            
        }

        for (int i = 0; i < m; i++) {
        	
            int max = alphabet[i][0];
            char target = 'A';
            
            for (int j = 0; j < 26; j++) {
            	
                if (alphabet[i][j] > max) {
                	
                    max = alphabet[i][j];
                    target = (char) (j + 'A');
                }
            }
            sb.append(target);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) if (dnas[i].charAt(j) != sb.charAt(j)) hammingDistance++;
        }

        System.out.println(sb.toString());
        System.out.println(hammingDistance);
		
	}
	
	// Parity of Strings
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
		
		Set<Integer> evenOrOdd = new HashSet<>();
		for (Character character : set) {
		
			long sum = countChar(input, character);
			
			if(sum % 2 != 0) {
				evenOrOdd.add(1);
			} else if(sum % 2 == 0) {
				evenOrOdd.add(0);
			}
		}
		
		if(evenOrOdd.size() > 1) System.out.println("2");
		else System.out.println(evenOrOdd.toArray()[0]);
	}
	
	public static long countChar(String str, char ch) {
    
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}

	// 신용카드 판별
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			String newStr = "";
			int idx = 1;
			
			for(int i = input.length() - 1; i >= 0; i--) {
				
				if(idx % 2 == 0) {
					int temp = Character.getNumericValue(input.charAt(i)) * 2;
					
					if(temp >= 10) 
						temp = Character.getNumericValue((temp+"").charAt(0)) + Character.getNumericValue((temp+"").charAt(1));
					
					newStr = newStr + temp;
					
				} else 
					newStr = newStr + input.charAt(i);
				
				idx++;
			}
			
			int sum = 0;
			for(int i = 0; i < newStr.length(); i++) 
				sum += Character.getNumericValue(newStr.charAt(i));
			
			
			if(sum % 10 == 0) System.out.println("T");
			else System.out.println("F");
		}
	}
	
    // Haughty Cuisine
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	String[] input = br.readLine().split(" ");
        	
        	for (String string : input) 
				System.out.println(string);
        	
        	return;
        }
	}
	
	
	
}
