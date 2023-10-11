import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	
    private static Integer[] dp6;
	private static int[][] wire;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		wire = new int[N][2];
		dp6 = new Integer[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			wire[i][0] = Integer.parseInt(st.nextToken());
			wire[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(wire, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
 
		});
		
		int max = 0;
		for(int i = 0; i < N; i++) max = Math.max(max, lts2(i));
		
		
		System.out.println(N - max);
   }
    
    private static int lts2 (int n) {
		
		if(dp6[n] == null) {
			dp6[n] = 1;
			
			for(int i = n + 1; i < dp6.length; i++) {
				if(wire[n][1] < wire[i][1]) dp6[n] = Math.max(dp6[n], lts2(i) + 1);
			}
		}
		
		return dp6[n];
	}
	
}