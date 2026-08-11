import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			
			double[] ap = new double[N];
			double sum = 0;
			
			for(int i = 0; i < N; i++) {
			
				ap[i] = Double.parseDouble(st.nextToken());
				sum += ap[i];
				
			}
			
			double avg = sum / N;
			Arrays.sort(ap);
			
			int p = 0;
			for(int i = N - 1; i >= 0; i--) {
				
				if(ap[i] > avg) p++;
				else break;
				
			}
			
			sb.append(String.format("%.3f", avg));
			sb.append(" ");
			sb.append(String.format("%.3f", (double) p / (double) N * 100.0) + "%");
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
