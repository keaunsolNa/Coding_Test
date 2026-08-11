import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		int maxS = Integer.MIN_VALUE;
		int minT = Integer.MAX_VALUE;
		int f = 0;
		int p = 0;
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			if(s > maxS) {
				
				maxS = s;
				minT = t;
				f = i;
				p = t;
				
			} else if(s == maxS) {

				if(t < minT) {
					
					maxS = s;
					minT = t;
					f = i;
					p = t;
					
				}
				
			}
		}
		
		if(maxS == 0) p = 0;
		
		System.out.println(p + (f - 1) * 20);
		
	}
}
