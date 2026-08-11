import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 1; i <= T; i++) {
    	  
    	  st = new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
    	  String oper = st.nextToken();
    	  int B = Integer.parseInt(st.nextToken());
    	  st.nextToken();
    	  int answer = Integer.parseInt(st.nextToken());
    	  
    	  boolean chk = true;
    	  switch(oper) {
    	  	case "+" : 
    	  		chk = A + B == answer ? true : false;
    	  		break;
    	  	case "-" : 
    	  		chk = A - B == answer ? true : false;
    	  }
    	  
    	  String ans = "YES";
    	  if(!chk) ans = "NO";
    	  
    	  sb.append("Case " + i + ": " + ans + "\n");
    	  
      }
      
      sb.deleteCharAt(sb.length() - 1);
      System.out.print(sb);
   }
}
