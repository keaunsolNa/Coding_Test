import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int[] box = new int[N];
	   for(int i = 0; i < N; i++) box[i] = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int[] book = new int[M];
	   for(int i = 0; i < M; i++) book[i] = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i < M; i++) {
		   
		   for(int j = 0; j < N; j++) {
			   
			   if(box[j] >= book[i]) {
				   box[j] -= book[i];
				   break;
			   }
		   }
	   }
	   
	   int total = 0;
	   for(int i = 0; i < N; i++) total += box[i];
	   
	   System.out.println(total);
	   
   }
}
