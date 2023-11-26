import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String vega = "(100+1+|01)+";
		int t = Integer.parseInt(br.readLine());

		while(t --> 0) {
			
			String input = br.readLine();
			if(input.matches(vega)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
	
}
