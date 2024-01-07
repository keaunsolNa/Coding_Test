import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			String number = br.readLine();
			StringBuilder in = new StringBuilder();
			char prev = number.charAt(0);
			int cnt  = 1;
			
			for(int i = 1; i < number.length(); i++) {
				
				if(prev != number.charAt(i)) {
					
					in.append(cnt).append(prev);
					prev = number.charAt(i);
					cnt = 1;
				} else cnt++;
			}
			
			in.append(cnt).append(prev);
			sb.append(in).append("\n");
		}
		
		System.out.println(sb);
	}

}