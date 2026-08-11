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
	   int N = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < N; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int[] arr = new int[3];

		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
		   arr[0] = a;
		   arr[1] = b;
		   arr[2] = c;
			   
		   Arrays.sort(arr);
		   String str = "";
		   
		   if(arr[0] < 10 && arr[1] < 10 && arr[2] < 10) {
			   str = "zilch";
		   } else if(arr[0] < 10 && arr[1] < 10 && arr[2] >= 10) {
			   str = "double";
		   } else if(arr[0] < 10 && arr[1] >= 10 && arr[2] >= 10) {
			   str = "double-double";
		   } else if(arr[0] >= 10 && arr[1] >= 10 && arr[2] >= 10) {
			   str = "triple-double";
		   }
		   
		   StringBuilder sb = new StringBuilder();
		   sb.append(a + " " + b + " " + c + "\n" + str + "\n");
		   
		   System.out.println(sb);
	   }
   }
}
