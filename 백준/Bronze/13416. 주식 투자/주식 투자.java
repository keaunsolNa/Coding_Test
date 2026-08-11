import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int arr[] = new int[3];
	   int T = Integer.parseInt(br.readLine());
		
	   while(T --> 0) {
		
		   int max = 0;
			
		   int N = Integer.parseInt(br.readLine());
			
		   for(int i = 0; i < N; i++){
			
			   st = new StringTokenizer(br.readLine());
				
			   arr[0] = Integer.parseInt(st.nextToken()); 
               
			   arr[1] = Integer.parseInt(st.nextToken());
               
			   arr[2] = Integer.parseInt(st.nextToken());

			   if(arr[0] < 0 && arr[1] < 0 & arr[2] < 0) continue;
				
			   max += Math.max(Math.max(arr[0], arr[1]), arr[2]);

		   }
		   
		   System.out.println(max);
		   
	   }
   }
}
