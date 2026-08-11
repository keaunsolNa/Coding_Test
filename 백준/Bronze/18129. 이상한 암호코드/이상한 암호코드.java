import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        String S = st.nextToken().toLowerCase() + ' ';
        int K = Integer.parseInt(st.nextToken());
        
		boolean[] alpha = new boolean[26];
		char c = S.charAt(0);
		int count = 1;
		
		for(char ch : S.toCharArray()) {
			if(ch == c) count++;
			else {
				if(!alpha[c - 'a']) {
					sb.append(count >= K ? 1 : 0);
					alpha[c - 'a'] = true;
				}
				
				c = ch;
				count = 1;
			}
		}
   
		System.out.println(sb);
	}
}
