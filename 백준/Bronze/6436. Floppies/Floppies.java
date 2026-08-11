import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		final int fileSize = 1860000;
		
		int cnt = 1;
		while(true) {
			long input = Long.parseLong(br.readLine());
			
			if(input == 0) break;
			
			if(input % 2 == 0) input /= 2;
			else input = (input + 1) / 2;
			
			input += input / 2;
			sb.append("File #" + cnt + "\n");
			sb.append("John needs " + ((input + fileSize - 1) / fileSize) + " floppies." + "\n");
			
			sb.append("\n");
			
			cnt++;
		}
		
		System.out.print(sb);
	}
}
