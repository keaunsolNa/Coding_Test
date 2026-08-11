import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while(!(input = br.readLine()).equals("#")) {

			for(int i = 0; i < input.length(); i++) {
				boolean flag = false;
				char temp = input.charAt(0);
				input = input.substring(1);
				switch(temp) {	
					case 'a' : 
						input = temp + input; 
						flag = true;
						break;
					case 'e' : 
						input = temp + input; 
						flag = true;
						break;
					case 'i' : 
						input = temp + input ; 
						flag = true;
						break;
					case 'o' : 
						input = temp + input; 
						flag = true;
						break;
					case 'u' : 
						input = temp + input; 
						flag = true;
						break;
					default : input = input +temp; break;
				}
			
				if(flag) break;
			}
			System.out.println(input + "ay");
		}
		
	}
}
