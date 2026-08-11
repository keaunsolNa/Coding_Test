import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int[] p = new int[N];
			for(int i = 0; i < N; i++) p[i] = Integer.parseInt(st.nextToken());
			
			boolean easy = false;
			boolean hard = false;
			
			if(p[0] == X) easy = true;
			if(p[N - 1] == Y) hard = true;
			
			if(easy && hard) sb.append("BOTH" + "\n");
			else if(easy) sb.append("EASY" + " \n");
			else if(hard) sb.append("HARD" + "\n");
			else sb.append("OKAY" + "\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
