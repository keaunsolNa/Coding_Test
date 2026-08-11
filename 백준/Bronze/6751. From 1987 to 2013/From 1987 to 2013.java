import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Y = Integer.parseInt(br.readLine());
		
		for(int i = Y + 1; ; i++) {

			String year = i + "";
			Set<Character> set = new HashSet<>();
			for(int j = 0; j < year.length(); j++) set.add(year.charAt(j));
			
			if(year.length() == set.size()) {
				System.out.println(year);
				return;
			}
		}
	}
}
