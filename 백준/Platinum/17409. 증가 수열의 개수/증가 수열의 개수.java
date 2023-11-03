import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    public static int[] arr = new int[100001];
    public static int[][] tree = new int[51][100001];
    public static int[][] depth = new int[51][100001];
    
	public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      
      st = new StringTokenizer(br.readLine());
      for(int i = 1; i <= n; ++i) arr[i] = Integer.parseInt(st.nextToken());
      
      for(int i = 1; i <= n; ++i) 
    	  for(int j = 1; j <= k; ++j) {
    		  depth[j][i] = sum(j - 1, arr[i] - 1);
    		  update(j, arr[i], depth[j][i]);
    	  }

      int sum = 0;
      for(int i = 1; i <= n; ++i) 
    	  sum = (sum + depth[k][i]) % 1000000007;
      
      System.out.println(sum);
	}
    
    public static void update(int y, int x, int val) {
		
		while(x <= 100000) {
			tree[y][x] = (tree[y][x] + val) % 1000000007;
			x += x & -x;
		}
	}

	public static int sum(int y, int x) {
		
		int sum = 0;
		
		if(y == 0) return 1;
		
		while(x > 0) {
			sum = (sum + tree[y][x]) % 1000000007;
			x -= x & -x;
		}
		
		return sum;
	}
}
