import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] splitM = input.split("-");
		
		int ans = 0;
		for(int i = 0; i < splitM.length; i++) {
			int sum  = 0;
			
			String[] splitPlus = splitM[i].split("\\+");
			
			for(int j = 0; j < splitPlus.length; j++) 
				sum += Integer.parseInt(splitPlus[j]);
			
			if(i == 0) ans += sum;
			else ans -= sum;
					
		}
		
		System.out.println(ans);
	}
}
