import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		double x = Integer.parseInt(st.nextToken());
		double y = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			String dir = st.nextToken();
			double move = Integer.parseInt(st.nextToken());
			switch(dir) {
				case "N" : y += move; break;
				case "NE" : y += Math.sqrt(move * move / 2); x += Math.sqrt(move * move / 2); break;
				case "E" : x += move; break;
				case "SE" : y -= Math.sqrt(move * move / 2); x += Math.sqrt(move * move / 2); break;
				case "S" : y -= move; break;
				case "SW" : y-= Math.sqrt(move * move / 2); x -= Math.sqrt(move * move / 2); break;
				case "W" : x -= move; break;
				case "NW" : y += Math.sqrt(move * move / 2); x -= Math.sqrt(move * move / 2); break;
			}
		}
				
		System.out.println(String.format("%.8f", x) + " " + String.format("%.8f", y));
		
	}
}
