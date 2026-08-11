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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[R][C];
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < R; i++) {
			
			String input = br.readLine();
			String str = "";
			for(int j = 0; j < C; j++) {
				
				char temp = input.charAt(j);
				map[i][j] = temp;
				if(temp != '#') str += temp;
				else {
					
					if(str.length() > 1) strList.add(str);
					str = "";
				}
				
			}
			
			if(str.length() > 1) strList.add(str);
		}

		
		for(int i = 0; i < C; i++) {
			
			String str = "";
			for(int j = 0; j < R; j++) {
				
				if(map[j][i] != '#') str += map[j][i];
				else {
					
					if(str.length() > 1) strList.add(str);
					str = "";
				}
				
			}
		
			if(str.length() > 1) strList.add(str);
		}
		
		Collections.sort(strList);
		
		System.out.println(strList.get(0));
	}
}
