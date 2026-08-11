import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			int seq = Integer.parseInt(br.readLine());
			
			if(seq == 0) break;

			st = new StringTokenizer(br.readLine());
			double[] arr = new double[seq];
			
			double total = 0;
			
			for(int i = 0; i < seq; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				total += temp;
				
				arr[i] = temp;
			}
			
			double aver = total / seq;
			
			int cnt = 0;
			
			for(int i = 0; i < seq; i++) {
				if(Double.compare(arr[i], aver) <= 0) cnt++;
			}
			
			System.out.println(cnt);
		}
		
		
	}
}
