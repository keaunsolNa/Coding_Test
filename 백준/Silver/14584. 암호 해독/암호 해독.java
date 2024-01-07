import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] str = br.readLine().toCharArray();
		
		int n = Integer.parseInt(br.readLine());
		String[] list = new String[n];
		while(n --> 0) list[n] = br.readLine();

		
		int term = 1;
		while(true) {
		
			StringBuilder in = new StringBuilder();
			for(int i = 0; i < str.length; i++) {
				if(str[i] + term > 122) str[i] = (char)(str[i] + term - 26);
				else str[i] = (char)(str[i] + term);
				in.append(str[i]);
			}
			
			term++;
			
			for(int i = 0; i < list.length; i++) {
				
				if(in.toString().contains(list[i])) {
					System.out.println(in);
					return;
				}
			}
			
		}
		
	
	}

}