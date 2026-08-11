import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			
			if(temp[0].equals("Simon") && temp[1].equals("says")) {
				StringBuilder sb =  new StringBuilder();
				for(int j = 2; j < temp.length; j++) {
					sb.append(" " + temp[j]);
				}
				
				System.out.println(sb);
			}
		}
	}
}
