import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
	   
       while(T --> 0) {
      	  st = new StringTokenizer(br.readLine(), " ");
      	  int a = Integer.parseInt(st.nextToken());
      	  int b = Integer.parseInt(st.nextToken());
      	  
      	  sb.append(a + " " +b).append("\n");
      	  int price = 0;
      	  if(a > 1) {
      		  price += (a-1)*(b-2);
      		  price += b;
      	  } else {
      		  price += b;
      	  }
      	  
      	  sb.append(price).append("\n");
       }
       
       sb.deleteCharAt(sb.length()-1);
       System.out.print(sb);
   }
}
