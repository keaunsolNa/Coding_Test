package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus29 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}

	// 17609번 - 회문
	private static String input;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			input = br.readLine();
			
			int start = 0;
			int end = input.length() - 1;
			int cnt = 0; 
		
			System.out.println(palindrome(start, end, cnt));
			
		}
	
	}
	
	private static int palindrome(int start, int end, int cnt) {
		
		while(start < end) {
			
			
			if(input.charAt(start) == input.charAt(end)) {
				start++;
				end--;
				continue;
			}
			
			if(cnt != 0) 
				return 2;
			
			cnt++; 
			
			int leftOrRight = palindrome(start, end-1, cnt);
			
            if (leftOrRight == 1) {
                end--;
                continue;
            }
            
            leftOrRight = palindrome(start+1, end, cnt);
            
            if (leftOrRight == 1) {
                start++;
                continue;
            }
            
		}
		
		return cnt;
	}
	
	// 25786번 - Decimal XOR 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String A = br.readLine();
		String B = br.readLine();
		
		while(A.length() != B.length()) {
			if(A.length() < B.length()) A = "0" + A;
			else B = "0" + B;
		}

		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) - '0' <= 2 && B.charAt(i) - '0' <= 2) sb.append("0");
			
			else if(A.charAt(i) - '0' >= 7 && B.charAt(i) - '0' >= 7) sb.append("0");
			
			else sb.append("9");
			
		}
		
		System.out.println(sb);
		
	}
	
	// 5525번 - IOIOI 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N + 1; i++) sb.append("IO");
		sb.deleteCharAt(sb.length() - 1);
		
		String S = sb.toString();
		String base = br.readLine();
		
		int answer = 0;
		int len = 0;
		
		for (int i = 0; i < base.length(); i++) {
			
			if(base.charAt(i) == S.charAt(len)) len++;
			
			else {
				
				if(base.charAt(i)=='I') len = 1;
				else len = 0;
				
			}
			
			if(len == 2 * N + 1) {
				answer++;
				len -= 2;
			}
		}
		
		System.out.println(answer);
		
	}
	
	// 26392번 - Desni klik
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int r = Integer.parseInt(st.nextToken());
	    int s = Integer.parseInt(st.nextToken());
	    
	    for (int i = 0; i < n; i++) {
	      
	    	char[][] matrix = new char[r][s];

	    	for (int j = 0; j < r; j++) matrix[j] = br.readLine().toCharArray();

	    	int min = Integer.MAX_VALUE;
	    	int max = Integer.MIN_VALUE;
	   
	    	for (int j = 0; j < s; j++) {
	        
	    		for (int k = 0; k < r; k++) {
	          
	    			if (matrix[k][j] == '#') {

	    				min = Math.min(min, k);
	    				max = Math.max(max, k);
	    				break;

	    			}

	    		}

	    	}
	      
	    	System.out.println(max - min);

	    }

	}
	
	// 6581번 - HTML 
	private static StringBuilder sb = new StringBuilder();
	private static int idx = 0;
	public static void test05() throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<String> arr = new ArrayList<>();
        
        while ((input = br.readLine()) != null) {
        	
            StringTokenizer st = new StringTokenizer(input, " \t\n");
            
            while (st.hasMoreTokens()) arr.add(st.nextToken());

        }
        
        for (String str : arr) {
        	
            if (str.equals("<br>")) {
                br();
                continue;
            }

            if (str.equals("<hr>")) {
                hr();
                continue;
            }
            
            if (idx + str.length() + (idx == 0 ? 0 : 1) > 80) {
                idx = 0; 
                br();
            }
            
            if (idx != 0) sb.append(' ');
            sb.append(str);
            idx += str.length() + (idx == 0 ? 0 : 1);

        }
        
        br();
        System.out.print(sb);
	}
	
    private static void br() {
        sb.append('\n');
        idx = 0;
    }
    
    private static void hr() {
        if (idx != 0) br();
        for (int i = 0; i < 80; i++) sb.append('-');
        sb.append('\n');
        idx = 0;
    }
    
	// 20002번 - 추월 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] in = new String[N];
		for(int i = 0; i < N; i++) in[i] = br.readLine();
		
		String[] out = new String[N];
		for(int i = 0; i < N; i++) out[i] = br.readLine();

		boolean[] chk = new boolean[N];
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(!in[i].equals(out[j])) {
					if(!chk[j]) {
						chk[j] = true;
						cnt++;
					}
				}
				
				else {
					
					chk[j] = true;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	// 25326번 - 다중 항목 선호도 조사 (Small)
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<String[]> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String[] str = new String[] {st.nextToken(), st.nextToken(), st.nextToken()};
			list.add(str);
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			String[] str = new String[] {st.nextToken(), st.nextToken(), st.nextToken()};
			int ans = 0;
			
			for(int j = 0; j < n; j++) {
				
				if(str[0].equals("-") || str[0].equals(list.get(j)[0])) {
					
					if(str[1].equals("-") || str[1].equals(list.get(j)[1])) {
						
						if(str[2].equals("-") || str[2].equals(list.get(j)[2])) {
							ans++;
						}
					}
				}

			}
			
			System.out.println(ans);
		}
	}
	
	// 12904번 - A와 B
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder S = new StringBuilder(br.readLine());
		StringBuilder T = new StringBuilder(br.readLine());
		
		while(S.length() != T.length()) {
			
			if(T.charAt(T.length() - 1) == 'A') {
				T.deleteCharAt(T.length() - 1);
			} else {
				T.deleteCharAt(T.length() - 1);
				T.reverse();
			}
		}
		
		int ans = (S.toString().equals(T.toString())) ? 1 : 0;
		
		System.out.println(ans);
	}
	
	// 16719번 - ZOAC
	private static boolean[] visited;
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		visited = new boolean[input.length()];
		solove(0, input.length() - 1);
		
		System.out.println(sb.toString());
		
	}
	
	private static void solove(int left, int right) throws IOException {
       
		if (left > right) return;

        int idx = left;

        for (int i = left; i <= right; i++) {
            if (input.charAt(idx) > input.charAt(i)) idx = i;
        }
        
        visited[idx] = true;

        for (int i = 0; i < input.length(); i++) {
            if (visited[i])  sb.append(input.charAt(i));
        }
        
        sb.append("\n");
        solove(idx + 1, right);
        solove(left, idx  - 1);
    }
    
	// 23813번 - 회전
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		String origin = sb.toString();
		
		long ans = 0;
		sb = sb.insert(0, sb.charAt(sb.length() - 1));
		sb.deleteCharAt(sb.length() - 1);
		ans += Long.parseLong(sb.toString());
				
		while(!origin.equals(sb.toString())) {
			sb = sb.insert(0, sb.charAt(sb.length() - 1));
			sb.deleteCharAt(sb.length() - 1);
			ans += Long.parseLong(sb.toString());
		}
		
		System.out.println(ans);
		
	}
	
	
	
}
