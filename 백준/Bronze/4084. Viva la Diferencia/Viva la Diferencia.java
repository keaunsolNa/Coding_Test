import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       String input = "";
       
       while(!(input = br.readLine()).equals("0 0 0 0")) {
    	   st = new StringTokenizer(input);
    	   int A = Integer.parseInt(st.nextToken());
    	   int B = Integer.parseInt(st.nextToken());
    	   int C = Integer.parseInt(st.nextToken());
    	   int D = Integer.parseInt(st.nextToken());
    	   
    	   int cnt = 0;
    	   
    	   while(!(A == B && B == C && C == D)) {
    		   int temp = A;
    		   A = Math.abs(A - B);
    		   B = Math.abs(B - C);
    		   C = Math.abs(C - D);
    		   D = Math.abs(D - temp);
    		   cnt++;
    	   }
    	   
    	   System.out.println(cnt);
       }
   }
}
