import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   
	   int CY = N;
	   int CX = N;
	   for(int i = 0; i < C; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   
		   int Y = Integer.parseInt(st.nextToken());
		   int X = Integer.parseInt(st.nextToken());
		   
		   if(Y >= CY || X >= CX || X <= 0 || Y <= 0) continue;
		   
           int ny = Y;
           int nx = CX;
           int w = Y * CX;
           
           if (w < CY * X) {
               ny = CY;
               nx = X;
           }
           CY = ny;
           CX = nx;
		   
	   }
	   
	   System.err.println(CY * CX);
	   
   }
}
