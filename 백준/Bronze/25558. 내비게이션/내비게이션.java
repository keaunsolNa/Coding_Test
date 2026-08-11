import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		long N = Long.parseLong(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		long startX = Long.parseLong(st.nextToken());
		long startY = Long.parseLong(st.nextToken());
		long endX = Long.parseLong(st.nextToken());
		long endY = Long.parseLong(st.nextToken());
		
		long min = Integer.MAX_VALUE;
		long ans = 0;
		
		for(int i = 1; i <= N; i++) {
			
			long M = Long.parseLong(br.readLine());
			long dis = 0;
			
			long firstX = startX;
			long firstY = startY;
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				
				long x = Long.parseLong(st.nextToken());
				long y = Long.parseLong(st.nextToken());
				
				dis += Math.abs(x - firstX) + Math.abs(y - firstY);
				firstX = x;
				firstY = y;
				
			}
			
			dis += Math.abs(endX - firstX) + Math.abs(endY - firstY);
			
			if(min > dis) {
				min = dis;
				ans = i;
			}
		}
		
		System.out.println(ans);
		
	}
}
