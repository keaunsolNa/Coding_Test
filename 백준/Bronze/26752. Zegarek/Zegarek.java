import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int h = Integer.parseInt(st.nextToken());
	   int m = Integer.parseInt(st.nextToken());
	   int s = Integer.parseInt(st.nextToken());
	   s++;

	   if(s == 60) {
		   s = 0; 
		   m++;
	   }
	   
	   if(m == 60) {
		   m = 0;
		   h++;
	   }
	   
	   if(h == 24) {
		   h = 0;
	   }
	   
	   if(h < 10) sb.append("0" + h);
	   else sb.append(h);
	   
	   if(m < 10) sb.append(":0" + m);
	   else sb.append(":" + m);
	   
	   if(s < 10) sb.append(":0" + s);
	   else sb.append(":" + s);
	   
	   System.out.println(sb);
	   
   }
}
