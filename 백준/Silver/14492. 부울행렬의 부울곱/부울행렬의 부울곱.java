import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   boolean[][] arr1 = new boolean[N][N];
	   boolean[][] arr2 = new boolean[N][N];
	   boolean[][] arr3 = new boolean[N][N];
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   for(int j = 0; j < N; j++) arr1[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
	   }
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   for(int j = 0; j < N; j++) arr2[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
	   }
	   
	   for(int i = 0; i < N; i++) {
		   
		   for(int j = 0; j < N; j++) {
			   
			   for(int k = 0; k < N; k++) {
				   arr3[i][j] = arr3[i][j] || arr1[i][k] && arr2[k][j];
			   }
		   }
	   }
	   
	   int ans = 0;
	   for (boolean[] bs : arr3) {

		   for (boolean bs2 : bs) {
			   ans += bs2 == true ? 1 : 0;
		   }
	   }
	   
	   System.out.println(ans);
   }
}
