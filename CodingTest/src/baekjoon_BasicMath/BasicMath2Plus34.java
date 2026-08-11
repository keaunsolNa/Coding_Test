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
      test02();
   }
   
   
   // Scavenger Hunt
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int P = Integer.parseInt(st.nextToken());
	   int Q = Integer.parseInt(st.nextToken());
	   
	   List<Integer> PList = new ArrayList<>();
	   List<Integer> QList = new ArrayList<>();
	   
	   for(int i = 1; i <= P; i++) 
		   if(P % i == 0) PList.add(i);
	   
	   for(int i = 1; i <= Q; i++)
		   if(Q % i == 0) QList.add(i);
	   
	   for(int p = 0; p < PList.size(); p++) {
		   
		   for(int q = 0; q < QList.size(); q++) {
			   
			   sb.append(PList.get(p) + " " + QList.get(q) + "\n");
		   }
	   }
	   
	   System.out.println(sb);
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
   
   
   // Сравнение комнат
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double A = Double.parseDouble(st.nextToken());
	   double B = Double.parseDouble(st.nextToken());
	   double C = Double.parseDouble(st.nextToken());
	   double D = Double.parseDouble(st.nextToken());
	   
	   if(A * B < C * D) System.out.println("P");
	   else if(A * B > C * D) System.out.println("M");
	   else System.out.println("E");
   }
   
   
}