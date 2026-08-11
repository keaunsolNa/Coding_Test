import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String A = br.readLine();
			String B = br.readLine();
			String answer = "Hamming distance is ";
			int chk = 0;
			for(int i = 0; i < A.length(); i++) {
				
				if(A.charAt(i) != B.charAt(i)) chk++;
			}
			
			answer += chk + ".";
			
			System.out.println(answer);
		}
		
	}
}
