import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split("");
		List<String> strList = new ArrayList<>(Arrays.asList(strArr));
		

		for(int i = 0; i < strList.size(); i++) {
			String strTemp = strList.get(i);
			if(strTemp.equals("a") || strTemp.equals("e") || strTemp.equals("i") || 
					strTemp.equals("o") || strTemp.equals("u")) {
				strList.remove(i);
				strList.remove(i);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for (String string : strList) {
			sb.append(string);
		}
		
		System.out.println(sb);
		
	}
}
