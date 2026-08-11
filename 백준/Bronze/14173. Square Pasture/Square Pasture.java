import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int x1 = Integer.parseInt(st.nextToken());
	   int y1 = Integer.parseInt(st.nextToken());
	   int x2 = Integer.parseInt(st.nextToken());
	   int y2 = Integer.parseInt(st.nextToken());

	   st = new StringTokenizer(br.readLine());
	   int X1 = Integer.parseInt(st.nextToken());
	   int Y1 = Integer.parseInt(st.nextToken());
	   int X2 = Integer.parseInt(st.nextToken());
	   int Y2 = Integer.parseInt(st.nextToken());
	   
	   int maxX = Math.max(Math.max(Math.max(x1, x2), X1), X2);
	   int minX = Math.min(Math.min(Math.min(x1, x2), X1), X2);
	   int maxY = Math.max(Math.max(Math.max(y1, y2), Y1), Y2);
	   int minY = Math.min(Math.min(Math.min(y1, y2), Y1), Y2);
	   
	   int answer = Math.max(maxX - minX, maxY - minY);
	   System.out.println(answer*answer);
	   
   }
}
