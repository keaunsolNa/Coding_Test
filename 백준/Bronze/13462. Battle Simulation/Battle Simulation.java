import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		input = input.replaceAll("RBL|RLB|BRL|BLR|LRB|LBR", "C");
		for(int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i)) {
				case 'R' : sb.append("S"); break;
				case 'B' : sb.append("K"); break;
				case 'L' : sb.append("H"); break;
				default : sb.append("C"); break;
			}
		}
		
		System.out.print(sb);
	}
}
