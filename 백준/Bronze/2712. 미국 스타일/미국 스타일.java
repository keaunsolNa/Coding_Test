import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			double target = Double.parseDouble(temp[0]);
			String unit = temp[1];
			StringBuilder sb = new StringBuilder();
			switch(unit) {
				case "kg" : 
					target *= 2.2046;
					unit = "lb";
					break;
				case "lb" :
					target *= 0.4536;
					unit = "kg";
					break;
				case "l"  :
					target *= 0.2642;
					unit = "g";
					break;
				case "g"  :
					target *= 3.7854;
					unit = "l";
					break;
			}
			
			System.out.printf("%.4f", target);
			System.out.println(" " + unit);
		}
	}
}
