import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int[] arr = new int[3];
	   arr[0] = Integer.parseInt(st.nextToken());
	   arr[1] = Integer.parseInt(st.nextToken());
	   arr[2] = Integer.parseInt(st.nextToken());
	   
	   Arrays.sort(arr);
	   
	   int res = arr[0] + arr[1] + Math.min(arr[2], arr[0] + arr[1] - 1);
	   
	   System.out.println(res);
	   
   }
}
