import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int point = 0;
		while(N --> 0) {
			
			String input = br.readLine();
			
			for(int i = 0; i < input.length(); i++) {
				
				switch(input.charAt(i)) {
					
					case 'A' : point += 4; break;
					case 'K' : point += 3; break;
					case 'Q' : point += 2; break;
					case 'J' : point += 1; break;
				}
			}
			
		}
		
		System.out.println(point);
	}
}
