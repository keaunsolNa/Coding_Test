import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] peekArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			peekArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int maxKill = 0;
		for(int i = 0; i < N-1; i++) {
			int kill = 0;
			for(int j = i+1; j < N; j++) {
				
				if(peekArr[i] < peekArr[j]) {
					break;
				} else {
					kill++;
				}
			}
			if(kill > maxKill) maxKill = kill;
		}
		
		System.out.println(maxKill);
	}
}
