import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			int p = s.indexOf('x');
			if(p == -1) p = s.indexOf('X');
			
			String t = st.nextToken().toUpperCase();
			
			sb.append(t.charAt(p));
		}
		 
		System.out.println(sb);
	}
	
}