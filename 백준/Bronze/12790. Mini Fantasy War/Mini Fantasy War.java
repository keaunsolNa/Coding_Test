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
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  
    	  int baseHP = Integer.parseInt(st.nextToken());
    	  int baseMP = Integer.parseInt(st.nextToken());
    	  int baseAT = Integer.parseInt(st.nextToken());
    	  int baseBT = Integer.parseInt(st.nextToken());
    	  int plusHP = Integer.parseInt(st.nextToken());
    	  int plusMP = Integer.parseInt(st.nextToken());
    	  int plusAT = Integer.parseInt(st.nextToken());
    	  int plusBT = Integer.parseInt(st.nextToken());
    	  
    	  baseHP = (baseHP + plusHP < 1) ? 1 : baseHP + plusHP;
    	  baseMP = (baseMP + plusMP < 1) ? 1 : baseMP + plusMP;
    	  baseAT = (baseAT + plusAT < 0) ? 0 : baseAT + plusAT;
    	  baseBT = baseBT + plusBT;
    	  long attack = 1 * baseHP + 5 * baseMP + 2 * baseAT + 2 * baseBT;
    	  
    	  System.out.println(attack);
      }
   }
}
