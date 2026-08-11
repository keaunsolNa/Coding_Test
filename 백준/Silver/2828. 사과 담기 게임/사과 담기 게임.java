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
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int J = Integer.parseInt(br.readLine());
		
		int left = 1;
		int right = M;
		
		int cnt = 0;
		for(int i = 0; i < J; i++) {
			
			int fall = Integer.parseInt(br.readLine());
			
			if(left <= fall || right >= fall) {
				
				if(left > fall) 
					
					while(left != fall) { left--; right--; cnt++; }
				
				else if(right < fall) 
					
					while(right != fall) { left++; right++; cnt++; }

			}
		}
		
		System.out.println(cnt);
	
	}
}
