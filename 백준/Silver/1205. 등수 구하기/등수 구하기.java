import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int point = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		if(N > 0) {
			
			int[] ranking = new int[N];
            st = new StringTokenizer(br.readLine());
            
			for (int i = 0; i < N; i++) ranking[i] = Integer.parseInt(st.nextToken());

			if (N == P && ranking[N - 1] >= point) System.out.println(-1);

			else {

				int rank = N + 1;
                
				for (int i = 0; i < N; i++) {
                
					if (ranking[i] <= point) {
                        rank = i + 1;
                        break;
                    }
					
                }
				
                System.out.println(rank);

			}
			
		} else {
			System.out.println(1);
		}
		
	}
}
