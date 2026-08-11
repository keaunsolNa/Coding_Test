import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       int N = Integer.parseInt(br.readLine());
       
       int[][] arr = new int[N][2];
       
       for(int i = 0; i < N; i++) {
    	   st = new StringTokenizer(br.readLine());
    	   
    	   arr[i][0] = Integer.parseInt(st.nextToken());
    	   arr[i][1] = Integer.parseInt(st.nextToken());
    	   
       }
       
       int dis = 0;
       
       for(int i = 0; i < N - 1; i++) 
    	   dis += Math.abs(arr[i + 1][0] - arr[i][0]) + Math.abs(arr[i + 1][1] - arr[i][1]);
   
       System.out.println(dis);
   }
}
