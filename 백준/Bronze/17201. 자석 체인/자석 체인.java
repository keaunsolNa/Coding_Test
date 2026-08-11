import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		boolean flag = true;
		
		for(int i = 1; i < input.length() - 1; i += 2) {
			if(input.charAt(i) == input.charAt(i+1)) {
				flag = false;
				break;
			}
		}


		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
