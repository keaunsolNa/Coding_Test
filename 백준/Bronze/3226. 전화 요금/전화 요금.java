import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   int pay = 0;
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());	
		   
		   String start = st.nextToken();
		   int startH = Integer.parseInt(start.split(":")[0]);
		   int startM = Integer.parseInt(start.split(":")[1]);
		   
		   int totalM = startH * 60 + startM;
		   
		   int time = Integer.parseInt(st.nextToken());
		   while (time --> 0) {
			   
			   if(totalM >= 420 && totalM < 1140) pay += 10;
			   else pay += 5;
			   
			   totalM++;
			   if(totalM >= 1440) totalM = 0;
		   }
		   
	   }
	   System.out.println(pay);
   }
}
