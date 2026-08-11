import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine());
	   
	   int H = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   int Z = H % 30;
	   
	   if(Z * 12 == M )  System.out.println("O");
	   else System.out.println("X");
	   
   }
}
