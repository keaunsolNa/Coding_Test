import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int people = Integer.parseInt(st.nextToken());
	   int money = Integer.parseInt(st.nextToken());
	   int[] arr = new int[people];
	   int total = 0;
	   for(int i = 0; i < people; i++) {
		   int temp = Integer.parseInt(br.readLine());
		   arr[i] = temp;
		   total += temp;
	   }
	   
	   int take = money/total;
	   
	   for(int i = 0; i < arr.length; i++) {
		   System.out.println(arr[i]*take);
	   }
   }
}
