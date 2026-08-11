import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
        while ((input = br.readLine()) != null) {
        	
            String[] parts = input.split(" ");
            double R = Double.parseDouble(parts[0]);
            double S = Double.parseDouble(parts[1]);
            double result = Math.sqrt(R * (S + 0.16) / 0.067);
            
            DecimalFormat df = new DecimalFormat("#");
            df.setRoundingMode(RoundingMode.HALF_UP);
            System.out.println((Integer.toString((int)Math.round(result))));
            
        }		
	}
}
