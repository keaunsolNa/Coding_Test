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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArr = br.readLine().split(" ");
		String phone = br.readLine();
		String temp = "";
		
		int match = 0;
		for(int i = 0; i < inputArr.length; i++) {
			if(!inputArr[i].equals(phone)) {
				
				for(int j = 0; j < inputArr[i].length(); j++) {
					
					if(inputArr[i].substring(0, j+1).equals(phone)) {
						match++;
						break;
					}
				}
			}
		}
		
		System.out.println(match);
	}
}
