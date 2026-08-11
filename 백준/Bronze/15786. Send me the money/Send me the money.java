import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[] S = br.readLine().toCharArray();
		
		for(int i = 0; i < M; i++) {
			
			sb = new StringBuilder(br.readLine());
			
			int idxCheck = 0;
			int check = N;
			
			for(int s = 0; s < S.length; s++) {
				
				for(int idx = idxCheck; idx < sb.length(); idx++) {
					
					if(sb.charAt(idx) == S[s]) {
						check--;
						idxCheck++;
						break;
					}
					
					idxCheck++;
				}
			}
			
			if(check == 0) System.out.println("true");
			else System.out.println("false");
		}
		
	}
}
