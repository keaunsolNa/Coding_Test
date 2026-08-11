import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   int[][] point = new int[N][3];
	   for(int i = 0; i < N; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   point[i][0] = Integer.parseInt(st.nextToken());
		   point[i][1] = Integer.parseInt(st.nextToken());
		   point[i][2] = Integer.parseInt(st.nextToken());
		   
	   }

	   for(int idx = 0; idx < 3; idx++) {
		   
		   for(int i = 0; i < N; i++) {
			   
			   int target = point[i][idx];
			   boolean chk = false;
			   for(int j = i + 1; j < N; j++) {
				   
				   if(point[j][idx] == target) {
					   point[j][idx] = 0;
					   chk = true;
				   }
			   }
			   
			   if(chk) point[i][idx] = 0;
		   }
	   }
	   
	   
	   for(int i = 0; i < N; i++) {

		   long sum = 0;
		   for(int j = 0; j < 3; j++) sum += point[i][j];
		   System.out.println(sum);
		   
	   }
	   
   }
}
