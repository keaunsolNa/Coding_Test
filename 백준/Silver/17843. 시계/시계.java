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
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			 st = new StringTokenizer(br.readLine());
			 double[] arr = new double[3];
			 arr[0] = Integer.parseInt(st.nextToken());
			 arr[1] = Integer.parseInt(st.nextToken());
			 arr[2] = Integer.parseInt(st.nextToken());
			 
			 arr[1] += arr[2] / 60.0;
			 arr[0] *= 5.0;
			 arr[0] += (arr[1] / 60.0) * 5.0;
			 Arrays.sort(arr);
			 
			 double res = 360;
			 for(int i = 1; i < 3; i++) {
				
				 double angle = (arr[i] - arr[i - 1]) * 6;
				 if (res > angle) res = angle;
				 
			 }
			 
			 
			 double e = (arr[0] + 60.0 - arr[2]) * 6.0;

			 if (res > e) res = e;

			 System.out.println(String.format("%.6f", res));
		}
	}
}
