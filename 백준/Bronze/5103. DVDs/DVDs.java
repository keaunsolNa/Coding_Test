import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		while(true) {
			
			String video = br.readLine();
			if(video.equals("#")) break;
			
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			
			int T = Integer.parseInt(br.readLine());
			
			while(T --> 0) {
				
				st = new StringTokenizer(br.readLine());
				
				char order = st.nextToken().charAt(0);
				int value = Integer.parseInt(st.nextToken());
				
				switch(order) {
					
					case 'S' : S = Math.max(0, S - value); break;
					case 'R' : S = Math.min(M, S + value); break;
					
				}
			}
			
			sb.append(video + " " + S + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
