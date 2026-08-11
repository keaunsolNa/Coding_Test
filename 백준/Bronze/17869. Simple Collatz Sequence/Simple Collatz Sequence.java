import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long n = Long.parseLong(br.readLine());
	   int cnt = 0;
	   
	   while(n != 1) {
		   
		   if(n % 2 ==0) n /= 2;
		   else n += 1;
		   cnt++;
		   
	   }
	   
	   System.out.println(cnt);
   }
}
