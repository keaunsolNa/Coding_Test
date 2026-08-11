import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
				case 'E' : sb.append('I'); break;
				case 'S' : sb.append('N'); break;
				case 'T' : sb.append('F'); break;
				case 'J' : sb.append('P'); break;
				case 'I' : sb.append('E'); break;
				case 'N' : sb.append('S'); break;
				case 'F' : sb.append('T'); break;
				case 'P' : sb.append('J'); break;
			}
		}
		
		System.out.println(sb);
	}
}
