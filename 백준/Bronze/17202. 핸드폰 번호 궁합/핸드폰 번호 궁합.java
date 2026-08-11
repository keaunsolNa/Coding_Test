import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String two = br.readLine();
		String result = "";
		
		for(int i = 0; i < one.length(); i++) {
			result += one.charAt(i);
			result += two.charAt(i);
		}
		
		while(result.length() != 2) {
			String temp = "";
			for(int i = 0; i < result.length() - 1; i++) {
				String str = (Integer.parseInt(result.charAt(i)+"") + Integer.parseInt(result.charAt(i+1)+"") +"");
				temp += str.charAt(str.length()-1);
			}
			result = temp;
		}
		
		System.out.println(result);
    }
}
