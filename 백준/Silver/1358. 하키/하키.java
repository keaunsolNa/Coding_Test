import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int count = 0;
		for(int i = 0; i < P; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
	        if ((a - X) * (a - X) + (b - (Y + H / 2)) * (b - (Y + H / 2)) <= (H / 2) * (H / 2) && a < X) count++;
	        
	        else if (X <= a && a <= X + W && Y <= b && b <= Y + H) count++;
	 
	        else if ((a - (X + W)) * (a - (W + X)) + (b - (Y + H / 2)) * (b - (Y + H / 2)) <= (H / 2) * (H / 2) && X + W < a) count++;
		}
		
		System.out.println(count);
	}
}
