import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(br.readLine());
		
		int cnt = 0;
		long answer = 0;
       
		while(N > 0) {
			
			if((N & 1) == 1) answer += pow(3, cnt);
			
			cnt++;
			N = N >> 1;
		}
		
		System.out.println(answer);
		
	}

	private static long pow(long a, long b) {
		
		if(b == 0) return 1;
		if(b == 1) return a;
		
		long temp = pow(a, b / 2);
		
		if(b % 2 == 0) return temp * temp;
		else return temp * temp * a;
	}
}