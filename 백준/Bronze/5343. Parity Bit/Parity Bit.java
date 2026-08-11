import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			String input = br.readLine();
			int ans = 0;
			
			int len = input.length();
			int count = 0;

			for(int j = 0; j < len / 8; j++) {
				
				for(int i = 0; i < 8; i++) {
					
					if(i != 7) {
						if(input.charAt(j * 8 + i) == '1') count++;
					}
					
					else if(i == 7) { 
						
						if(count % 2 == 0 && input.charAt(j * 8 + i) == '1') ans++;
						else if(count % 2 == 1 && input.charAt(j * 8 + i) == '0') ans++;
						
						count = 0;
					}
					
				}
			}
			System.out.println(ans);
		}
	}
}
