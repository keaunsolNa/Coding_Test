import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			int page = Integer.parseInt(br.readLine());
			if(page == 0) break;
			boolean[] book = new boolean[page + 1];
			
			String[] input = br.readLine().split("\\,");
			for(int i = 0; i < input.length; i++) {

				if(!input[i].contains("-")) {
					if(Integer.parseInt(input[i]) < book.length)
						book[Integer.parseInt(input[i])] = true;

					continue;
				}
				
				int start = Integer.parseInt(input[i].split("-")[0]);
				int end = Integer.parseInt(input[i].split("-")[1]);
				
				if(start > end) continue;
				
				for(int j = start; j <= end; j++) 
					if(j < book.length) book[j] = true;
				
			}
			
			int cnt = 0;
			for (boolean chk : book) if(chk) cnt++;
			System.out.println(cnt);
		}
		
	}
}
