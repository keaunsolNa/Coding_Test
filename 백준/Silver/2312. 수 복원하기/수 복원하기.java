import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int N = Integer.parseInt(br.readLine());
		   
		   Map<Integer, Integer> map = new TreeMap<>();
		   
		   for(int i = 2; i <= N;) {
			
			   if(N % i == 0) {
				   map.put(i, map.getOrDefault(i, 0) + 1);
				   N /= i;
				   continue;
			   }
			   
			   else i++;
		   }
		   
		   for (Integer key : map.keySet()) 
			   System.out.println(key + " " + map.get(key));
	   }
	   
   }
}
