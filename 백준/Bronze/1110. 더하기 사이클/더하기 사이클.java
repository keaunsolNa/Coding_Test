import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test13();
	}

	public static void test13() {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		if(a.length() == 1) {
			a = a + "0";
		}
		
		int origin = Integer.parseInt(a);
		int cnt = 0;
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		
		while(1 == 1) {
			temp1 = Character.getNumericValue(a.charAt(a.length() - 1));
			
			for(int i = 0; i < a.length(); i++) {
				temp2 += Character.getNumericValue(a.charAt(i));
			}
			
			temp2 = Character.getNumericValue((temp2+"").charAt((temp2+"").length() - 1));
			temp3 = Integer.parseInt(temp1 + "" +  temp2);
			cnt++;
			
			a = temp3 +"";
			temp1 = 0; 
			temp2 = 0;
			if(a.equals(origin + "")) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
