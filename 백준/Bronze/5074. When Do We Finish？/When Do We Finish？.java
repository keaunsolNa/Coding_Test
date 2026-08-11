import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while(!(input = br.readLine()).equals("00:00 00:00")) {
			st = new StringTokenizer(input);
			
			String start = st.nextToken();
			String need = st.nextToken();
			
			int SH = Integer.parseInt(start.split(":")[0]);
			int SM = Integer.parseInt(start.split(":")[1]);
			
			int NH = Integer.parseInt(need.split(":")[0]);
			int NM = Integer.parseInt(need.split(":")[1]);
			
			int AM = (SM + NM) % 60;
			int AH = (SH + NH + ((SM + NM) / 60)) % 24;
			
			
			if(AH < 10) sb.append("0" + AH + ":");
			else sb.append(AH + ":");
			
			if(AM < 10) sb.append("0" + AM);
			else sb.append(AM);
			
			if((SH + NH + ((SM + NM) / 60)) / 23 > 0) sb.append(" +" +((SH + NH + ((SM + NM) / 60)) / 23));
			
			sb.append("\n");
			
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
