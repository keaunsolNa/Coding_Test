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
		test10();
	}

   public static void test10() throws IOException {
	   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int x0 = Integer.parseInt(st.nextToken());
       int N = Integer.parseInt(st.nextToken());
       
       int time = 0;
       while(time != N) {
    	   
    	   x0 = x0 % 2 == 0 ? x0 / 2 ^ 6 : x0 * 2 ^ 6;
    	   time++;
       }

       System.out.println(x0);
	   
   }
}
