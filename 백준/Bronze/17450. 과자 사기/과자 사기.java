import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double max = 0;
		String winner = "";
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			double price = Integer.parseInt(st.nextToken());
			double weight = Integer.parseInt(st.nextToken());
			double pricePerformanceRatio = 0;
			
			if(price*10 >= 5000) {
				pricePerformanceRatio = ((weight*10) / (price*10 - 500));
			} else {
				pricePerformanceRatio = (weight*10) / (price*10);
			}
			
			if(pricePerformanceRatio > max) {
				max = pricePerformanceRatio;
				switch(i) {
					case 0 : winner = "S"; break;
					case 1 : winner = "N"; break;
					case 2 : winner = "U"; break;
				}
			}
			
		}
		
		System.out.println(winner);
	}
}
