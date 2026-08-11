import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cnt = 1;
		
		while(!(input = br.readLine()).contains("E")) {
			String[] temp = input.split(" ");
			boolean answer = true;
			
			switch(temp[1]) {
				case ">" : 
					answer = Integer.parseInt(temp[0]) > Integer.parseInt(temp[2]) ? true : false;  
					break;
				case ">=" : 
					answer = Integer.parseInt(temp[0]) >= Integer.parseInt(temp[2]) ? true : false;
					break;
				case "<" : 
					answer = Integer.parseInt(temp[0]) < Integer.parseInt(temp[2]) ? true : false;
					break;
				case "<=" : 
					answer = Integer.parseInt(temp[0]) <= Integer.parseInt(temp[2]) ? true : false;
					break;
				case "==" : 
					answer = Integer.parseInt(temp[0]) == Integer.parseInt(temp[2]) ? true : false;
					break;
				case "!=" : 
					answer = Integer.parseInt(temp[0]) != Integer.parseInt(temp[2]) ? true : false;
					break;
			}
			
			System.out.println("Case " + cnt + ": " + answer);
			cnt++;
		}
		
	}
}
