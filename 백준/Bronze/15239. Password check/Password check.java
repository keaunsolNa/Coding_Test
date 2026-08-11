import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			boolean flag = false;
			int length = Integer.parseInt(br.readLine());
			String str = br.readLine();
			
			if(length >= 12) {
				
				if(!str.equals(str.toUpperCase())) {
					
					if(!str.equals(str.toLowerCase())) {
						
						if(!str.equals(str.replaceAll("[0-9]", ""))) {
							
							if(!str.equals(str.replaceAll("[+_)(*&^%$#@!./,;{}]", ""))) {
								
								flag = true;
							}
						}
					}
				}
			}
			
			if(flag) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");
			}
		}
	}
}
