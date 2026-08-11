import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	static Integer[] point;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alp = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		String joonmin = br.readLine();
		String her = br.readLine();
		
		String point = "";
		for(int i = 0; i < joonmin.length(); i++) {
			point += alp[(joonmin.charAt(i) - 'A')];
			point += alp[(her.charAt(i) - 'A')];
		}
		
		while(point.length() != 2) {
			String temp = "";
			for(int i = 0; i < point.length() - 1; i++) {
				int temp2 = 0;
				
				temp2 += Character.getNumericValue(point.charAt(i));
				
				if(i < point.length() - 1) {
					
					temp2 += Character.getNumericValue(point.charAt(i + 1));
				}
				
				if(temp2 > 9) {
					temp += (temp2+"").charAt(1);
				} else {
					temp += temp2+"";
				}
			}
			point = temp;
			
		}
		
		System.out.println(point);
		
	}
}
