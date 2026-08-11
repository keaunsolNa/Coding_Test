import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String input = br.readLine();
			String newStr = "";
			int idx = 1;
			
			for(int i = input.length() - 1; i >= 0; i--) {
				
				if(idx % 2 == 0) {
					int temp = Character.getNumericValue(input.charAt(i)) * 2;
					
					if(temp >= 10) 
						temp = Character.getNumericValue((temp+"").charAt(0)) + Character.getNumericValue((temp+"").charAt(1));
					
					newStr = newStr + temp;
					
				} else 
					newStr = newStr + input.charAt(i);
				
				idx++;
			}
			
			int sum = 0;
			for(int i = 0; i < newStr.length(); i++) 
				sum += Character.getNumericValue(newStr.charAt(i));
			
			
			if(sum % 10 == 0) System.out.println("T");
			else System.out.println("F");
		}
	}
}
