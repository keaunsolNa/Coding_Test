import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[] totalTime = new boolean[86400];
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			int time = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
			
			for(int t = time; t < time + 40; t++) totalTime[t] = true;
			
		}
		
		for(int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine(), ":");
			int time = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
			
			for(int t = time; t < time + 40; t++) totalTime[t] = true;
			
		}
		
		int ans = 86400;
		for(int i = 0; i < 86400; i++) if(totalTime[i]) ans--;
		
		System.out.println(ans);
	}
}
