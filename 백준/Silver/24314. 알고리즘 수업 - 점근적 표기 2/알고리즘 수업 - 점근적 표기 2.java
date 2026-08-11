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
		test02();
	}

   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());

	   int a1 = Integer.parseInt(st.nextToken());
	   int a0 = Integer.parseInt(st.nextToken());
	   
	   int c = Integer.parseInt(br.readLine());
	   int n0 = Integer.parseInt(br.readLine());
	   
	   boolean flag = true;
	   for(int i = n0; i < 1000; i++) {
		   
		   if(c * i > a1 * i + a0) flag = false;
	   }
	   
	   System.out.println(flag ? 1 : 0);
   }
}
