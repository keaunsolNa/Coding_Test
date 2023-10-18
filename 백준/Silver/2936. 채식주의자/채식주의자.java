import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());

		if(a + b == 0) {
			System.out.println("125.00 125.00");
			return;
		}
		
		double base = 250.0 * 250.0 / 2;
		
		if (a > 0 && b > 0) {
            System.out.println(String.format(a > b ? "0.00 %.2f":"%.2f 0.00", 250.0 - base / Math.max(a, b)));
            return;
        }

        if (a < 125 && b == 0) {
            double tmp = 250.0 - base / (250 - a);
            System.out.println(String.format("%.2f %.2f", tmp, 250.0 - tmp));
            return;
        }

        if (a == 0 && b < 125) {
            double tmp = 250.0 - base / (250 - b);
            System.out.println(String.format("%.2f %.2f", 250.0 - tmp, tmp));
            return;
        }

        if (b==0) {
            System.out.println(String.format("0.00 %.2f", base / a));
            return;
        }

        System.out.println(String.format("%.2f 0.00", base / b));
   }
}