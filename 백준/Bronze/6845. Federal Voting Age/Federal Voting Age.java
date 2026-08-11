import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String[] birth = br.readLine().split(" ");
			
			int year = Integer.parseInt(birth[0]);
			int month = Integer.parseInt(birth[1]);
			int day = Integer.parseInt(birth[2]);
			
			boolean chk = true;
			if(year == 1989) {
				
				if(month <= 2) {
					
					if(day > 27) chk = false;
					
				} else chk = false;
				
			}  else if(year > 1989) chk = false;
			
			if(chk) sb.append("Yes");
			else sb.append("No");
			
			sb.append("\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
