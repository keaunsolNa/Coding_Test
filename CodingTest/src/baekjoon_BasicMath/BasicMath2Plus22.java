package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus22 {

   public static void main(String[] args) throws IOException {
      test06();
   }
   
   
   // 거북이 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int[] arr = new int[4];
      
      for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
      
      Arrays.sort(arr);
      
      System.out.println(arr[0] * arr[2]);
      
   }
   
   
}