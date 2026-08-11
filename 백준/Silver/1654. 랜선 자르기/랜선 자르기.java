import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int K = Integer.parseInt(st.nextToken());
	   int N = Integer.parseInt(st.nextToken());
	   List<Long> list = new ArrayList<>();
	   long max = 1;
		
	   for(int i = 0; i < K; i++) {

		   long length = Long.parseLong(br.readLine());
		   list.add(length);
		   if(length > max) max = length;

	   }
		
	   long first = 1;
	   long last = max;
	   long answer = first;
		
	   while(first <= last) {
		   long mid = (first+last)/2;
		   long num = getNum(list, mid);
			
		   if(num < N) 
			   last = mid - 1;
		   else {
			   answer = mid;
			   first = mid + 1;
		   }
	   }

	   System.out.println(answer);
   }

   public static int getNum(List<Long> list, long unit) {
	   int num = 0;

	   for (Long length : list) 
		   num += (length/unit);

	   return num;

   }
}
