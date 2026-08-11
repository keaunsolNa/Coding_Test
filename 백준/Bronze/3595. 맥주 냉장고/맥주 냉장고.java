import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long ans = Long.MAX_VALUE;
		int[] answer = new int[3];
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				if(i * j > N) break;
				for(int q = 1; q <= j; q++) {
					
					if(i * j * q > N) break;
					if(i * j * q < N) continue;
					
                    long size = i * j * 2 + i * q * 2 + j * q * 2;
                    if (size < ans) {
                        ans = size;
                        answer[0] = i;
                        answer[1] = j;
                        answer[2] = q;
                    }
				}
			}
		}
		
		System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
	}
}
