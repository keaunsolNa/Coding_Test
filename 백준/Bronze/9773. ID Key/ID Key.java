import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine().replaceAll(" ", "");
			if(input.length() != 13) continue;
			int one = 0;
			for(int j = 0; j < input.length(); j++) one += Character.getNumericValue(input.charAt(j));
			int two = Integer.parseInt(input.subSequence(input.length() - 3, input.length()) + "") * 10;
			
			String idKey = one + two + "";
			
			while(idKey.length() != 4) {
				
				if(idKey.length() < 4) idKey =  Integer.parseInt(idKey) + 1000 + "";
				else idKey = idKey.substring(idKey.length() - 4, idKey.length());
			}
			
			System.out.println(idKey);
			
		}
	}
}
