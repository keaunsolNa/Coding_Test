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
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		int time = (3600 * h) + (60 * m) + s;
		int q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st.nextToken());
			int C = 0;
			if(T == 1) {
				
				C = Integer.parseInt(st.nextToken());
				time = (time + C) % 86400;
				
			} else if (T == 2){
				
				C = Integer.parseInt(st.nextToken());
				time = (time - C) % 86400;
				if(time < 0) time += 24 * 3600;
				
			} else {
				
				System.out.println((time / 3600) + " " + (time / 60 % 60) + " " + (time % 60));
			}
			
		}
		
	}
}
