import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		char[] one = br.readLine().toCharArray();
		char[] two = br.readLine().toCharArray();
		
		for(int i = 0; i < T; i++) {
			
			char r1 = one[i];
			char r2 = two[i];
			
			if(r1 != r2) {
				
				char ans;
				if(r1 == 'R') ans = (r2 == 'S') ? 'R' : 'P'; 
				else if(r1 == 'P') ans = (r2 == 'S') ? 'S' : 'P';
				else ans = (r2 == 'P')  ? 'S' : 'R';
				
				sb.append(ans);
			} else {
				
				switch(r1) {
					case 'R' : sb.append('P'); break;
					case 'S' : sb.append('R'); break;
					case 'P' : sb.append('S'); break;
				}
			}
		}
		
		System.out.println(sb);
	}
}
