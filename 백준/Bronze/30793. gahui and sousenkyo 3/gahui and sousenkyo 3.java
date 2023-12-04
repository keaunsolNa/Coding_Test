import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double p = Integer.parseInt(st.nextToken());
		double r = Integer.parseInt(st.nextToken());
		
		double v = p / r;
		
		System.out.println(v < 0.2 ? "weak" : v < 0.4 ? "normal" : v < 0.6 ? "strong" : "very strong");
   }
}