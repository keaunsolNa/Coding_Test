import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int T = Integer.parseInt(br.readLine());
	   
       boolean[] num = new boolean[1000001];
       num[0] = num[1] = true;
       
       for (int i = 2; i * i <= 1000000; i++) 
           if (!num[i]) 
               for (int j = i + i; j <= 1000000; j += i) 
                   num[j] = true;

       while (T --> 0) {
    	   
           int temp = Integer.parseInt(br.readLine());
           int ans = 0;
           for (int j = 2; j <= temp / 2; j++) 
               if (!num[j] && !num[temp - j]) ans++;
           
           System.out.println(ans);
       }
   }
}
