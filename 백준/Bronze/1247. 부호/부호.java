import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       
       for(int i = 0; i < 3; i++) {
    	   BigInteger sum = new BigInteger("0");
    	   int T = Integer.parseInt(br.readLine());
    	   
    	   while(T --> 0) sum = sum.add(new BigInteger(br.readLine()));
    	   
    	   switch(sum.signum()) {
    	   		case 1 : sb.append("+"); break; 
    	   		case 0 : sb.append("0"); break; 
    	   		case -1 : sb.append("-"); break;
    	   }
    	   
    	   
    	   sb.append("\n");
       }
       
       sb.deleteCharAt(sb.length()-1);
       System.out.print(sb);
       
   }
}
