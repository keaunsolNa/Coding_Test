import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   Map<Integer, Integer> maleMap = new HashMap<>();
	   Map<Integer, Integer> femaleMap = new HashMap<>();
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   for(int i = 1; i <= 6; i++) {
		   maleMap.put(i, 0);
		   femaleMap.put(i, 0);
	   }
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int gender = Integer.parseInt(st.nextToken());
		   int grade = Integer.parseInt(st.nextToken());
		   
		   if(gender == 0) femaleMap.put(grade, femaleMap.getOrDefault(grade, 0) + 1);
		   else maleMap.put(grade, maleMap.getOrDefault(grade, 0) + 1);
	   }
	   
	   int sum = 0;
	  
	   for(int i = 1; i <= 6; i++) {
		   
		   if(maleMap.get(i) % K == 0) sum += maleMap.get(i) / K;
		   else sum += maleMap.get(i) / K + 1;
		   
		   if(femaleMap.get(i) % K == 0) sum += femaleMap.get(i) / K;
		   else sum += femaleMap.get(i) / K + 1;
	   } 
	   
	   System.out.println(sum);
	   
   }
}
