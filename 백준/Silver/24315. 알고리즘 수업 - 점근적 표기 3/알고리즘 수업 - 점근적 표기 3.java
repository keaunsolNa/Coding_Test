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
		test03();
	}

   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());

	   int a1 = Integer.parseInt(st.nextToken());
	   int a0 = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int c1 = Integer.parseInt(st.nextToken());
	   int c2 = Integer.parseInt(st.nextToken());
	   
	   int n0 = Integer.parseInt(br.readLine());
	   
	   boolean flag = true;
	   for(int i = n0; i < 1000; i++) {
		   
		   if(c1 * i > a1 * i + a0 || a1 * i + a0 > c2 * i) flag = false;
	   }
	   
	   System.out.println(flag ? 1 : 0);
	   
   }
}
