package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus34 {

   public static void main(String[] args) throws IOException {
      test03();
   }
   
   
   // Square 
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int N = Integer.parseInt(br.readLine());
		   
           int ans = 0;
           for (int i = 1; i <= N; i++) ans += i * i;
           
           sb.append(ans + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   
}