import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String[] input = br.readLine().split(" ");
			double price = Double.parseDouble(input[0]);
			char dot = input[1].charAt(0);
			char cupon = input[2].charAt(0);
			char pay = input[3].charAt(0);
			
			switch(dot) {
			
				case 'R' : price *= 0.55; break;
				case 'G' : price *= 0.70; break;
				case 'B' : price *= 0.80; break;
				case 'Y' : price *= 0.85; break;
				case 'O' : price *= 0.90; break;
				case 'W' : price *= 0.95; break;
				
			}
			
			if(cupon == 'C') price *= 0.95;
			
			if(pay == 'C') {
				
				if(price * 100 % 10 < 6) price = Math.floor(price * 10) / 10.0;
				else price = Math.ceil(price * 10) / 10.0;
				
			} 
			
			
			String ans = String.format("%.2f", price);
			sb.append("$" + ans + "\n");
			
		}
		System.out.println(sb);
	}
}
