import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int ans = 0;
		
		while(N != "0") {
			
			if(N.contains("1")) {
				if(N.equals("1")) {
					ans++;
					break;
				}
				else 
					N = Integer.parseInt(N.replaceFirst("1", "")) + "";
				
					if(N.equals("0")) {
						ans++; break;
					}
			} else 
				N = (Integer.parseInt(N) - 1) + "";
			
			ans++;
		}
		
		System.out.println(ans);
	}
}
