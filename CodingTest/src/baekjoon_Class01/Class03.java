package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Class03 {

	public static void main(String[] args) throws IOException {
		test04();
	}
	
	
    // 1107번 리모콘
    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		boolean[] broken = new boolean[10];
		StringTokenizer st;
		
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) broken[Integer.parseInt(st.nextToken())] = true;
		} 
		
		int result = Math.abs(N - 100);
		
		for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean chk = false;
            for(int j = 0; j < len; j++) {
            	
                if(broken[str.charAt(j) - '0']) { 
                	chk = true; 
                    break; 
                }
                
            }
            
            if(!chk) {
            	int min = Math.abs(N - i) + len; 
            	result = Math.min(min, result);
            }
            
		}
		
		System.out.println(result);
		 
    }
    
    // 1260번 - DFS와 BFS
    private static int M, N;

    
    // 
    public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }

    // 
    public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }


}
