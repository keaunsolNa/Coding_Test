import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int[] arr = new int[3];
	   for(int i = 0; i < 3; i++) {
		   arr[i] = Integer.parseInt(st.nextToken());
	   }
	   
	   Arrays.sort(arr);
	   
	   if(arr[0] == arr[1] && arr[0] == arr[2]) {
		   System.out.println(2);
	   } else if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == arr[2] * arr[2]) {
		   System.out.println(1);
	   } else {
		   System.out.println(0);
	   }
	   
   }
}
