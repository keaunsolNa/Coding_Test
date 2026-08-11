import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String base = br.readLine();
		int[] baseArr = new int[26];
		
		for(int i = 0; i < base.length(); i++) baseArr[base.charAt(i) - 'A']++;
		
		int ans = 0;
		for(int i = 0; i < T - 1; i++) {
			
			String temp = br.readLine();
			if(Math.abs(temp.length() - base.length()) > 1) continue;

			int dif = 0;
			int[] tempArr = baseArr.clone();
			
			for(int j = 0; j < temp.length(); j++) {
				int idx = temp.charAt(j) - 'A';
				
				if(tempArr[idx] > 0) {
					dif++;
					tempArr[idx]--;
				}
			}
			
            if(base.length() - 1 == temp.length()) {
            	
                if(dif == temp.length()) ans++;
                
            }

            else if(base.length() + 1 == temp.length()) {
            	
                if(dif == base.length()) ans++;
                
            }

            else if(base.length() == temp.length()) {
            	
                if(dif == base.length()) ans++;
                else if(dif == base.length() - 1) ans++;
                
            }
            
		}
		
		System.out.println(ans);
	}
}
