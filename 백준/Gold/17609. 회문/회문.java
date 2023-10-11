import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
	private static String input;
    public static void main(String[] args) throws IOException {
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
}