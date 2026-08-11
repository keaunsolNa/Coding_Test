package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus31 {

   public static void main(String[] args) throws IOException {
      test09();
   }
   
   
   // ДИНИ 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());

	   int[] arr = new int[4];
	   for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   Arrays.sort(arr);
	   int min = Integer.MAX_VALUE;
	   
	   min = Math.min(min, Math.min(Math.abs(arr[3] - (arr[0] + arr[1] + arr[2])), Math.abs((arr[3] + arr[0]) - (arr[1] + arr[2])))); 
	   
	   System.out.println(min);
   }
   
   
}