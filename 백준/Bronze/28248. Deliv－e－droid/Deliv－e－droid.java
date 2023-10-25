import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int P = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int point = P * 50 - C * 10;
		point += P > C ? 500 : 0;
		
		System.out.println(point);
   }
}