import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int cur = 0;
		boolean can = false;
		for(int i = 0; i < M; i++) {
			int t = Integer.parseInt(br.readLine());

			if((t - cur) >= T) can = true;
			cur = t;
		}
		
		if(D - cur >= T) can = true;
		
		if(can) System.out.println("Y");
		else System.out.println("N");
	}
}
