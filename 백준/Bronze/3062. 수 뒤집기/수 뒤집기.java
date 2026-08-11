import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			StringBuilder reverseInt = new StringBuilder(br.readLine());
			int originInt = Integer.parseInt(reverseInt.toString());
			reverseInt.reverse();
			
			String combineInt = (originInt + Integer.parseInt(reverseInt.toString()))+"";
			String check = "";
			StringBuilder sb  = new StringBuilder();
			
			for(int j = 0; j < (combineInt.length()/2); j++) { 
				
				char left = combineInt.charAt(j);
				char right = combineInt.charAt(combineInt.length()-j-1);
				
				if(left != right) { 
					check = "PASS";
					break;
				}
				
			}
			
			if(check.equals(""))System.out.println("YES");
			else System.out.println("NO");
		}
	
	}
}
