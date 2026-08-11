import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  int x1 = Integer.parseInt(st.nextToken());
    	  int y1 = Integer.parseInt(st.nextToken());
    	  int f1 = Integer.parseInt(st.nextToken());
    	  int x2 = Integer.parseInt(st.nextToken());
    	  int y2 = Integer.parseInt(st.nextToken());
    	  int f2 = Integer.parseInt(st.nextToken());

    	  int dis = 0;
    	  
    	  dis += Math.abs(x2 - x1);
    	  dis += Math.abs(y2 - y1);
    	  dis += f1;
    	  dis += f2;
    			  
    	  System.out.println(dis);
      }
   }
}
