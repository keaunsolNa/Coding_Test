package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BasicMath2Plus43 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   
   // 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int i, t = Integer.parseInt(br.readLine());
		
	   while(t -- > 0 ){

		   st = new StringTokenizer(br.readLine());
		   int n = Integer.parseInt(st.nextToken());
		   int m = Integer.parseInt(st.nextToken());

		   long team[] = new long[n + 1];
		   long win[] = new long[n + 1];
		   long lose[] = new long[n + 1];

		   long max = 0;
		   long min = 0;

		   for(i = 1; i <= m; i++) {
			   st = new StringTokenizer(br.readLine());
			   int a = Integer.parseInt(st.nextToken());
			   int b = Integer.parseInt(st.nextToken());
			   int p = Integer.parseInt(st.nextToken());
			   int q = Integer.parseInt(st.nextToken());

			   win[a] += p; 
			   win[b] += q;
			   lose[a] += q; 
			   lose[b] += p;
				
		   }
		   
		   for(i = 1; i <= n; i++) {
			   
			   if(win[i] == 0 && lose[i] == 0) team[i] = 0;
				
			   else team[i] = (win[i] * win[i]) * 1000 / (win[i] * win[i] + lose[i] * lose[i]);
				
			   if(i == 1){
				   min = max = team[i];
				   continue;
			   }
				
			   if (max < team[i]) max = team[i];
			   if (team[i] < min) min = team[i];

		   }
			
			
		   System.out.println(max+"\n"+min);
		
	
	   }

   }
   
}