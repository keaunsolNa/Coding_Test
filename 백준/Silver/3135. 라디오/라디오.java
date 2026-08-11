import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		 
		int N = Integer.parseInt(br.readLine());
		int[] bookmark = new int[N];
		int maxTerm = 10000;
		for(int i = 0; i < N; i++) {
			bookmark[i] = Integer.parseInt(br.readLine());
			if(maxTerm > Math.abs(bookmark[i] - B)) maxTerm = Math.abs(bookmark[i] - B);
		}
		
		if(Math.abs(A - B) <= maxTerm) {
			System.out.println(Math.abs(A - B));
		} else {
			System.out.println(maxTerm+1);
		}
		
	}
}
